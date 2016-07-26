package com.hpe.ddc.framework.service.impl;

import com.hpe.ddc.framework.business.IUserDetailsBusiness;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by duxi on 2016/7/25.
 */
@Slf4j
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private IUserDetailsBusiness userDetailsBusiness;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (StringUtils.isEmpty(username)) {
            log.error("username is empty");
            throw new UsernameNotFoundException("username is empty");
        }
        UserDetails userDetails= userDetailsBusiness.loadUserByUsername(username);
        if (null == userDetails) {
            log.error("username is not found");
            throw new UsernameNotFoundException("username is not found");
        }
        return userDetails;
    }
}
