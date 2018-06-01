package com.webwangbao.house.common.exception;

/**
 * @Author: wangbao02
 * @CreateDate: 2018/5/17 14:37
 * @Description:后端自定义响应状态码
 */
public enum ResponseEnum {
    SUCESS(200, "成功"),
    ERROR(000, "失败"),
    VALIDATE_PARM_ERROR(1000, "前端参数不合法"),
    NOT_FIND_USER_BY_ID(1001, "根据id没有查询到用户"),;
    private Integer code;
    private String message;


    ResponseEnum(Integer code, String message) {
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
}
