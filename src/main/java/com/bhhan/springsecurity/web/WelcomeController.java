package com.bhhan.springsecurity.web;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by hbh5274@gmail.com on 2020-02-12
 * Github : http://github.com/bhhan5274
 */

@Controller
@RequestMapping("/")
public class WelcomeController {

    @GetMapping
    public String welcome(HttpServletRequest request, Model model) {
        final AccessDeniedException exception = (AccessDeniedException) request.getAttribute("SPRING_SECURITY_403_EXCEPTION");
        return "/index";
    }
}
