package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {
    private String orderId;
    private String customerName;
    private String itemCode;
    private Double price;
    private String discount;
    private Integer quantity;
    private String address;
    private String date;
    private String time;


}
