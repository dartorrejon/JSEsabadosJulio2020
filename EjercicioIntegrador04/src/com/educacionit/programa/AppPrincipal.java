package com.educacionit.programa;

import com.educacionit.models.Cliente;
import com.educacionit.models.Domicilio;
import com.educacionit.models.Persona;
import com.educacionit.models.Producto;
import com.educacionit.models.Telefono;

public class AppPrincipal {
	
	public static void main(String[] args) {

		Domicilio dm = new Domicilio(1, 2024, "Av Siempre viva", "CABA");
		Producto pd = new Producto(05, 152, "milk");
		Telefono tl = new Telefono(04, "Cel", "01122548978");
		Cliente cl = new Cliente(6, "Alex", tl, dm, 1006);
		
		System.out.println("mostramos estado de atributos");
		System.out.println(cl.toString());
		System.out.println(pd.toString());
		
		
		
		
		
	}
}
