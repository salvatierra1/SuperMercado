package com.mycompany.somospnt.entity;


public class Hygiene extends Product{
    
    private Integer contents;

    public Hygiene() {
    }

    public Hygiene(Integer contents) {
        this.contents = contents;
    }

    public Hygiene(int id, String name, Integer contents, Double price) {
        super(id, name, price);
        this.contents = contents;
    }

    public Integer getContents() {
        return contents;
    }

    public void setContents(Integer contents) {
        this.contents = contents;
    }

    @Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		String div = " /// ";
		sb.append("Nombre: " + super.getName() + div);
		sb.append("Contenido: " + contents + div);
                sb.append("Precio: $" + super.getPrice());
		return sb.toString();
	}
}
