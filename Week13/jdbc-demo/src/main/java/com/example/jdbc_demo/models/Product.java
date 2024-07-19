package com.example.jdbc_demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int productId;
    private int categoryId;
    private String productName;
    private double unitPrice;
    private int unitsInStock;

    @Override
    public String toString(){
    return String.format("| %-12d | %-12d | %-40s | %-12.2f | %-14d |",
        categoryId, productId, productName, unitPrice, unitsInStock);
    }
}

