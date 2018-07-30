package me.zhl.fanli.service;

import me.zhl.fanli.entity.User;

public interface LoginService {
    User login(String username, String password);
}
