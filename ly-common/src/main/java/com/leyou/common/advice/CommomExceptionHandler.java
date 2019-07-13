package com.leyou.common.advice;

import com.leyou.common.enums.ExceptionEnums;
import com.leyou.common.exception.LyException;
import com.leyou.common.vo.ExceptionResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommomExceptionHandler {

    //拦截对象
    @ExceptionHandler(LyException.class)
    public ResponseEntity<ExceptionResult> handlerException(LyException e){
//        ExceptionEnums enums = e.getExceptionEnums();
        return ResponseEntity.status(e.getExceptionEnums().getCode())
                .body(new ExceptionResult(e.getExceptionEnums()));
    }
}
