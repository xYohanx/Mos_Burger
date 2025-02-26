package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    private String itemCode;
    private String customerName;
    private String email;
    private String phoneNumber;
    private Integer quantity;
    private String address;
}
