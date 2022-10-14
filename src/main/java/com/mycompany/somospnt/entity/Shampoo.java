package com.mycompany.somospnt.entity;


public class Shampoo extends Product{
    
    private Integer contents;

    public Shampoo() {
    }

    public Shampoo(Integer contents) {
        this.contents = contents;
    }

    public Shampoo(int id, String name, Integer contents, Double price) {
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
