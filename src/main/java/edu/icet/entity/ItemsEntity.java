package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "ItemList")
public class ItemsEntity {
    @Id
    private String itemCode;
    private String itemName;
    private Double price;
    private String discount;
}
