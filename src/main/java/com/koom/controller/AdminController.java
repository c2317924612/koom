package com.koom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName AdminController
 * @Description TODO
 * @Author 0Glass
 * @Date 2020/04/30 14:42
 * @Version 1.0
 */
@Controller
@RequestMapping("/KAdmin")
public class AdminController {


    @RequestMapping("/login.action")
    private String toAdmin(){
        return "login";
    }

}
