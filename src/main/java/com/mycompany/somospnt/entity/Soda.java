package com.mycompany.somospnt.entity;



public class Soda extends Product{
    
    private Double liters;

    public Soda() {
    }

    public Soda(Double liters) {
        this.liters = liters;
    }

    public Soda(int id, String name,  Double liters, Double price) {
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
		StringBuffer sb = new StringBuffer();
		String div = " /// ";
		sb.append("Nombre: " + super.getName() + div);
		sb.append("Litros: " + liters + div );
                sb.append("Precio: $" + super.getPrice());
		return sb.toString();
	}
        
       
}
