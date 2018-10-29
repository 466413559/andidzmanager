package com.andidz.authorithy.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userInfo")
public class UserController {
    /**
     * 用户查询.
     * @return
     */
    @RequestMapping("/create")
    public String userInfo(){
        return "/UserInfo";
    }
    /**
     * 用户添加;
     * @return
     */


    @RequestMapping("/insert")
    public String userInfoAdd(){
        return "/UserInfoAdd";
    }

    /**
     * 用户删除;
     * @return
     */

    @RequestMapping("/update")
    public String userDel(){
        return "/UserInfoDel";
    }
}