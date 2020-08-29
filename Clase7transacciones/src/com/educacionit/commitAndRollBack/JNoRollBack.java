package com.educacionit.commitAndRollBack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class JNoRollBack {
	public static void main(String[] args) {		
		Connection connection = DataBase.getConnection();		
		PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;		
		try {
			//se preparan las sentencias SQL
			stmt1 = connection.prepareStatement("INSERT INTO mitabla VALUES( ?, ?);");
			stmt2 = connection.prepareStatement("INSERT INTO miotratabla VALUES( ?, ?, ?);");
			
			System.out.println("Primer INSERT tabla [miTabla]");
			stmt1.setString(1, "0000010");
			stmt1.setString(2, "micorreo@mail.com");
			stmt1.executeUpdate();
			
			System.out.println("Segundo INSERT tabla [miTabla]");
			stmt1.setString(1, "0000020");
			stmt1.setString(2, "Marcelo@mail.com");
			stmt1.executeUpdate();
			
			System.out.println("Tercer INSERT tabla [miTabla]");
			stmt1.setString(1, "0000030");
			stmt1.setString(2, "monica@mail.com");
			stmt1.executeUpdate();
			
			System.out.println("Primer INSERT tabla [miOtraTabla]");
			stmt2.setString(1, "Carlos");
			stmt2.setString(2, "Azurduy");
			stmt2.setInt(3, 26);	
			//stmt2.setString(3, "Hola soy un ERROR");
			stmt2.executeUpdate();
			
		}catch (SQLException ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}finally {
			System.out.println("Se cierra la conexion a la base de datos");
			try {
				if(stmt1 != null) stmt1.close();
				if(stmt2 != null) stmt2.close();
				if(connection != null) connection.close();
			}catch (SQLException e) {
				System.out.println("ALGUN CLOSE DEL FINALLY NO SE EJECUTO CORRECTAMENTE " + e.getMessage());
			}
		}
		
		
		
	}
}
