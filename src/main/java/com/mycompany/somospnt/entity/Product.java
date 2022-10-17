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

    public String printProduct() {
        StringBuilder sb = new StringBuilder();
        products.stream().forEach(p -> sb.append(p).append("\n"));
        return sb.toString();
    }

    public String orderProduct() {
        Collections.sort(products);
        StringBuilder sb = new StringBuilder();
        sb.append("========================\n");
        sb.append("Producto más caro: ").append(products.get(0).getName()).append("\n");
        int elementFinal = products.size()-1;
        sb.append("Producto más barato: ").append(products.get(elementFinal).getName());
        return sb.toString();
    }
    
}
