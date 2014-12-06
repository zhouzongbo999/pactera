package com.tony.util;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import com.tony.model.Employee;


public class ReadXML {
	
	public List<Employee> read (String filePath) {
		List<Employee> listEmployee=new ArrayList<Employee>();
		SAXBuilder builder=new SAXBuilder();
//		File file=new File("D:\\workspace\\tonyWeb\\src\\main\\java\\Employees.xml");
		File file=new File(filePath);
		try {
			Document document=builder.build(file);
			Element root=document.getRootElement();
			@SuppressWarnings("unchecked")
			List<Element> children=root.getChildren();
			Iterator<Element> it=children.iterator();
			while(it.hasNext()){
				Element employeeE=it.next();
				System.out.println(employeeE.getName());
				System.out.println(employeeE.getChildText("id"));
				System.out.println(employeeE.getChildText("name"));
				System.out.println(employeeE.getChildText("age"));
				System.out.println(employeeE.getChildText("code"));
				Employee employee=new Employee();
				employee.setId(Integer.valueOf(employeeE.getChildText("id")));
				employee.setName(employeeE.getChildText("name"));
				employee.setCode(employeeE.getChildText("code"));
				listEmployee.add(employee);
				
			}
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listEmployee;
		
	}
}
