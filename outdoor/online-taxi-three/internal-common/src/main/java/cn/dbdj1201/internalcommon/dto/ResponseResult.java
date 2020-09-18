package cn.dbdj1201.internalcommon.dto;

import cn.dbdj1201.internalcommon.constant.CommonStatusEnum;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: dbdj1201
 * @Date: 2020-09-18 15:31
 */
@Data
@Accessors(chain = true)
@SuppressWarnings("all")
public class ResponseResult<T> implements Serializable {

    private static final long serialVersionUID = -2073390651767969040L;

    private int code;
    private String message;
    private T data;

    /**
     * 返回正确数据(status:200)
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseResult success(T data) {
        return new ResponseResult()
                .setCode(CommonStatusEnum.SUCCESS.getCode())
                .setMessage(CommonStatusEnum.SUCCESS.getValue())
                .setData(data);
    }

    /**
     * 返回错误数据(status:500)
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseResult fail(T data) {
        return new ResponseResult()
                .setCode(CommonStatusEnum.INTERNAL_SERVER_EXCEPTION.getCode())
                .setMessage(CommonStatusEnum.INTERNAL_SERVER_EXCEPTION.getValue())
                .setData(data);
    }
}
