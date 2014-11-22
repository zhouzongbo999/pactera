

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
		String sql="select * from employee";
		List<Employee> list=new ArrayList();
		try {
			ps=(PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Employee emp=new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setCode(rs.getString("code"));
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}
