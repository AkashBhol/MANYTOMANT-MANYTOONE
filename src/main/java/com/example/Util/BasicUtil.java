package com.example.Util;

import com.example.Domain.Result;

import java.util.Objects;

public class BasicUtil {
    public Result prepareResponseObject(String code, String message, Object responseData) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
//        if (responseData) {
//            result.setData(null);
//        } else {
        result.setData(responseData);
//        }
        return result;
    }

    public static boolean isNullOrEmpty(Object value) {
        return (Objects.isNull(value) || value.toString().isBlank()) ? Boolean.TRUE : Boolean.FALSE;
    }
}
