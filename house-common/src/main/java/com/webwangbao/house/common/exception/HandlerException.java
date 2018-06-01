package com.webwangbao.house.common.exception;

import com.alibaba.fastjson.JSON;
import com.webwangbao.house.common.utils.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author: wangbao02
 * @CreateDate: 2018/5/17 14:42
 * @Description:捕获异常进行统一处理
 */
@ControllerAdvice
public class HandlerException {
    private static final Logger logger = LoggerFactory.getLogger(HandlerException.class);

    @ExceptionHandler(value = houseException.class)
    @ResponseBody
    public ResponseStatus handleCommectionException(HttpServletResponse response, houseException e) {
        logger.error("错误信息是 e = {}", e.getMessage());
        response.setStatus(405);
        return ResultUtils.error(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseStatus handleException(HttpServletResponse response, Exception e) {
        logger.error("错误信息e = {}", JSON.toJSONString(e));
        response.setStatus(506);
        return ResultUtils.error();

    }
}
