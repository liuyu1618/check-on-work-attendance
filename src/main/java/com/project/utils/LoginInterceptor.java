package com.project.utils;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Description
 * 登陆拦截器
 * @Author：阿牛
 * @Date：Created in 2023/9/13 16:43
 */
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 预处理 ，在执行controller方法前执行，与用户用户登陆校验
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        String url = request.getRequestURI();
        if (url.contains("swagger")){
            return true;
        }

        if (url.contains("login")){
            return true;
        }
        if (session.getAttribute("username") != null){
            return true;
        }
        request.getRequestDispatcher("/WEB-INF/login.html").forward(request, response);
        //如果返回false表示拦截不继续执行handler，如果返回true表示放行
        return false;
    }
}
