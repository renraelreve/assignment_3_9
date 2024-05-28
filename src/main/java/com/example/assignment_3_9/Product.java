package com.example.assignment_3_9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product {
  @GetMapping("/products/{productId}")
  public String searchProduct(@PathVariable int productId) {
    switch (productId) {
      case 1:
        return "This is detail for ID " + productId + " Product Name: Apple";
      case 2:
        return "This is detail for ID " + productId + " Product Name: Banana";
      case 3:
        return "This is detail for ID " + productId + " Product Name: Carrot";
      default:
        if (productId > 4) {
          return "No product found";
        }
        return "No product found";
    }
  }
}
