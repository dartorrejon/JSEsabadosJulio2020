package com.educacionit.daos;

import java.sql.*;
import com.educacionit.conexion.Conexion;
import com.educacionit.modelos.PersonaVO;

//Data Access Object - CRUD
public class PersonaDAO {

	public void registrarPersona(PersonaVO miPersona) {
		Conexion conex = new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO persona VALUES ('" + miPersona.getIdPersona() + "','"
					+ miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona() + "','"
					+ miPersona.getProfesionPersona() + "','" + miPersona.getTelefonoPersona() + "')");
			System.out.println("Se registro correctamente a " + miPersona.getNombrePersona());
			estatuto.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("No se logro registrar a " + miPersona.getNombrePersona());
		} finally {
			conex.desconectar();
		}
	}

	public PersonaVO buscarPersona(int codigo) {
		Conexion conex = new Conexion();
		PersonaVO persona = new PersonaVO();
		boolean existe = false;
		try {
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM persona where id = ?");
			consulta.setInt(1, codigo);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				existe = true;
				persona.setIdPersona(Integer.parseInt(res.getString("id")));
				persona.setNombrePersona(res.getString("nombre"));
				persona.setProfesionPersona(res.getString("profesion"));
				persona.setEdadPersona(Integer.parseInt(res.getString("edad")));
				persona.setTelefonoPersona(Integer.parseInt(res.getString("telefono")));
			}
			res.close();
			conex.desconectar();
		} catch (SQLException e) {
			System.out.println("Error no se pudo buscar la persona ");
			System.out.println(e.getMessage());
		}

		if (existe) {
			return persona;
		} else {
			return null;
		}
	}

	public void modificarPersona(PersonaVO miPersona) {
		Conexion conex = new Conexion();
		try {
			String consulta = "UPDATE persona SET id = ? , nombre = ?, edad = ?,profesion = ?, telefono =?  WHERE id = ? ";
			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);
			estatuto.setInt(1, miPersona.getIdPersona());
			estatuto.setString(2, miPersona.getNombrePersona());
			estatuto.setInt(3, miPersona.getEdadPersona());
			estatuto.setString(4, miPersona.getProfesionPersona());
			estatuto.setInt(5, miPersona.getTelefonoPersona());
			estatuto.setInt(6, miPersona.getIdPersona());
			estatuto.executeUpdate();
			System.out.println("se actulizo el registro de " + miPersona.getNombrePersona());

		} catch (SQLException e) {
			System.out.println("Error no se pudo ACTUALIZAR la persona ");
			System.out.println(e.getMessage());
		} finally {
			conex.desconectar();
		}
	}

	public void eliminarPersona(String codigo) {
		Conexion conex = new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("DELETE FROM persona WHERE id = '" + codigo + "'");
			System.out.println("se logro  eliminar el registro con id " + codigo);
			estatuto.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("NOOOOOOOOOOO se logro registrar eliminar el registro con id " + codigo);
		} finally {
			conex.desconectar();
		}

	}
}
