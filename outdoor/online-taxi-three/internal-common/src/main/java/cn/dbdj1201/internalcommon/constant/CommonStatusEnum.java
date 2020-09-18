package cn.dbdj1201.internalcommon.constant;

import lombok.Getter;

/**
 * @Author: dbdj1201
 * @Date: 2020-09-18 15:33
 */
public enum CommonStatusEnum {

    /**
     * 短信验证码服务 10001-10099
     */
    VERIFY_CODE_ERROR(10001, "短信验证码验证失败"),
    /**
     * 一分钟内相同验证码错误达到3次，请1分钟后登录
     */
    VERIFICATION_ONE_MIN_ERROR(10002, "您同一个错误验证码点击登录的次数过多，请一分钟后重试"),
    /**
     * 一小时内相同验证码错误达到3次，请一小时后登录
     */
    VERIFICATION_TEN_MIN_ERROR(10003, "您登录失败的次数过多，请十分钟后再试"),

    /**
     * 一小时内验证码错误达到5次，请24小时后登录
     */
    VERIFICATION_ONE_HOUR_ERROR(10004, "您今天登录失败的次数过多，请24小时后重新登录"),

    VERIFICATION_ONE_MIN_SEND_ERROR(10005, "一分钟内最多发三次，请一分钟后重试"),

    VERIFICATION_ONE_HOUR_SEND_ERROR(10006, "一小时内最多能发十条短信，你也可以滚了，明天来"),

    /**
     * api-passenger乘客api 101 01- 101 99
     */
    PHONENUMBER_EMPTY(10101, "手机号为空"),

    PHONENUMBER_ERROR(10102, "手机号格式不正确"),

    /**
     * 操作成功
     */
    SUCCESS(200, "success"),

    /**
     * 操作异常
     */
    INTERNAL_SERVER_EXCEPTION(500, "exception"),


    /**
     * 操作失败
     */
    FAIL(1, "fail");

    @Getter
    private final String value;
    @Getter
    private final int code;

    CommonStatusEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }
}
