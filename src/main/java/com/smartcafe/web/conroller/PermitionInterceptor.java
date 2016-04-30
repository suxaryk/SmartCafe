package com.smartcafe.web.conroller;


import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PermitionInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (request.isUserInRole("ROLE_USER")){
            response.sendRedirect("/table");
        }

        return true;
    }
}
