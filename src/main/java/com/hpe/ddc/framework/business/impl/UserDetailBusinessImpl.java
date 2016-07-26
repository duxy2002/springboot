package com.hpe.ddc.framework.business.impl;

import com.hpe.ddc.framework.business.IUserDetailsBusiness;
import com.hpe.ddc.framework.dao.TRoleDAO;
import com.hpe.ddc.framework.dao.TUserDAO;
import com.hpe.ddc.framework.dao.TUserRoleMapDAO;
import com.hpe.ddc.framework.dto.impl.SpringSecurityUserDetails;
import com.hpe.ddc.framework.model.*;
import com.hpe.ddc.sample.business.IUserBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duxi on 2016/7/25.
 */
@Service
public class UserDetailBusinessImpl implements IUserDetailsBusiness {
    @Autowired
    private TUserDAO tUserDAO;

    @Autowired
    private TUserRoleMapDAO tUserRoleMapDAO;

    @Autowired
    private TRoleDAO tRoleDAO;

    @Override
    public UserDetails loadUserByUsername(String username) {
        SpringSecurityUserDetails userDetails = new SpringSecurityUserDetails();

        TUserCriteria tUserCriteria = new TUserCriteria();
        TUserCriteria.Criteria tUserCriteriaCriteria = tUserCriteria.createCriteria();
        tUserCriteriaCriteria.andLoginNameEqualTo(username);
        List<TUser> listUsers = tUserDAO.selectByCriteria(tUserCriteria);
        if ((null==listUsers) || (listUsers.isEmpty())) {
            return null;
        }
        TUser tUser = listUsers.get(0);
        userDetails.setDisplayName(tUser.getName());
        userDetails.setPassword(tUser.getPassword());
        userDetails.setUserId(Integer.parseInt(String.valueOf(tUser.getUserId())));
        userDetails.setUsername(tUser.getLoginName());

        TUserRoleMapCriteria tUserRoleMapCriteria = new TUserRoleMapCriteria();
        TUserRoleMapCriteria.Criteria tUserRoleMapCriteriaCriteria  = tUserRoleMapCriteria.createCriteria();
        tUserRoleMapCriteriaCriteria.andUserIdEqualTo(tUser.getUserId());
        List<TUserRoleMap> listUserRoleMap = tUserRoleMapDAO.selectByCriteria(tUserRoleMapCriteria);

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        for (TUserRoleMap tUserRoleMap: listUserRoleMap) {
            TRoleCriteria tRoleCriteria = new TRoleCriteria();
            TRoleCriteria.Criteria criteria = tRoleCriteria.createCriteria();
            criteria.andRoleIdEqualTo(tUserRoleMap.getRoleId());
            List<TRole> listRoles = tRoleDAO.selectByCriteria(tRoleCriteria);
            TRole tRole=listRoles.get(0);
            authorities.add(new SimpleGrantedAuthority(tRole.getName()));
        }
        userDetails.setAuthorities(authorities);
        return userDetails;
    }
}
