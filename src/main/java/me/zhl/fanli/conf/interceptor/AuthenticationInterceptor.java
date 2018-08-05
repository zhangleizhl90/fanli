package me.zhl.fanli.conf.interceptor;

import me.zhl.fanli.anotation.LoginRequired;
import me.zhl.fanli.entity.User;
import me.zhl.fanli.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

import static me.zhl.fanli.constant.Constants.CURRENT_USER;


public class AuthenticationInterceptor extends HandlerInterceptorAdapter {

    private static final String AUTHORIZATION = "Authorization";

    @Autowired
    private LoginService mLoginService;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!handler.getClass().isAssignableFrom(HandlerMethod.class)) {
            return true;
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();

        LoginRequired loginRequired = method.getAnnotation(LoginRequired.class);
        if (loginRequired == null) {
            return true;
        }

        String loginToken = request.getHeader(AUTHORIZATION);
        User user = mLoginService.login(loginToken);
        request.setAttribute(CURRENT_USER, user);
        return true;
    }
}
