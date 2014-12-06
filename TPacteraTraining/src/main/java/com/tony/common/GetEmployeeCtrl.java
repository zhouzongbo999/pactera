package com.tony.common;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tony.model.Employee;
import com.tony.service.EmployeeService;
import com.tony.service.IEmployeeService;

/**
 * Servlet implementation class AddEmployeeCtrl
 */
@WebServlet("/GetEmployeeCtrl")
public class GetEmployeeCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GetEmployeeCtrl() {
        // TODO Auto-generated constructor stub
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		IEmployeeService service=new EmployeeService();
		String id=request.getParameter("id");
		System.out.println("GetEmployeeCtrl"+id);
		if(id!=null){
			Employee emp=service.getEmployeeById(id);
			request.setAttribute("employee", emp);
			request.getRequestDispatcher("PutEmployee.jsp").forward(request, response);
		}
		else{
			List<Employee> list=service.getEmployees();
			request.setAttribute("employees", list);
			request.getRequestDispatcher("GetEmployee.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
