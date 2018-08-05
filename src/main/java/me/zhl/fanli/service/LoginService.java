package me.zhl.fanli.service;

import me.zhl.fanli.entity.User;
import me.zhl.fanli.exception.LoginFailedException;

public interface LoginService {
    String login(String username, String password) throws LoginFailedException;

    User login(String loginToken) throws LoginFailedException;

    String generateLoginToken(User user);
}
