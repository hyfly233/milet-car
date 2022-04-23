package com.hyfly.milet.common.util;

import lombok.Data;

@Data
public class JwtInfo{
    String subject;
    Long issueDate;
}