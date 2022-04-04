package com.hyfly.milet.common.enums;

import lombok.Getter;

public enum IdentityEnum {
    /**
     * 乘客标识
     */
    PASSENGER(1),

    /**
     * 司机标识
     */
    DRIVER(2);

    @Getter
    private final Integer value;

    private IdentityEnum(Integer value) {
        this.value = value;
    }
}