package com.sml.xcx.common;


public enum CodeEnum {

    /**
     * 服务端系统级固定响应码
     */
    code8200(200, 8200, "执行成功"),
    code8999(500, 8999, "服务器错误"),

    code10010(500, 10010, "登录失败,密码错误");


    /**
     * 对应的httpcode，参照用
     */
    private int httpCode;

    /**
     * 业务code
     */
    private int code;

    /**
     * 描述信息
     */
    private String desc;

    CodeEnum(int httpCode, int code, String desc) {
        this.httpCode = httpCode;
        this.code = code;
        this.desc = desc;
    }

    public static boolean isSuccess(int code) {
        if (code == code8200.getCode()) {
            return true;
        }
        return false;
    }

    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static int getHttpCodeByCode(int code) {
        CodeEnum[] codes = CodeEnum.values();
        for (CodeEnum c : codes) {
            if (c.getCode() == code) {
                return c.getHttpCode();
            }
        }
        return CodeEnum.code8999.httpCode;
    }
}
