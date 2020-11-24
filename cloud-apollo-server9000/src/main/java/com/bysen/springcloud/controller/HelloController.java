package com.bysen.springcloud.controller;

/**
 * @ClassName HelloController
 * @Author Bysen
 * @Date 2020/10/25 19:59
 * @Description TODO
 * @Version 1.0
 **/
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${test:apollo}")
    private String hello;

    @RequestMapping("/helloApollo")
    @ResponseBody
    public String sayApollo(){
        return "hello "+hello;
    }

}
