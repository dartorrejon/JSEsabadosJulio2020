package com.educacionit.conexion;

import java.sql.*;

//Clase que me permite conectar con la base de datos
public class Conexion {

	static String db = "baseclase6";
	static String login = "root";
	static String password = "";
	static String url = "jdbc:mysql://localhost/" + db;

	Connection conn = null;

	/** Constructor de DbConnection */
	public Conexion() {
		try {
			// obtenemos el driver de conexion a mySql
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, login, password);
			if (conn != null) {
				System.out.println("Conectamos a la base " + db + " corrrectamente");
			}
		} catch (SQLException e) {
			System.out.println("SQLException" + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Te olvidaste de poner la clase " + e.getMessage());
		} catch (Exception e) {
			System.out.println("sucedio un error Generico" + e.getMessage());
		}

	}
	
	public Connection getConnection() {
		return conn;
	}
	
	public void desconectar() {
		conn = null;
		System.out.println("Cerramos la conexion!");
	}

}
