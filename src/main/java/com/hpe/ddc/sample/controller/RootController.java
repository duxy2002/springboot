package com.hpe.ddc.sample.controller;

import com.hpe.ddc.sample.model.Counter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by duxi on 2016/7/20.
 */
@Slf4j
@Controller
public class RootController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        log.debug("index");
        return "index";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(Model model) {
        log.info("test: {}","OK");
        Counter counter = new Counter();
        counter.setId(1);
        counter.setTitle("title");
        counter.setCount(0);
        model.addAttribute("db", counter);

        return "test";
    }
}
