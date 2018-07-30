package me.zhl.fanli.entity.response;

import me.zhl.fanli.entity.User;

public class LoginResponse extends BaseResponse {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
