package com.useconfig.model;


import java.util.Date;

public class Order {
    private Integer id;

    private Integer userId;

    private Date createDatetime;

    private Date updateDatetime;

    private Integer status;

    private String description;

    private User user;

    public Order() {
    }

    public Order(Integer userId, String description) {
        this.userId = userId;
        this.description = description;
        this.status = 1;
        this.createDatetime = new Date();
        this.updateDatetime = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", createDatetime=" + createDatetime +
                ", updateDatetime=" + updateDatetime +
                ", status=" + status +
                ", Description='" + description + '\'' +
                '}';
    }
}
