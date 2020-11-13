package com.jkvk.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 张晖
 * @Date: 2020/11/13-10:41
 * @Description: com.jkvk.jenkins.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/index")
    public String index() {
        return "Hi all, this is greet from jenkins by git:" + System.currentTimeMillis();
    }
}
