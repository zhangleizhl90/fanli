package me.zhl.fanli.controller;

import me.zhl.fanli.entity.User;
import me.zhl.fanli.entity.request.LoginPasswordRequest;
import me.zhl.fanli.entity.response.LoginResponse;
import me.zhl.fanli.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/password")
    public LoginResponse loginByPassword(@RequestBody LoginPasswordRequest request) {
        LoginResponse loginResponse = new LoginResponse();
        User user = loginService.login(request.getUsername(), request.getPassword());
        loginResponse.setUser(user);
        return loginResponse;
    }
}
