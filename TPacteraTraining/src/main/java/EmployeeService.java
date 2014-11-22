

import java.util.List;

public class EmployeeService implements IEmployeeService{
	EmployeeDao employeeDao=new EmployeeDao();
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.create(emp);
	}
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.retrieve();
	}

}
