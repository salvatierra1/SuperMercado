package com.mycompany.somospnt.entity;


public class Fruits extends Product{
   
    //==Atributos==
    private String unit;
    
    //==Constructores==

    public Fruits() {
    }

   
    public Fruits(int id, String name, Double price, String unit) {
        super(id, name, price);
        this.unit = unit;
    }
   
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String div = " /// ";
		sb.append("Nombre: ").append(super.getName()).append(div);
		sb.append("Precio: $").append(super.getPrice()).append(div);
		sb.append("Unidad de venta: ").append(unit);
		return sb.toString();
	}
    
}
