package com.wdx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: myworklab
 * @description:
 * @author: wdx
 * @create: 2020-06-15 16:02
 **/
@RestController
@RequestMapping("/hello-wdx-wts")
public class TestController {
    @RequestMapping("/h")
    public  String gettest(){
        return "hello";
    }
}
