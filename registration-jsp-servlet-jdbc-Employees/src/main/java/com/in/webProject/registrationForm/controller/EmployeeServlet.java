package com.in.webProject.registrationForm.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in.webProject.registrationForm.dao.EmployeeDao;
import com.in.webProject.registrationForm.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDao employeeDao = new EmployeeDao();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.sendRedirect("employeeregister.jsp");
		RequestDispatcher dispatcher =request.getRequestDispatcher("/WEB-INF/views/employeeregister.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String firstName =request.getParameter("firstName");
		String  lastName =request.getParameter("lastName");
		String userName=request.getParameter("userName");
		String userPassword=request.getParameter("userPassword");
		String emailId=request.getParameter("emailId");
		String  address=request.getParameter("address");
		String contact=request.getParameter("contact");
		//System.out.println(lastName+" "+request.getParameter("lastName"));
		
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setUserName(userName);
		employee.setUserPassword(userPassword);
		employee.setEmailId(emailId);
		employee.setAddress(address);
		employee.setContact(contact);
		
		try {
		employeeDao.registerEmployee(employee);
		
		
	}catch(ClassNotFoundException e)
		{
		e.printStackTrace();
		}
		//response.sendRedirect("");
		RequestDispatcher dispatcher =request.getRequestDispatcher("/WEB-INF/views/employeedetails.jsp");
		dispatcher.forward(request, response);
		
	}

}
