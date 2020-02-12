package com.bhhan.springsecurity.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by hbh5274@gmail.com on 2020-02-12
 * Github : http://github.com/bhhan5274
 */

@Controller
public class UserController {
    @GetMapping("/login")
    public String getLogin(){
        return "/login";
    }

    @GetMapping("/user")
    public String user(){
        return "/user";
    }

    @GetMapping("/admin")
    public String admin(){
        return "/admin";
    }
}
