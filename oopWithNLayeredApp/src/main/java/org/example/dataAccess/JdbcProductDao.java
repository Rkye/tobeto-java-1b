package org.example.dataAccess;

import org.example.entities.Product;

public class JdbcProductDao implements ProductDao{

    public void add(Product product){
        // db ye bağlanma kodları yazılır.
        System.out.println("JDBC ile product db ye kaydedildi.");
    }
}
