package com.xiaotaot.test;


public enum Status {
    PENDING("pending"),
    PROCESS("process"),
    COMPLETE("complete");

    private String value;

    Status(String value) {
        this.value = value;
    }

    public String getStatus() {
        return this.value;
    }

    public static void main(String[] args) {
        Status status = Status.PENDING;
        System.out.println(status);
    }

}
