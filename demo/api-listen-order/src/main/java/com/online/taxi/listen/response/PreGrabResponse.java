package com.online.taxi.listen.response;

import lombok.Data;

/**
 * @author hyfly
 */
@Data
public class PreGrabResponse {

    private int orderId;

    private String startAddress;

    private String endAddress;


}
