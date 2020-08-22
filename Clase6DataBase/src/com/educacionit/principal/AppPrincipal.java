package com.educacionit.principal;

import com.educacionit.conexion.Conexion;
import com.educacionit.daos.PersonaDAO;
import com.educacionit.modelos.PersonaVO;

public class AppPrincipal {

	public static void main(String[] args) {
		//Conexion cn = new Conexion();
		PersonaVO p1 = new PersonaVO(2, 35, 151515, "JUANA", "ABOGADA");
		PersonaDAO pdao = new PersonaDAO();
		//pdao.registrarPersona(p1);
		pdao.eliminarPersona("1");
//		p1 = pdao.buscarPersona(1);
//		
//		System.out.println("te traje este registro de la db");
//		System.out.println(p1.toString());
	}

}
