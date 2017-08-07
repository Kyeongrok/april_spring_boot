package com.aprilskin.dto;

import com.aprilskin.entities.OrderItem;
import lombok.Data;

import java.util.List;

/**
 * Created by DELL on 2017-08-07.
 */
@Data
public class OrderDto {

    String startDatetime;
    String endDatetime;
    List<OrderItem> orderItemList;



}
