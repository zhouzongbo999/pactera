

import java.util.List;

public class EmployeeService implements IEmployeeService{
	EmployeeDao employeeDao=new EmployeeDao();
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.create(emp);
	}
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.retrieve();
	}
	@Override
	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return employeeDao.retrieveById(id);
	}
	@Override
	public boolean putEmpoyee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(emp);
	}

}
