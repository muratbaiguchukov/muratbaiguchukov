package com.company;

import com.company.task2.Order;
import com.company.task2.Product;
import com.company.task2.ProductType;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        Order newOrder = new Order();
        newOrder.setNumber(1);
        newOrder.setCreateDate(LocalDate.now());
        newOrder.setCreateTime(LocalTime.now());

        Product newProduct = new Product();
        newProduct.setName("Яблоки");
        newProduct.setType(ProductType.FRUIT);
        newOrder.setProducts(new ArrayList<>());
        newOrder.getProducts().add(newProduct);

        orders.add(newOrder);


        Order newOrder1 = new Order();
        newOrder1.setNumber(2);
        newOrder1.setCreateDate(LocalDate.now());
        newOrder1.setCreateTime(LocalTime.now());

        Product newProduct1 = new Product();
        newProduct1.setName("Помидоры");
        newProduct1.setType(ProductType.VEGETABLES);
        newOrder1.setProducts(new ArrayList<>());
        newOrder1.getProducts().add(newProduct1);

        orders.add(newOrder1);


        Order newOrder2 = new Order();
        newOrder2.setNumber(3);
        newOrder2.setCreateDate(LocalDate.now());
        newOrder2.setCreateTime(LocalTime.now());

        Product newProduct2 = new Product();
        newProduct2.setName("Садочок");
        newProduct2.setType(ProductType.JUICES);
        newOrder2.setProducts(new ArrayList<>());
        newOrder2.getProducts().add(newProduct2);

        orders.add(newOrder2);
        System.out.println(orders);

        orders.remove(newOrder1);
        System.out.println(orders);

        System.out.println(orders.contains(newOrder2));
	    }
}
