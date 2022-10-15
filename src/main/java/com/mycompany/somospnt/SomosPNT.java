package com.mycompany.somospnt;

import com.mycompany.somospnt.entity.Fruits;
import com.mycompany.somospnt.entity.Product;
import com.mycompany.somospnt.entity.Hygiene;
import com.mycompany.somospnt.entity.Beverage;

public class SomosPNT {

    public static void main(String[] args) {

        Beverage cocaZero = new Beverage(1, "Coca-Cola Zero", 1.5, 20.0);
        Beverage cocaCola = new Beverage(1, "Coca-Cola", 1.5, 18.0);
        Hygiene shampooSedal = new Hygiene(1, "Shampoo Sedal", 500, 19.0);
        Fruits frutilla = new Fruits(1, "Frutillas", 64.0, "Kilo");

        Product product = new Product();

        product.addProduct(cocaZero);
        product.addProduct(cocaCola);
        product.addProduct(shampooSedal);
        product.addProduct(frutilla);

        System.out.println(product.printProduct());
        System.out.println(product.orderProduct());
        
    }

}
