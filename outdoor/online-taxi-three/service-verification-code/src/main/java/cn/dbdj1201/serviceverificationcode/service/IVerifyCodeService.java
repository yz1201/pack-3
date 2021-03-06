package cn.dbdj1201.serviceverificationcode.service;

import cn.dbdj1201.internalcommon.dto.ResponseResult;
import cn.dbdj1201.internalcommon.dto.serviceverificationcode.VerifyCode;

/**
 * @Author: dbdj1201
 * @Date: 2020-09-18 15:28
 */
public interface IVerifyCodeService {
    /**
     * 生成验证码，三档限制
     * @param identity
     * @param phoneNumber
     * @return
     */
    ResponseResult<VerifyCode> generateVerificationCode(Integer identity, String phoneNumber);
}
