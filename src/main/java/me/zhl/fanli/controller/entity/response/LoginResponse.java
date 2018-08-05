package me.zhl.fanli.controller.entity.response;

public class LoginResponse extends BaseResponse {
    private String loginToken;

    public String getLoginToken() {
        return loginToken;
    }

    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }
}
