package com.webwangbao.house.common.exception;

/**
 * @Author: wangbao02
 * @CreateDate: 2018/5/17 14:43
 * @Description:封装返回前端统一json信息实体
 */
public class ResponseStatus<T> {
    private Integer code;
    private String message;
    private T data;

    public ResponseStatus(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
