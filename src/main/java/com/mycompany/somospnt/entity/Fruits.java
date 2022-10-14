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
		StringBuffer sb = new StringBuffer();
		String div = " /// ";
		sb.append("Nombre: " + super.getName() + div);
		sb.append("Precio: $" + super.getPrice() + div);
		sb.append("Unidad de venta: " + unit);
		return sb.toString();
	}
    
}
