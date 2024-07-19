package com.example.jdbc_demo.repositories;

import com.example.jdbc_demo.models.Category;
import com.example.jdbc_demo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    @Autowired
    private DataSource dataSource;

    //get all categories
    public List<Product> getAllProducts(){
        String query = "SELECT * FROM products";
        List<Product> products = new ArrayList<>();

        //try-with
        try(Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery()){

            while(rs.next()){
                products.add(mapRowToProduct(rs));
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }

        return products;
    }

    public List<Product> getProductByCategoryId(int id){
        String query = "SELECT * FROM products WHERE category_id = ?";
        List<Product> products = new ArrayList<>();

        try(Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);

            try(ResultSet rs = ps.executeQuery()) {
                while (rs.next()){
                    products.add(mapRowToProduct(rs));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    private Product mapRowToProduct(ResultSet rs) throws SQLException {
        int productId = rs.getInt("product_id");
        int categoryId = rs.getInt("category_id");
        String productName = rs.getString("product_name");
        double unitPrice = rs.getInt("unit_price");
        int unitsInStock = rs.getInt("units_in_stock");
        return new Product(productId, categoryId, productName, unitPrice, unitsInStock);
    }
}