package org.example;

import org.example.models.Category;
import org.example.models.Order;
import org.example.models.Product;
import org.example.models.User;

public class Main {
    public static void main(String[] args) {

        // Category sınıfı instance1
        Category category = new Category("Elektronik", "E100");

        // Category sınıfı instance2
        Category category1 = new Category();
        category1.setCategoryName("Giysi");
        category1.setCategoryCode("G100");

        Category[] categories = {category, category1};

        for (Category cat : categories){
            System.out.println("Kategori adı : " + cat.getCategoryName());
        }

        // Order sınıfı instance'ı
        Order order = new Order();
        order.setOrderNo("GE10015");
        order.setOrderDate("2023.10.25");
        order.setUnitsOrder(5);

        System.out.println(order.getOrderDate() + " tarihli, " + order.getOrderNo()
                + " numaralı siparişin " + order.getUnitsOrder() + " adet ürünü var.");

        // Product sınıfı instance'ı
        Product product = new Product("Asus Laptop", 13000 ,
                "asus.svg", 10, 0);
        System.out.println(product.getProductName() + " fiyatı : " + product.getProductPrice() + " TL" );

        // User sınıfı instance'ı
        User user = new User();
        user.setFirstName("Rukiye");
        user.setLastName("Arabacı");
        user.setEmail("rukiye@gmail.com");
        user.setPhone("05001112233");

        System.out.println("Kullanıcı bilgileri : \n" + user.getFirstName() + " " + user.getLastName()
        + "\n" + user.getEmail() + "\n" + user.getPhone());


    }
}