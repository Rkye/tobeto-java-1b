package com.tobeto.workshop1.b.pair7;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private List<Product> productList = new ArrayList<>();

    @GetMapping
    public List<Product> get(){
        return productList;
    }

    @PostMapping
    public String addProduct(@RequestBody List<Product> products){
        productList.addAll(products);
        return "Eklendi.";
    }

    @DeleteMapping
    public String deleteProduct(){
        return "Silindi.";
    }

    @PutMapping("/update/{id}")
    public Product putProduct(@PathVariable("id") int id, @RequestBody Product product){
        for(Product products : productList){
            if(products.getId() == id){
                products.setName(product.getName());
            }
        }
        return product;
    }


}
