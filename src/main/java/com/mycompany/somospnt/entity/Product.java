package com.mycompany.somospnt.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product implements Comparable<Product> {

    //=== Atributos ===  
    private int id;
    private String name;
    private Double price;

    //=== Lista de Productos===
    List<Product> products = new ArrayList<>();

    //==Constructores==
    public Product() {
    }

    public Product(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //==Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Override
    public int compareTo(Product product) {
        return (int) (product.getPrice() - this.price);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void printProduct() {
        products.stream().forEach(p -> System.out.println(p + "\n"));
    }

    public void orderProduct() {
        Collections.sort(products);
        System.out.println("Producto más caro: " + products.get(0).getName());
        int elementFinal = products.size()-1;
        System.out.println("Producto más barato: " + products.get(elementFinal).getName());
    }
    
}
