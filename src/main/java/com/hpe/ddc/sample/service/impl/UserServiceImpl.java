package com.hpe.ddc.sample.service.impl;

import com.hpe.ddc.framework.model.TUser;
import com.hpe.ddc.sample.business.IUserBusiness;
import com.hpe.ddc.sample.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by duxi on 2016/7/22.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserBusiness userBusiness;
    @Override
    public List<TUser> getUsersInfo() {
        return userBusiness.getUsersInfo();
    }
}
