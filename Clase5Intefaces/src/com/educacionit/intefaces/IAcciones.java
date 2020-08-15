package com.educacionit.intefaces;

public interface IAcciones {
	// conjunto de metodos abstractos
	public void caminar();

	public void cazar();

	public void comer();
	
	//ESTO SOLO SE PUEDEO A PARTIR DE JAVA 8
	default void dormir() {
		System.out.println("Estoy durmiendo como cualquier animal "
				+ ", con los ojos cerrados");
	}
	

}
