package me.zhl.fanli.conf.interceptor;

import me.zhl.fanli.anotation.LoginRequired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginIntercepter extends HandlerInterceptorAdapter {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!handler.getClass().isAssignableFrom(HandlerMethod.class)) {
            return true;
        }

        LoginRequired loginRequired = ((HandlerMethod) handler).getMethod().getAnnotation(LoginRequired.class);
        if (loginRequired == null) {
            return true;
        }

        String loginToken = request.getHeader("Authorization");
        return false;
    }
}
