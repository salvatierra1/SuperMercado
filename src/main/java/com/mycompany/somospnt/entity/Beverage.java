package com.mycompany.somospnt.entity;



public class Beverage extends Product{
    
    private Double liters;

    public Beverage() {
    }

    public Beverage(Double liters) {
        this.liters = liters;
    }

    public Beverage(int id, String name, Double liters, Double price) {
        super(id, name, price);
        this.liters = liters;
    }

    public Double getLiters() {
        return liters;
    }

    public void setLiters(Double liters) {
        this.liters = liters;
    }

    @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String div = " /// ";
		sb.append("Nombre: ").append(super.getName()).append(div);
		sb.append("Litros: ").append(liters).append(div);
                sb.append("Precio: $").append(super.getPrice());
		return sb.toString();
	}
        
       
}
