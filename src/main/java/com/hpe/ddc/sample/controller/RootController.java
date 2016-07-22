package com.hpe.ddc.sample.controller;

import com.hpe.ddc.framework.model.TUser;
import com.hpe.ddc.sample.model.Counter;
import com.hpe.ddc.sample.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by duxi on 2016/7/20.
 */
@Slf4j
@Controller
public class RootController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        log.debug("index");
        return "index";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(Model model) {
        List<TUser> listUsers = userService.getUsersInfo();

        if (!ObjectUtils.isEmpty(listUsers)) {
            Counter counter = new Counter();
            TUser tUser = listUsers.get(0);
            counter.setId(tUser.getUserId());
            counter.setTitle(tUser.getName());
            counter.setCount(0);
            model.addAttribute("db", counter);
        }
        return "test";
    }
}
