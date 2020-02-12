package com.bhhan.springsecurity.security;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandlerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by hbh5274@gmail.com on 2020-02-12
 * Github : http://github.com/bhhan5274
 */
public class CustomAccessDeniedHandler extends AccessDeniedHandlerImpl {
    private String errorPage;
    private final String defaultErrorPage = "/";

    public CustomAccessDeniedHandler() {
        errorPage = defaultErrorPage;
    }

    public CustomAccessDeniedHandler(String errorPage) {
        this.errorPage = errorPage;
    }

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        setErrorPage(errorPage);
        super.handle(request, response, accessDeniedException);
    }
}
