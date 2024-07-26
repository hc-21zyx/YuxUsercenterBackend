package org.example.usercenter.demos.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用放回类
 * @param <T>
 */

@Data
public class BaseResponse<T> implements Serializable {
    private int code;

    private T data;

    private String message;

    public BaseResponse(int code,T data,String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

}
