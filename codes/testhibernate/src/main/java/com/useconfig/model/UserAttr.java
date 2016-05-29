package com.useconfig.model;


public class UserAttr {
    private Integer userId;

    private Integer gender;

    private Integer age;

    private String description;

    private User user;

    public UserAttr() {
    }

    public UserAttr(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
        return "UserAttr{" +
                "userId=" + userId +
                ", gender=" + gender +
                ", age=" + age +
                ", description='" + description + '\'' +
                '}';
    }
}
