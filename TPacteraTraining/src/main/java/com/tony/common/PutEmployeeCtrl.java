package com.tony.common;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tony.model.Employee;
import com.tony.service.EmployeeService;
import com.tony.service.IEmployeeService;

/**
 * Servlet implementation class PutEmployeeCtrl
 */
@WebServlet("/PutEmployeeCtrl")
public class PutEmployeeCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PutEmployeeCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		IEmployeeService employeeService=new EmployeeService();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String code=request.getParameter("code");
		System.out.println("PutEmployeeCtrl "+id+name+code);
		Employee emp=new Employee();
		emp.setId(Integer.valueOf(id));
		emp.setName(name);
		emp.setCode(code);
		System.out.println("PutEmployeeCtrl "+emp.getName());
		boolean result=employeeService.putEmpoyee(emp);
		System.out.println("PutEmployeeCtrl "+result);
		response.sendRedirect("GetEmployeeCtrl");
	}

}
