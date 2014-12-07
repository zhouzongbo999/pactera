package com.tony.util;
import com.tony.config.DatabaseConnection;

public class Test {
	
	public static void main(String[] args){
		DatabaseConnection dc=new DatabaseConnection();
		dc.createConnection();
		DatabaseConnection.createConnection();
		
//		Employee employee=new Employee(0, "tony", "111");
//		IEmployeeService iEmployeeService=new EmployeeService();
//		iEmployeeService.addEmployee(employee);
		
//		ReadXML read=new ReadXML();
//		read.read();
		
//		IEmployeeService employeeService=new EmployeeService();
//		List<Employee> listEmployee=employeeService.getEmployees();
//		WriteXML write=new WriteXML();
//		ReadXML read=new ReadXML();
//		String filePath="";
//		filePath=write.write(listEmployee);
//		listEmployee=read.read(filePath);
//		Iterator<Employee> it=listEmployee.iterator();
//		System.out.println("xxx Test read xml data");
//		while(it.hasNext()){
//			Employee employee=it.next();
//			System.out.println(employee.getId());
//			System.out.println(employee.getName());
//			System.out.println(employee.getCode());
//		}
//		File file=new File("C:/Documents and Settings/Administrator/����/�½��ļ���/test.xml");
		
//		@SuppressWarnings("resource")
//		ApplicationContext context=new AnnotationConfigApplicationContext(MysqlConfig.class,FactorySmall.class,FactoryBig.class);
//		FactoryBig big=context.getBean(FactoryBig.class);
//		big.speak();
		
//		ApplicationContext context=new AnnotationConfigApplicationContext(MysqlConfig.class);
//		EmployeeDao dao=context.getBean(EmployeeDao.class);
//		dao=(EmployeeDao)context.getBean("employeeDao");
//		//error
////		dao=new EmployeeDao();
//		List<Employee> listEmployee=dao.retrieve();
//		System.out.println(listEmployee.size());
////		dao.init();
//		IEmployeeService employeeService=context.getBean(EmployeeService.class);
//		employeeService.speak();
//		MysqlConfig mysqlConfig=context.getBean(MysqlConfig.class);
//		mysqlConfig.speak();
		
		
	}
}
