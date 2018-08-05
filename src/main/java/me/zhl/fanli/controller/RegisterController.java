package me.zhl.fanli.controller;

import me.zhl.fanli.controller.entity.request.RegisterPasswordRequest;
import me.zhl.fanli.controller.entity.response.LoginResponse;
import me.zhl.fanli.entity.User;
import me.zhl.fanli.exception.RegisterFailedException;
import me.zhl.fanli.service.LoginService;
import me.zhl.fanli.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {

    private LoginService mLoginService;

    private RegisterService mRegisterService;

    @Autowired
    public RegisterController(LoginService loginService,
                              RegisterService registerService) {
        mLoginService = loginService;
        mRegisterService = registerService;
    }

    @PostMapping("/password")
    public LoginResponse registerByPassword(@RequestBody RegisterPasswordRequest request) throws Exception {
        LoginResponse loginResponse = new LoginResponse();
        User user =
                mRegisterService.registerByPassword(request.getUsername(), request.getPassword());
        if (user == null) {
            throw new RegisterFailedException();
        }
        String loginToken = mLoginService.generateLoginToken(user);
        loginResponse.setLoginToken(loginToken);
        return loginResponse;
    }

}
