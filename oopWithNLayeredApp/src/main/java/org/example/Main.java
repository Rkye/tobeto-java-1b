package org.example;


import org.example.business.ProductManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dataAccess.HibernateProductDao;
import org.example.dataAccess.JdbcProductDao;
import org.example.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{

        Product product = new Product(1, "IPhone XR", 9000);

        List<Logger> loggers1 = new ArrayList<Logger>();
        loggers1.add(new DatabaseLogger());
        loggers1.add(new FileLogger());

        List<Logger> loggers2 = new ArrayList<>();
        loggers2.add(new MailLogger());


        // List<Logger> logger3 = new ArrayList<>(List.of(new MailLogger(), new FileLogger(), new DatabaseLogger()));

        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers1 );
        productManager.add(product);
        ProductManager productManager1 = new ProductManager(new JdbcProductDao(), loggers2);
        productManager1.add(product);

    }
}