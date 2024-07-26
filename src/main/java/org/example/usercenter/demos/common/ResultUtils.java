package org.example.usercenter.demos.common;

/**
 * 放回工具类
 */

public class ResultUtils {
    public static <T> BaseResponse<T> success(T data){
        return new BaseResponse<>(0,data,"ok");
    }
}
