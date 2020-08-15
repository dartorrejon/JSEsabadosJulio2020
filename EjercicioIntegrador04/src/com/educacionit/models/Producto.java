package com.educacionit.models;

/*5) Producto
id;int
precio: double
descripción: String*/
public class Producto {
	
	private int id;
	private double precio;
	private String descripsion;
	
	public Producto() {
	}
	public Producto(int id, double precio, String descripsion) {
		this.id = id;
		this.precio = precio;
		this.descripsion = descripsion;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", precio=" + precio + ", descripsion=" + descripsion + "]";
	}
	
	
}
