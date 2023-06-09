package com.educacioit.main;
import javax.swing.JOptionPane;
import com.educacioit.clases.Persona;

public class AppPrincipal {

	public static void main(String[] args) {

		Persona p1 = new Persona();
		int edadIngresada = 0 ;
		String nombreIngresado = null;
		
		nombreIngresado = JOptionPane.showInputDialog("Ingrese su nombre");
		
		edadIngresada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
		
		p1.setEdad(edadIngresada);
		p1.setNombre(nombreIngresado);

		if(p1.getEdad() >0)
		JOptionPane.showMessageDialog(null, p1.toString());
		
	}

}
