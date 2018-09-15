package top.ingxx.controller;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("shiro")
public class shiroController {

    Logger logger = Logger.getLogger(this.getClass());
    @RequestMapping("login")
    public String login(){
        return  "login";
    }

    @RequestMapping("logout")
    public String logout(){
        return "logout";
    }

    @RequestMapping(value = "checkLogin",method = RequestMethod.POST)
    public String checkLogin(@RequestParam(value = "userName") String userName,@RequestParam(value="passWord") String passWord){
        //实例化token
        UsernamePasswordToken token = new UsernamePasswordToken(userName,passWord);
        //获取subject对象
        Subject subject = SecurityUtils.getSubject();
        try {
            //登陆方法会调用Realm
            subject.login(token);
        }catch (Exception e){
            e.printStackTrace();
            return "用户名密码错误";
        }
        logger.debug("登陆成功");
        return "index";
    }
}
