package me.zhl.fanli.conf;

import me.zhl.fanli.exception.LoginFailedException;
import me.zhl.fanli.exception.RegisterFailedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final String RES_CODE = "resCode";
    private static final String RES_MSG = "resMsg";

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map errorHandler(Exception e) {
        Map<String, String> map = new HashMap<>(2);
        map.put(RES_CODE, "E001");
        map.put(RES_MSG, e.getMessage());
        return map;
    }

    @ResponseBody
    @ExceptionHandler(value = RegisterFailedException.class)
    public Map registerFailedErrorHandler(RegisterFailedException e) {
        Map<String, String> map = new HashMap<>(2);
        map.put(RES_CODE, "E002");
        map.put(RES_MSG, "注册失败");
        return map;
    }

    @ResponseBody
    @ExceptionHandler(value = LoginFailedException.class)
    public Map loginFailedErrorHandler(LoginFailedException e) {
        Map<String, String> map = new HashMap<>(2);
        map.put(RES_CODE, "E003");
        map.put(RES_MSG, "登陆失败");
        return map;
    }
}
