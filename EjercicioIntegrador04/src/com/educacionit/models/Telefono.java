package com.educacionit.models;

/*2) Clase Telefono
id:int
Tipo y numero: String*/
public class Telefono {
	private int id;
	private String tipo, numero;

	public Telefono() {

	}

	public Telefono(int id, String tipo, String numero) {
		this.id = id;
		this.tipo = tipo;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefono [id=" + id + ", tipo=" + tipo + ", numero=" + numero + "]";
	}

}
