

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class EmployeeDao {
	Connection conn=DatabaseConnection.createConnection();
	PreparedStatement ps=null;
	//Data Access Object
	public EmployeeDao(){
		
	}
	public void create(Employee emp){
		String sql="insert into employee (name,code) values (?,?)";
		try {
			ps=(PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1,emp.getName());
			ps.setString(2,emp.getCode());
			ps.execute();
			System.out.println("create Employee successfully!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Employee> retrieve(){
		List<Employee> listEmployee=new ArrayList<Employee>();
		if(conn==null){
			System.out.println("xxx EmployeeDao can't connect to Database");
			
			Employee emp=new Employee(001,"name","code");
			Employee emp2=new Employee(002,"tony","code2");
			Employee emp3=new Employee(003,"zhou","code3");
			listEmployee.add(emp);
			listEmployee.add(emp2);
			listEmployee.add(emp3);
			return listEmployee;
		}
		String sql="select * from employee";
		try {
			ps=(PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Employee emp=new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setCode(rs.getString("code"));
				listEmployee.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return listEmployee;
	}
	public Employee retrieveById(String id){
		String sql="select * from employee where id = ?";
		Employee employee=new Employee();
		try {
			ps=(PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("EmployeeDao "+sql);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				employee.setCode(rs.getString("code"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return employee;
	}
	public boolean updateEmployee(Employee emp){
		String sql="update employee set name=?,code=? where id=?";
		System.out.println("EmployeeDao "+emp.getName());
		try {
			ps=(PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getCode());
			ps.setString(3, emp.getId() + "");
			System.out.println("EmployeeDao "+ps.getPreparedSql());
			return ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return false;
	}
}
