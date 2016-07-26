package com.hpe.ddc.framework.business.impl;

import com.hpe.ddc.framework.dao.TPersistentLoginsDAO;
import com.hpe.ddc.framework.model.TPersistentLogins;
import com.hpe.ddc.framework.model.TPersistentLoginsCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by duxi on 2016/7/26.
 */
@Service
public class PersistentTokenBusinessImpl implements PersistentTokenRepository {
    @Autowired
    private TPersistentLoginsDAO tPersistentLoginsDAO;

    @Override
    public void createNewToken(PersistentRememberMeToken token) {
        TPersistentLogins tPersistentLogins = new TPersistentLogins();
        tPersistentLogins.setUsername(token.getUsername());
        tPersistentLogins.setLastUsed(token.getDate());
        tPersistentLogins.setSeries(token.getSeries());
        tPersistentLogins.setToken(token.getTokenValue());
        tPersistentLoginsDAO.insert(tPersistentLogins);
    }

    @Override
    public void updateToken(String series, String tokenValue, Date lastUsed) {
        TPersistentLogins tPersistentLogins = tPersistentLoginsDAO.selectByPrimaryKey(series);
        if (null != tPersistentLogins) {
            tPersistentLogins.setToken(tokenValue);
            tPersistentLogins.setLastUsed(lastUsed);
            tPersistentLoginsDAO.updateByPrimaryKey(tPersistentLogins);
        }
    }

    @Override
    public PersistentRememberMeToken getTokenForSeries(String seriesId) {
        TPersistentLogins tPersistentLogins = tPersistentLoginsDAO.selectByPrimaryKey(seriesId);
        if (null == tPersistentLogins) {
            return null;
        } else {
            return new PersistentRememberMeToken(tPersistentLogins.getUsername(), tPersistentLogins.getSeries(),
                    tPersistentLogins.getToken(), tPersistentLogins.getLastUsed());
        }
    }

    @Override
    public void removeUserTokens(String username) {
        TPersistentLoginsCriteria tPersistentLoginsCriteria = new TPersistentLoginsCriteria();
        TPersistentLoginsCriteria.Criteria criteria = tPersistentLoginsCriteria.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<TPersistentLogins> listTPersistentLogins = tPersistentLoginsDAO.selectByCriteria(tPersistentLoginsCriteria);
        if ((null!=listTPersistentLogins) && (!listTPersistentLogins.isEmpty())) {
            for (TPersistentLogins tPersistentLogins: listTPersistentLogins) {
                tPersistentLoginsDAO.deleteByPrimaryKey(tPersistentLogins.getSeries());
            }
        }

    }
}
