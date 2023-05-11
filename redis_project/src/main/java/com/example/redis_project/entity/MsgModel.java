package com.example.redis_project.entity;

public class MsgModel {

    private Integer code;
    private String msg;
    private Object obj;

    public Integer getCode() {
        return code;
    }

    public MsgModel(){}

    public MsgModel(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public MsgModel(Integer code, String msg, Object obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
