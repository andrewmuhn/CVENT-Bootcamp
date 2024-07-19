package com.example.jdbc_demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private int categoryId;
    private String categoryName;
    private String description;

@Override
public String toString(){
    return String.format("| %-12d | %-20s | %-20s |",
            categoryId, categoryName, description);
}
}
