package com.hpe.ddc.framework.session;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 监听Session的创建与销毁
 * Created by duxi on 2016/7/27.
 */
@Slf4j
@WebListener
public class SampleHttpSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("Session 被创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("ServletContex初始化");
    }

}
