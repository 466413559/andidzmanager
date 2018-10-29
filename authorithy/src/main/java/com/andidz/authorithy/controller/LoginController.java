package com.andidz.authorithy.controller;

import com.andidz.authorithy.domain.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping(value="/userlogin")
    public String userLogin(Model model, User user, HttpServletResponse response){
        if(user==null){return "login";}
        String username=user.getUsername();
        String password=user.getPassword();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password,false);
        Subject subject = SecurityUtils.getSubject();
        try {
            System.out.println("subject开始执行");
            subject.login(token);
            System.out.println("subject执行结束");
        } catch(IncorrectCredentialsException e){
            model.addAttribute("message", "密码错误");
            return "login";
        } catch (AuthenticationException e) {
            model.addAttribute("message", "登录失败");
            return "login";
        }catch (Exception e){
            return "login";
        }
        return "index";
    }

    //配合shiro配置中的默认访问url
    @RequestMapping("/login")
    public String getLogin( Model model, HttpSession session, HttpServletResponse response){
        return "login";
    }


    /**
     * 退出
     * @return
     */
    @RequestMapping(value="logout",method =RequestMethod.GET)
    public String logout(HttpServletRequest request){

        //subject的实现类DelegatingSubject的logout方法，将本subject对象的session清空了
        //即使session托管给了redis ，redis有很多个浏览器的session
        //只要调用退出方法，此subject的、此浏览器的session就没了
        try {
            //退出
            SecurityUtils.getSubject().logout();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return "login";

    }

    @RequestMapping(value="403")
    public String unAuth(){

        return "403";
    }

}
