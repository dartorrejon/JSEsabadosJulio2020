package com.educacionit.models;

/*4) Cliente (Hereda de Persona)
numeroCliente: int*/
public class Cliente extends Persona {
	private int numeroCliente;

	public Cliente() {
	}

	public Cliente(int id, String nombre, Telefono telefono, Domicilio domicilio, int numeroCliente) {
		super(id, nombre, telefono, domicilio);
		this.numeroCliente = numeroCliente;

	}

	@Override
	public String toString() {
		return "Cliente [numeroCliente=" + numeroCliente + ", id=" + id + ", nombre=" + nombre + ", telefono="
				+ telefono + ", domicilio=" + domicilio + "]";
	}


	

}
