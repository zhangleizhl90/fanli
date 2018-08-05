package me.zhl.fanli.service;

import me.zhl.fanli.entity.User;
import org.springframework.lang.Nullable;

public interface RegisterService {
    @Nullable
    User registerByPassword(String username, String password);
}
