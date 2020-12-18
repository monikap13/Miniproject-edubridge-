package net.javaguides.registation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import net.javaguides.registration.model.Employee;

public class EmployeeDao {
	
	public int registerEmployee(Employee employee) throws ClassNotFoundException{
		
		String INSERT_USER_SQL = "INSERT INTO admin" +  "(admin_id, name, username, password ) VALUES"  + "(?,?,?,?);";
		
		int result = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		try(
		    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db?useSSL=false", "root", "root");
			PreparedStatement prepareStatement = connection.prepareStatement(INSERT_USER_SQL)) {
			
//			prepareStatement.setInt(1, 1);
			prepareStatement.setString(1, employee.getId());
			prepareStatement.setString(2, employee.getName());
			prepareStatement.setString(3, employee.getUsername());
			prepareStatement.setString(4, employee.getPassword());
			
			System.out.println(prepareStatement);
			
			result = prepareStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return result;
		
	}

}
