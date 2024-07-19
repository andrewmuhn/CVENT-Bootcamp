package com.example.jdbc_demo;

import com.example.jdbc_demo.models.Category;
import com.example.jdbc_demo.models.Product;
import com.example.jdbc_demo.repositories.CategoryRepository;
import com.example.jdbc_demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@SpringBootApplication
public class JdbcDemoApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(JdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Category> categoryList = categoryRepository.getAllCategories();
		List<Product> pruductList = productRepository.getAllProducts();

		System.out.println("Please enter the category Id of the products you want to view.");
		System.out.printf("| %-12s | %-20s | %-20s |\n",
				"Category Id", "Category Name", "Description");
		categoryList.forEach(System.out::println);
		int categoryId = scanner.nextInt();
		scanner.nextLine();
		List<Product> products = productRepository.getProductByCategoryId(categoryId);
//		pruductList.forEach(System.out::println);
//		System.out.println(category);
		System.out.printf("| %-12s | %-12s | %-40s | %-12s | %-14s |\n",
				            "Category Id", "Product Id", "Product Name", "Unit Price", "Units In Stock");
		products.forEach(System.out::println);
	}
}
