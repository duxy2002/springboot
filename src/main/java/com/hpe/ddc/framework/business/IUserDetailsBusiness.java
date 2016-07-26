package com.hpe.ddc.framework.business;

import org.springframework.security.core.userdetails.UserDetails;

/**
 * Created by duxi on 2016/7/25.
 */
public interface IUserDetailsBusiness {
    UserDetails loadUserByUsername(String username);
}
