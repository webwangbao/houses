package com.webwangbao.house.common.exception;

/**
 * @Author: wangbao02
 * @CreateDate: 2018/5/17 14:34
 * @Description:统一异常处理
 */
public class houseException extends RuntimeException {
    private Integer code;

    private ResponseEnum responseEnum;

    public houseException(){

    }

    public houseException(ResponseEnum responseEnum){
        super(responseEnum.getMessage());
        this.code = responseEnum.getCode();
    }
    public houseException(Integer code,String message){
        super(message);
        this.code = code;

    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
