package com.bhhan.springsecurity.web;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * Created by hbh5274@gmail.com on 2020-02-12
 * Github : http://github.com/bhhan5274
 */

@ControllerAdvice
public class BaseController {
    @ModelAttribute
    public void userAuthority(@AuthenticationPrincipal User user, Model model, HttpServletRequest request) {
        if (Objects.nonNull(user)) {
            user.getAuthorities().forEach(a -> {
                model.addAttribute(a.getAuthority(), a.getAuthority());
            });
            model.addAttribute("isAuthenticated", true);
        } else {
            model.addAttribute("isAnonymous", true);
        }
    }
}
