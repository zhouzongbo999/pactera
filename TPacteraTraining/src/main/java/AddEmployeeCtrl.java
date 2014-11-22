
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployeeCtrl
 */
@WebServlet("/AddEmployeeCtrl")
public class AddEmployeeCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddEmployeeCtrl() {
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
		System.out.println("get request");
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String code=request.getParameter("code");
		System.out.println(id+name+code);
		Employee employee=new Employee(name,code);
		IEmployeeService service=new EmployeeService();
		service.addEmployee(employee);
		response.sendRedirect("GetEmployeesCtrl");
	}

}
