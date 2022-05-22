package com.hyfly.milet.common.enums;

import lombok.Getter;

/**
 * 身份标识
 *
 * @author hyfly
 */

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

    IdentityEnum(Integer value) {
        this.value = value;
    }
}