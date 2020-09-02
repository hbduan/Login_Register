package com.duan.login_duan.domain;

import lombok.Data;

/**
 * @创建人 Missbear
 * @创建时间 2018.9.28
 * @描述
 */
@Data
public class UserBean {
    private String id;
    private String userName;
    private String password;
    private String Adrress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
