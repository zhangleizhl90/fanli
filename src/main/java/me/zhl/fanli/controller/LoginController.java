package me.zhl.fanli.controller;

import me.zhl.fanli.controller.entity.request.LoginPasswordRequest;
import me.zhl.fanli.controller.entity.response.LoginResponse;
import me.zhl.fanli.exception.LoginFailedException;
import me.zhl.fanli.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    private LoginService mLoginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.mLoginService = loginService;
    }

    @PostMapping("/password")
    public LoginResponse loginByPassword(@RequestBody LoginPasswordRequest request) throws LoginFailedException {
        LoginResponse loginResponse = new LoginResponse();
        String loginToken = mLoginService.login(request.getUsername(), request.getPassword());
        loginResponse.setLoginToken(loginToken);
        return loginResponse;
    }
}
