package com.hyfly.milet.common.dto.service.sms;

import lombok.Data;

import java.util.Map;

@Data
public class SmsTemplateDto {
    // 模板id
    private String id;

    // 参数  占位符
    private Map<String, Object> templateMap;

    @Override
    public String toString() {
        return "SmsTemplateDto [id=" + id + ", templateMap=" + templateMap + "]";
    }

}