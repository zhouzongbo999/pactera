package com.tony.util;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import com.tony.model.Employee;


public class WriteXML{
	public void write(){
		Document document=new Document();
		Element root=new Element("Users");
		Element user=new Element("User");
		Element id=new Element("id");
		Element name=new Element("name");
		Element age=new Element("age");
//		Element code=new Element("code");
		id.setText("001");
		name.setText("tony");
		age.setText("25");
		
		Element user2=new Element("User");
		Element id2=new Element("id");
		Element name2=new Element("name");
		Element age2=new Element("age");
//		Element code2=new Element("code");
		id2.setText("002");
		name2.setText("zhou");
		age2.setText("26");
		
		user.addContent(id);
		user.addContent(name);
		user.addContent(age);
		root.addContent(user);
		
		user2.addContent(id2);
		user2.addContent(name2);
		user2.addContent(age2);
		root.addContent(user2);
		
		document.addContent(root);
		
		XMLOutputter put=new XMLOutputter();
		Writer writer;
		try {
			writer = new FileWriter("C:/Documents and Settings/Administrator/����/�½��ļ���/Users.xml");
			put.setFormat(Format.getPrettyFormat());
			put.output(document,writer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String write(List<Employee> list){
		String filePath="C:/Documents and Settings/Administrator/����/�½��ļ���/Employees.xml";
		Document document=new Document();
		Element root=new Element("Employees");
		Iterator<Employee> it=list.iterator();
		while(it.hasNext()){
			Employee obj=it.next();
			Element employee=new Element(obj.getClass().getName());
			Element id=new Element("id");
			Element name=new Element("name");
			Element age=new Element("age");
			Element code=new Element("code");
			id.setText(String.valueOf(obj.getId()));
			name.setText(obj.getName());
			age.setText("25");
			code.setText(obj.getCode());
			
			employee.addContent(id);
			employee.addContent(name);
			employee.addContent(age);
			employee.addContent(code);
			
			root.addContent(employee);
		}
		document.addContent(root);
		XMLOutputter put=new XMLOutputter();
		Writer writer;
		try {
			writer = new FileWriter(filePath);
			put.setFormat(Format.getPrettyFormat());
			put.output(document,writer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filePath;
	}
}
