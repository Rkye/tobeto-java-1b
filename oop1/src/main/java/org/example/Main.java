package org.example;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        // set value : objeye değerler atadık
        product1.setName("DeLonghi Kahve Makinesi");
        product1.setUnitPrice(20500);
        product1.setDiscount(7);
        product1.setImageUrl("image1.jpg");
        product1.setUnitsInStock(10);

        // get value : objenin name değerini getirir.
        System.out.println(product1.getName());
/*
        Product product2 = new Product();
        product2.name = "Smeg Kahve Makinesi";
        product2.unitPrice = 24500;
        product2.discount = 6;
        product2.imageUrl = "image2.jpg";
        product2.unitsInStock = 5;

        Product product3 = new Product();
        product3.name = "Kitchen Aid Kahve Makinesi";
        product3.unitPrice = 18500;
        product3.discount = 8;
        product3.imageUrl = "image3.jpg";
        product3.unitsInStock = 3;
*/
        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(24500);
        product2.setDiscount(6);
        product2.setImageUrl("image2.jpg");
        product2.setUnitsInStock(5);

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(18500);
        product3.setDiscount(8);
        product3.setImageUrl("image3.jpg");
        product3.setUnitsInStock(3);

        Product[] products = {product1, product2, product3};

        for (Product product:products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("9005121222121");
        individualCustomer.setPhone("0502321232");
        individualCustomer.setfName("xyz");
        individualCustomer.setlName("abc");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("3012222");
        corporateCustomer.setPhone("0501020000");
        corporateCustomer.setCompanyName("Tobeto");
        corporateCustomer.setTaxNumber("32152112");

        Customer[] customers = new Customer[]{individualCustomer, corporateCustomer};
    }
}