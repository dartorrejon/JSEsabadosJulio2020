package com.educacionit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.educacionit.database.AlumnoDAO;
import com.educacionit.models.AlumnoVO;

@WebServlet("/FormController")
public class FormController extends HttpServlet{
	
	public FormController() {}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served At:").append(request.getContextPath());
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		pw.write("<h1>Te contactaremos Pronto </h1> <br>");
		pw.write("<h1>Gracias Por Tu respuesta</h1>");
		//pw.write("<h3>recibimos los siguientes datos : </h3>");
		//capturamos los datos enviados en el formulario
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String apellido = request.getParameter("apellido");
		String phone = request.getParameter("phone");
		String message = request.getParameter("message");
		
		String [] con = request.getParameterValues("lista");
		
		AlumnoVO a1 =new AlumnoVO(name, apellido, phone, message, email, "JAVA");
		AlumnoDAO dao = new AlumnoDAO();
		try {
			dao.inserta(a1);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			
		
		System.out.println("se recibio los siguientes datos del front : ");
		System.out.println(name);
		System.out.println(email);
		System.out.println(apellido);
		System.out.println(phone);
		System.out.println(message);
		
	
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
}


