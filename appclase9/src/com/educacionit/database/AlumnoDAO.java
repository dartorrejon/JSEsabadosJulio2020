package com.educacionit.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.educacionit.models.AlumnoVO;
public class AlumnoDAO {
	
	public void inserta(AlumnoVO alumno) throws SQLException{
		Connection conn = ConexionDB.getConnection();
		PreparedStatement stm = conn.prepareStatement("INSERT INTO ALUMNO (nombre,apellido,email,lista,telefono,mensaje) VALUES (?,?,?,?,?,?)");
		stm.setString(1,alumno.getName());
		stm.setString(2,alumno.getApellido());
		stm.setString(3,alumno.getEmail());
		stm.setString(4,alumno.getLista());
		stm.setString(5,alumno.getPhone());
		stm.setString(6,alumno.getMessage());	
		stm.execute();
		stm.close();
		conn.close();	
	}
}
