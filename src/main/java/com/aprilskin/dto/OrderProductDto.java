package com.aprilskin.dto;

import com.aprilskin.utils.LocalDateTimeAttributeConverter;
import lombok.Data;

import javax.persistence.Convert;
import java.time.LocalDateTime;

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

    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime orderDatetime;

    private String itemCode;
    private String ownItemCode;
    private String productName;
    private long orderItemQty;
    private String productCode;

}
