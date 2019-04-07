package com.yxh.controller;


import com.yxh.entity.ResponseData;
import org.apache.log4j.Logger;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : yangxh
 * @version V1.0
 * @Project: parentPro
 * @Package com.yxh.controller
 * @Description: 全局统一异常处理
 * @date Date : 2019年04月07日 15:02
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = Logger.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseData defaultErrorHandler(HttpRequest request,Exception e){

        ResponseData responseData = new ResponseData();
        responseData.setMessgae(e.getMessage());

        if(e instanceof org.springframework.web.servlet.NoHandlerFoundException){
            responseData.setCode(404);
        }else{
            responseData.setCode(500);
        }
        responseData.setStatus(false);
        responseData.setObj(null);

        return responseData;
    }

}
