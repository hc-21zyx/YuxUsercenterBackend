package org.example.usercenter.demos.exception;

import org.example.usercenter.demos.common.ErrorCode;

/**
 * 业务异常
 */

public class BusinessException extends RuntimeException {
    private final int code;

    private final String description;

    public BusinessException(String message,int code,String descripiton) {
        super(message);
        this.code = code;
        this.description = descripiton;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.  getCode();
        this.description = errorCode.getDescription();
    }

    public BusinessException(ErrorCode errorCode, String description) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}