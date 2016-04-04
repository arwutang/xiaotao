package com.test;

public class PrivateObject {
    private String privateId;
    public String publicId;

    public PrivateObject(String privateId, String publicId) {
        this.privateId = privateId;
        this.publicId = publicId;
    }

    public static void main(String[] args) {
        System.out.println(new PrivateObject("private id", "public id"));
    }
}
