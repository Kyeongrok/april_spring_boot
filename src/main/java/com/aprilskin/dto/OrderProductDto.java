package com.aprilskin.dto;

import lombok.Data;

/**
 * Created by DELL on 2017-08-09.
 */
@Data
public class OrderProductDto {
    private String no;
    private String shipName;
    private String shipAddress;
    private String shipMobile;
    private String shipMessage;

    private String itemCode;
    private String ownItemCode;
    private String productName;
    private long orderItemQty;
    private String productCode;

}
