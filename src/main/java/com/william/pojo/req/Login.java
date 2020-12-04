package com.william.pojo.req;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2019/11/13 14:09
 * @since Copyright(c) 爱睿智健康科技
 */
public class Login {

    private String username;
    private String password;
    private String code;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
