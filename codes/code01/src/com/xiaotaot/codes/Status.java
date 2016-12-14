package com.xiaotaot.codes;


public enum Status implements XiaotaoStatus {
    PENDING("pending"),
    PROCESS("process"),
    COMPLETE("complete");

    private String s;

    Status(String s) {
        this.s = s;
    }

    public String valueOf() {
        return this.s;
    }

    @Override
    public String toString() {
        return this.s;
    }
}
