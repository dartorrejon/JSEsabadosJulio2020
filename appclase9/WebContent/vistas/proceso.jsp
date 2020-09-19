<%@page import="java.sql.SQLException"%>
<%@page import="com.educacionit.database.AlumnoDAO"%>
<%@page import="com.educacionit.models.AlumnoVO"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Soy un JSP</title>

</head>
<body>

	Hola soy un Java Server Pages
	<br> La fecha y la hora es
	<%=new Date()%>
	<br>
	<%
		String telefono = request.getParameter("telefono");
	String name = request.getParameter("nombre");
	String prefieres = request.getParameter("preferencia");
	String apellido = request.getParameter("apellido");
	
	//public AlumnoVO(String name, String apellido, String phone, String message, String email, String lista) {
// 	AlumnoVO a1 =new AlumnoVO(name,apellido ,telefono, "soy un mensaje" ,"alex@gmail.com",prefieres);
// 	AlumnoDAO dao = new AlumnoDAO();
// 	try {
// 		dao.inserta(a1);
// 	} catch (SQLException e) {
		
// 		e.printStackTrace();
// 	}
	out.print("tu nombre es " + request.getParameter("nombre") + " " + request.getParameter("apellido"));
	out.print("<br>telefono " + telefono + "anios");
	out.print("<br>tu lenguaje favorito es " +request.getParameter("lenguaje"));
	out.print("<br>");
	out.print("y prefieres el / la " + prefieres + " de un proyecto ");
	out.print("<br>");
	
	
	out.print("request.getLocalAddr :" + request.getLocalAddr());
	out.print("<br>");
	out.print("request.getRemoteHost :" + request.getRemoteHost());
	out.print("<br>");
	out.print("request.getContentType :" + request.getContentType());
	out.print("<br>");
System.out.print("request.getContextPath :" + request.getContextPath());

	
	//asi se envian  datos entre distintos .jsp
// 	request.setAttribute("UnEntero", new Integer(22));
// 	request.getRequestDispatcher("destino.jsp").forward(request, response);
	
	
	%>

</body>
</html>