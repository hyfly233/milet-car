package com.online.taxi.driver.service;

/**
 * 验证码服务
 *
 * @author hyfly
 */
public interface VerificationCodeService {
    /**
     * 获取验证码
     *
     * @param phonenumber
     * @return
     */
    public String getCode(String phonenumber);

    /**
     * 校验验证码
     *
     * @param phonenumber
     * @param code
     * @return
     */
    public String checkCode(String phonenumber, String code);
}
