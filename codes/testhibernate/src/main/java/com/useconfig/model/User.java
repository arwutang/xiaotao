package com.useconfig.model;

import java.util.Date;


public class User {
    private Integer id;

    private String username;

    private String password;

    private Date registerDatetime;

    private Date lastLoginDatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Date getRegisterDatetime() {
        return registerDatetime;
    }

    public void setRegisterDatetime(Date registerDatetime) {
        this.registerDatetime = registerDatetime;
    }

    public Date getLastLoginDatetime() {
        return lastLoginDatetime;
    }

    public void setLastLoginDatetime(Date lastLoginDatetime) {
        this.lastLoginDatetime = lastLoginDatetime;
    }

    public User() {

    }

    public User(String username, String password, Date registerDatetime) {
        this.username = username;
        this.password = password;
        this.registerDatetime = registerDatetime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", registerDatetime=" + registerDatetime +
                ", lastLoginDatetime=" + lastLoginDatetime +
                '}';
    }
}
