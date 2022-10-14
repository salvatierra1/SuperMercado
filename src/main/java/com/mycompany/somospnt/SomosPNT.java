package com.mycompany.somospnt;

import com.mycompany.somospnt.entity.Fruits;
import com.mycompany.somospnt.entity.Product;
import com.mycompany.somospnt.entity.Shampoo;
import com.mycompany.somospnt.entity.Soda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class SomosPNT {
   
    public static void main(String[] args) { 
       
        Product cocaZero = new Soda(1, "Coca-Cola Zero", 1.5, 20.0);
        Product cocaCola = new Soda(1, "Coca-Cola", 1.5, 18.0);
        Product shampoSedal = new Shampoo(1, "Shampoo Sedal", 500, 19.0);
        Product frutilla = new Fruits(1, "Frutillas",64.0, "Kilo");
        System.out.println(cocaZero + "\n" + cocaCola + "\n" + shampoSedal + "\n" + frutilla);
        
        System.out.println("========================");
        
        List<Product> products = new ArrayList<>();
        products.add(cocaZero);
        products.add(cocaCola);
        products.add(shampoSedal);
        products.add(frutilla);
       
        Collections.sort(products);
      
        System.out.println("Producto más caro: " + products.get(0));
        int elementFinal = products.size() - 1;
        System.out.println("Producto más barato: " + products.get(elementFinal));
    }
    
}
