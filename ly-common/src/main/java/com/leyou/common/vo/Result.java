package com.leyou.common.vo;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

@JsonInclude
public class Result<T> {

    @Getter
    private Integer code;

    @Getter
    private String message;

    @Getter
    private T body;


    public Result(Integer code, String message, T body) {
        this.code = code;
        this.message = message;
        this.body = body;
    }
}
