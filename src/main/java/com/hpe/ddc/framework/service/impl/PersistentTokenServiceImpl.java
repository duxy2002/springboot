package com.hpe.ddc.framework.service.impl;

import com.hpe.ddc.framework.business.impl.PersistentTokenBusinessImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by duxi on 2016/7/26.
 */
@Service
public class PersistentTokenServiceImpl implements PersistentTokenRepository {
    @Autowired
    private PersistentTokenBusinessImpl persistentTokenBusiness;

    @Override
    @Transactional
    public void createNewToken(PersistentRememberMeToken token) {
        persistentTokenBusiness.createNewToken(token);
    }

    @Override
    @Transactional
    public void updateToken(String series, String tokenValue, Date lastUsed) {
        persistentTokenBusiness.updateToken(series,tokenValue,lastUsed);
    }

    @Override
    public PersistentRememberMeToken getTokenForSeries(String seriesId) {
        return persistentTokenBusiness.getTokenForSeries(seriesId);
    }

    @Override
    @Transactional
    public void removeUserTokens(String username) {
        persistentTokenBusiness.removeUserTokens(username);
    }
}
