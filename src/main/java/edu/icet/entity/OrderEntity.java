package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Orders")
public class OrderEntity {
    @Id
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
