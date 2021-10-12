package com.in.webProject.registrationForm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.in.webProject.registrationForm.model.Employee;

public class EmployeeDao {
	
	public int registerEmployee(Employee employee) throws ClassNotFoundException{
		
		String INSERT_USERS_SQL="INSERT INTO employee"+"(id,first_name,last_name,username,userPassword,emailId,address,contact) VALUES"+"(?,?,?,?,?,?,?,?)";
		
		int result=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/employees?useSSL=false","root","Raj@151293");
				
			//Step 2 : Create the Statement using Connection object
				
			PreparedStatement  preparedStatement =connection.prepareStatement(INSERT_USERS_SQL)){
				 preparedStatement.setInt(1, 1);
					 preparedStatement.setString(2,employee.getFirstName());
					 preparedStatement.setString(3, employee.getLastName());
					 preparedStatement.setString(4, employee.getUserName());
					 preparedStatement.setString(5, employee.getUserPassword());
					 preparedStatement.setString(6, employee.getEmailId());
					 preparedStatement.setString(7, employee.getAddress());
					 preparedStatement.setString(8, employee.getContact());
					 
				 System.out.println( preparedStatement);
					 //Step 3: Execute query and update query
					 result= preparedStatement.executeUpdate();
				}catch(SQLException e)
				{
					e.printStackTrace();
				
			}
			
			
		

		return result;
		
}
		
		

}
	
