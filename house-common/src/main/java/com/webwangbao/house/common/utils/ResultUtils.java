package com.webwangbao.house.common.utils;

import com.webwangbao.house.common.exception.ResponseEnum;
import com.webwangbao.house.common.exception.ResponseStatus;

/**
 * @Author: wangbao02
 * @CreateDate: 2018/5/17 14:47
 * @Description:
 */
public class ResultUtils {
    public static ResponseStatus sucess(Object data) {
        return new ResponseStatus(ResponseEnum.SUCESS.getCode(), ResponseEnum.SUCESS.getMessage(), data);
    }

    public static ResponseStatus sucess() {
        return new ResponseStatus(ResponseEnum.SUCESS.getCode(), ResponseEnum.SUCESS.getMessage(), null);

    }

    public static ResponseStatus sucess(ResponseEnum responseEnum) {
        return new ResponseStatus(responseEnum.getCode(), responseEnum.getMessage());
    }

    public static ResponseStatus error() {
        return new ResponseStatus(ResponseEnum.ERROR.getCode(), ResponseEnum.ERROR.getMessage());
    }

    public static ResponseStatus error(ResponseEnum responseEnum) {
        return new ResponseStatus(responseEnum.getCode(), responseEnum.getMessage());
    }

    public static ResponseStatus error(Integer code, String message) {
        return new ResponseStatus(code, message);
    }
}
