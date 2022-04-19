package com.hyfly.milet.common.dto;

import com.hyfly.milet.common.enums.CommonStatusEnum;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;

/**
 * chain的中文含义是链式的，设置为true，则setter方法返回当前对象
 *
 * @author hyfly
 */
@Data
@Accessors(chain = true)
public class ResponseResult implements Serializable {
    @Serial
    private static final long serialVersionUID = -2073390651767969040L;

    private Integer code = 200;
    private String message;
    private Object data;

    /**
     * 返回成功数据（status：1）
     *
     * @param data 数据内容
     * @return ResponseResult实例
     */
    public static ResponseResult success(Object data) {
        return new ResponseResult().setCode(CommonStatusEnum.SUCCESS.getCode()).setMessage(CommonStatusEnum.SUCCESS.getValue()).setData(data);
    }

    /**
     * 返回错误数据（status：500）
     *
     * @param data 错误内容
     * @return ResponseResult实例
     */
    public static ResponseResult fail(Object data) {
        return new ResponseResult().setCode(CommonStatusEnum.INTERNAL_SERVER_EXCEPTION.getCode()).setMessage(CommonStatusEnum.INTERNAL_SERVER_EXCEPTION.getValue()).setData(data);
    }

    /**
     * 自定义返回错误数据
     *
     * @param code    错误代码
     * @param message 错误消息
     * @return ResponseResult实例
     */
    public static ResponseResult fail(int code, String message) {
        return new ResponseResult().setCode(code).setMessage(message);
    }

    /**
     * @param code    错误代码
     * @param message 错误消息
     * @param data    错误内容
     * @return ResponseResult实例
     */
    public static ResponseResult fail(int code, String message, String data) {
        return new ResponseResult().setCode(code).setMessage(message).setData(data);
    }
}
