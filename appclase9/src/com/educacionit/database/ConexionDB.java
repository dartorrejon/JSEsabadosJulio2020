package com.educacionit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.educacionit.models.AlumnoVO;

public class ConexionDB {
	private final static String bd = "alumnos2";
	private final static String login = "root";
	private final static String password = "";
	private final static String url = "jdbc:mysql://localhost/" + bd;
	static Connection conn = null;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, login, password);
			if (conn != null) {
				System.out.println("se conecto a la base!" + bd);
			}
			return conn;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public void desconectarDB() {
		if (conn != null) {
			conn = null;
		}
	}

	public static void main(String[] args) {
		ConexionDB.getConnection();
		AlumnoDAO dao = new AlumnoDAO();
		/*try {
			//dao.inserta(new AlumnoVO("alex", "deassis", "1515151", "soy el mensaje", "alex@mail.com", "JAVA"));
		} catch (SQLException e) {
		
			e.printStackTrace();
		}*/
		
	}
}
