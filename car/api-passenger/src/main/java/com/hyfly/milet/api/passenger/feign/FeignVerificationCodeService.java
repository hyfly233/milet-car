package com.hyfly.milet.api.passenger.feign;

import com.hyfly.milet.common.dto.ResponseResult;
import com.hyfly.milet.common.dto.service.verification.code.request.GenerateCodeRequest;
import com.hyfly.milet.common.dto.service.verification.code.request.VerifyCodeRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * FeignVerificationCodeService
 *
 * @author hyfly
 */
@Service
@Component
@FeignClient(value = "service-verification-code-23311")
public interface FeignVerificationCodeService {

    /**
     * 生成校验码
     *
     * @param request request
     * @return ResponseResult
     */
    @GetMapping("/verify-code/generate")
    ResponseResult generate(@SpringQueryMap GenerateCodeRequest request);

    /**
     * 验证校验码
     *
     * @param request request
     * @return ResponseResult
     */
    @PostMapping("/verify-code/verify")
    ResponseResult verify(@RequestBody VerifyCodeRequest request);
}
