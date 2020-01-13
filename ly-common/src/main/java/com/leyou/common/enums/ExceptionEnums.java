package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnums {

    PRICE_CANNOT_BE_NULL(404,"价格不能为空"),
    BRAND_NOT_FOUND(404,"品牌没有发现"),
    ;
    private int code;
    private String msg;
}
