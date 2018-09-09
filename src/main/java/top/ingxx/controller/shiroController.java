package top.ingxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/shiro")
public class shiroController {


    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }

}
