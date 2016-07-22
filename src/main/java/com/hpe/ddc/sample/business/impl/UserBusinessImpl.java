package com.hpe.ddc.sample.business.impl;

import com.hpe.ddc.framework.dao.TUserDAO;
import com.hpe.ddc.framework.model.TUser;
import com.hpe.ddc.framework.model.TUserCriteria;
import com.hpe.ddc.sample.business.IUserBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by duxi on 2016/7/22.
 */
@Service
public class UserBusinessImpl implements IUserBusiness {
    @Autowired
    private TUserDAO tUserDAO;

    @Override
    public List<TUser> getUsersInfo() {
        TUserCriteria tUserCriteria = new TUserCriteria();
        TUserCriteria.Criteria criteria = tUserCriteria.createCriteria();
        List<TUser> listUsers = tUserDAO.selectByCriteria(tUserCriteria);
        return listUsers;
    }
}
