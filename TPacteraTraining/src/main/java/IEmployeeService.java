

import java.util.List;

public interface IEmployeeService {
	void addEmployee(Employee emp);
	List<Employee> getEmployees();
	Employee getEmployeeById(String id);
	boolean putEmpoyee(Employee emp);
}
