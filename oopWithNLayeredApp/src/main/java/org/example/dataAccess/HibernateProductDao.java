package org.example.dataAccess;

import org.example.entities.Product;

public class HibernateProductDao implements ProductDao{

    public void add(Product product){
        // db ye bağlanma kodları yazılır.
        System.out.println("Hibernate ile product db ye kaydedildi.");
    }
}
