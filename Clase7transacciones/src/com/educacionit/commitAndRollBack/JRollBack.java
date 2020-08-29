package com.educacionit.commitAndRollBack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JRollBack {
	public static void main(String[] args) {
		Connection connection = DataBase.getConnection();
		PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;
		try {

			connection.setAutoCommit(false);
			// se preparan las sentencias SQL
			stmt1 = connection.prepareStatement("INSERT INTO mitabla VALUES( ?, ?);");
			stmt2 = connection.prepareStatement("INSERT INTO miotratabla VALUES( ?, ?, ?);");

			System.out.println("Primer INSERT tabla [miTabla]");
			stmt1.setString(1, "000001111");
			stmt1.setString(2, "micorreo@mail.com");
			stmt1.executeUpdate();

			System.out.println("Segundo INSERT tabla [miTabla]");
			stmt1.setString(1, "000002222");
			stmt1.setString(2, "Marcelo@mail.com");
			stmt1.executeUpdate();

			System.out.println("Tercer INSERT tabla [miTabla]");
			stmt1.setString(1, "000003333");
			stmt1.setString(2, "monica@mail.com");
			stmt1.executeUpdate();

			System.out.println("Primer INSERT tabla [miOtraTabla]");
			stmt2.setString(1, "Miguel");
			stmt2.setString(2, "Luna");
			 stmt2.setInt(3, 26);
			//stmt2.setString(3, "Hola soy un ERROR"); FORZAMOS UN ERROR
			stmt2.executeUpdate();
			// se indica que se deben aplicar los cambios en la base de datos
			connection.commit();

		} catch (SQLException ex) {
			System.out.println("ERROR: " + ex.getMessage());
			if(connection != null) {
				System.out.println("ROLL BACK");
				try {
					//desacemos todos los cambios realizados en los datos 
					connection.rollback();
					System.out.println("se logro desacer los cambios ");
				}catch(SQLException e) {
					System.out.println("NO SE PUDO DESAHCER " + e.getMessage());
				}
			}
		}finally  {
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

