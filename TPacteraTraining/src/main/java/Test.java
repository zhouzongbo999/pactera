import java.io.File;
import java.util.Iterator;
import java.util.List;

public class Test {
	
	public static void main(String[] args){
//		DatabaseConnection dc=new DatabaseConnection();
//		dc.createConnection();
//		DatabaseConnection.createConnection();
		
//		Employee employee=new Employee(0, "tony", "111");
//		IEmployeeService iEmployeeService=new EmployeeService();
//		iEmployeeService.addEmployee(employee);
		
//		ReadXML read=new ReadXML();
//		read.read();
		
		IEmployeeService employeeService=new EmployeeService();
		List<Employee> listEmployee=employeeService.getEmployees();
		WriteXML write=new WriteXML();
		ReadXML read=new ReadXML();
		String filePath="";
		filePath=write.write(listEmployee);
		listEmployee=read.read(filePath);
		Iterator<Employee> it=listEmployee.iterator();
		System.out.println("xxx Test read xml data");
		while(it.hasNext()){
			Employee employee=it.next();
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getCode());
		}
//		File file=new File("C:/Documents and Settings/Administrator/桌面/新建文件夹/test.xml");
		
	}
}
