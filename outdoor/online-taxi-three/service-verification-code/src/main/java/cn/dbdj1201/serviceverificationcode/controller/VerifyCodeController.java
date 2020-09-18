package cn.dbdj1201.serviceverificationcode.controller;

import cn.dbdj1201.internalcommon.dto.ResponseResult;
import cn.dbdj1201.internalcommon.dto.serviceverificationcode.VerifyCode;
import cn.dbdj1201.serviceverificationcode.service.IVerifyCodeService;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import cn.hutool.core.util.RandomUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: dbdj1201
 * @Date: 2020-09-18 13:47
 */
@RestController
@RequestMapping("/verify-code")
@Slf4j
public class VerifyCodeController {
    public static void main(String[] args) {
        int len = 1000000;
        TimeInterval timer = DateUtil.timer();
        for (int i = 0; i < len; i++) {
            String code = (Math.random() + "").substring(2, 8);
        }

        System.out.println(timer.intervalRestart());

        for (int i = 0; i < len; i++) {
            String code = String.valueOf((int) ((Math.random() * 9 + 1) * Math.pow(10, 5)));
        }
        System.out.println(timer.intervalRestart());

        for (int i = 0; i < len; i++) {
            String code = RandomUtil.randomNumbers(6);
        }
        System.out.println(timer.intervalRestart());
    }

    @Autowired
    private IVerifyCodeService verifyCodeService;

    @GetMapping("/generate/{identity}/{phoneNumber}")
    public ResponseResult<VerifyCode> generate(
            @PathVariable("identity") Integer identity,
            @PathVariable("phoneNumber") String phoneNumber
    ) {
        log.info("call user - {} {}", identity, phoneNumber);
        return this.verifyCodeService.generateVerificationCode(identity,phoneNumber);
    }


}
