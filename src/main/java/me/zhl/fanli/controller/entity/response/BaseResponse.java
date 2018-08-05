package me.zhl.fanli.controller.entity.response;

public class BaseResponse {
    private String resCode = "00";
    private String resMsg = "请求成功";

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }
}
