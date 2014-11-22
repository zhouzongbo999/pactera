public class Test {
	
	public static void main(String[] args){
//		DatabaseConnection dc=new DatabaseConnection();
//		dc.createConnection();
//		DatabaseConnection.createConnection();
		Employee employee=new Employee(0, "tony", "111");
		IEmployeeService iEmployeeService=new EmployeeService();
		iEmployeeService.addEmployee(employee);
	}
}
