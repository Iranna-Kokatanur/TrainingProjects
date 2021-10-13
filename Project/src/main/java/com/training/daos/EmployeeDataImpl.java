package com.training.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NameNotFoundException;

import com.training.entity.Employee;

import com.training.ifaces.CrudRepository;

public class EmployeeDataImpl implements CrudRepository<Employee,Integer> {
	
	private ArrayList<Employee>list = new ArrayList<>();
	
	private Connection con;

	public EmployeeDataImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public boolean add(Employee t) {

		String sql = "insert into employee values(?,?,?,?,?,?,?,?)";
		
		int rowAdded=0;
		
		try(PreparedStatement psmt = con.prepareStatement(sql)){
			
			psmt.setInt(1, t.getEmpId());
			psmt.setString(2, t.getFirstName());
			psmt.setString(3, t.getLastName());
			psmt.setString(4, t.getAddress());
			psmt.setString(5, t.getEmail());
			psmt.setDate(6, Date.valueOf(t.getDateOfBirth()));
			psmt.setDate(7, Date.valueOf(t.getWeddingAnniversary()));
			psmt.setLong(8, t.getPhoneNumber());
			
			rowAdded=psmt.executeUpdate();
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return (rowAdded>=1)?true:false;
		
	}



	@Override
	public int updateOrAdd(Employee t) {

		int count=0;
		boolean status=status(t);
		if(status) {
			System.out.println("Employee Id is not present");
			add(t);
			
		}else {
			String sql="update employee set firstName=?,lastName=?,address=?,email=?,dateOfBirth=?,weddingAnniversary=?,phoneNumber=? where empId=?";
			try(PreparedStatement psmt = con.prepareStatement(sql)){
				
				
				psmt.setString(1, t.getFirstName());
				psmt.setString(2, t.getLastName());
				psmt.setString(3, t.getAddress());
				psmt.setString(4, t.getEmail());
				psmt.setDate(5, Date.valueOf(t.getDateOfBirth()));
				psmt.setDate(6, Date.valueOf(t.getWeddingAnniversary()));
				psmt.setLong(7, t.getPhoneNumber());
				psmt.setInt(8, t.getEmpId());
				count=psmt.executeUpdate();
			}catch(SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		return count;
	}

	@Override
	public boolean remove(Integer empId) {
		
       String sql = "delete from employee where empId = ? ";
		
		int rowDeleted=0;
         try(PreparedStatement psmt = con.prepareStatement(sql)){
			
			psmt.setInt(1, empId);
			rowDeleted=psmt.executeUpdate();
         }catch (SQLException e) {
			
        	 e.printStackTrace();
		}
		
         return (rowDeleted>=1)?true:false;
	}

	Employee emp=null;
	@Override
	public Employee findById(Integer employeeId) {
		String sql = "select * from employee where empId=?";
      
		
		try(PreparedStatement psmt = con.prepareStatement(sql)){
			
			psmt.setInt(1, employeeId);

			ResultSet rs= psmt.executeQuery();
	        while(rs.next()) {
	     	     String firstName1=rs.getString("firstName");
	     	     String lastName1=rs.getString("lastName");
	     	     int empId = rs.getInt("empId");
	     	     String address=rs.getString("address");
	     	     String email=rs.getString("email");
	     	     Long phoneNumber=rs.getLong("phoneNumber");
	     	     LocalDate dateOfBirth = rs.getDate("dateOfBirth").toLocalDate();
	     	     LocalDate weddingAnniversary = rs.getDate("weddingAnniversary").toLocalDate();

	     	    emp=new Employee( empId, firstName1,lastName1, address,  email, phoneNumber,
							dateOfBirth, weddingAnniversary);
				 
	        }

		}catch(SQLException e) {
				e.printStackTrace();
			}
		return emp;
	}

	
	@Override
	public List<Employee> findByName(String first, String last) throws NameNotFoundException {
		
        String sql = "select * from employee where firstName=? and lastName=?";
        ArrayList<Employee>list = new ArrayList<>();
		try(PreparedStatement psmt = con.prepareStatement(sql)){
			
			psmt.setString(1, first);
			psmt.setString(2, last);
			ResultSet rs= psmt.executeQuery();
            while(rs.next()) {
         	     String firstName1=rs.getString("firstName");
				String lastName1= rs.getString("lastName");
         	     int empId = rs.getInt("empId");
         	     String address=rs.getString("address");
         	     String email=rs.getString("email");
         	     Long phoneNumber=rs.getLong("phoneNumber");
         	     LocalDate dateOfBirth = rs.getDate("dateOfBirth").toLocalDate();
         	     LocalDate weddingAnniversary = rs.getDate("weddingAnniversary").toLocalDate();

         	    Employee emp=new Employee( empId, firstName1,lastName1, address,  email, phoneNumber,
   						dateOfBirth, weddingAnniversary);
   			 list.add(emp);
            }


		}catch(SQLException e) {
				e.printStackTrace();
			}
		if(list.size()==0) {
			throw new NameNotFoundException();
		}
		return list;
	}
	

	@Override
	public List<Employee> findAll() {
		
		String sql = "select * from employee";
      ArrayList<Employee>list = new ArrayList<>();
	try(PreparedStatement psmt = con.prepareStatement(sql)){
		

		ResultSet rs= psmt.executeQuery();
        while(rs.next()) {
     	     String firstName1=rs.getString("firstName");
     	     String lastName1=rs.getString("lastName");
     	     int empId = rs.getInt("empId");
     	     String address=rs.getString("address");
     	     String email=rs.getString("email");
     	     Long phoneNumber=rs.getLong("phoneNumber");
     	     LocalDate dateOfBirth = rs.getDate("dateOfBirth").toLocalDate();
     	     LocalDate weddingAnniversary = rs.getDate("weddingAnniversary").toLocalDate();

     	    Employee emp=new Employee( empId, firstName1,lastName1, address,  email, phoneNumber,
						dateOfBirth, weddingAnniversary);
			 list.add(emp);
        }

	}catch(SQLException e) {
			e.printStackTrace();
		}
	return list;
	}
	

	@Override
	public List<Employee> findByWeddingDate(LocalDate date) {
		String sql = "select * from employee where to_number(to_char(weddingAnniversary,'DD'))=to_number(to_char(?,'DD')) and to_number(to_char(weddingAnniversary,'MM'))=to_number(to_char(?,'MM'))";
        ArrayList<Employee>list = new ArrayList<>();
		try(PreparedStatement psmt = con.prepareStatement(sql)){
			
			psmt.setDate(1, Date.valueOf(date));
			psmt.setDate(2, Date.valueOf(date));
			ResultSet rs= psmt.executeQuery();
            while(rs.next()) {
         	     String firstName1=rs.getString("firstName");
         	     String lastName1=rs.getString("lastName");
         	     int empId = rs.getInt("empId");
         	     String address=rs.getString("address");
         	     String email=rs.getString("email");
         	    Long phoneNumber=rs.getLong("phoneNumber");
         	     LocalDate dateOfBirth = rs.getDate("dateOfBirth").toLocalDate();
         	     LocalDate weddingAnniversary = rs.getDate("weddingAnniversary").toLocalDate();

         	    Employee emp=new Employee( empId, firstName1,lastName1, address,  email, phoneNumber,
   						dateOfBirth, weddingAnniversary);
   			 list.add(emp);
            }

		}catch(SQLException e) {
				e.printStackTrace();
			}
		return list;
	}

	@Override
	public List<Employee> findByBirthDate(LocalDate date) {
		String sql = "select * from employee where to_number(to_char(dateOfBirth,'DD'))=to_number(to_char(?,'DD')) and to_number(to_char(dateOfBirth,'MM'))=to_number(to_char(?,'MM'))";
        ArrayList<Employee>list = new ArrayList<>();
		try(PreparedStatement psmt = con.prepareStatement(sql)){
			
			psmt.setDate(1, Date.valueOf(date));
			psmt.setDate(2, Date.valueOf(date));
			ResultSet rs= psmt.executeQuery();
            while(rs.next()) {
         	     String firstName1=rs.getString("firstName");
         	     String lastName1=rs.getString("lastName");
         	     int empId = rs.getInt("empId");
         	     String address=rs.getString("address");
         	     String email=rs.getString("email");
         	    Long phoneNumber=rs.getLong("phoneNumber");
         	     LocalDate dateOfBirth = rs.getDate("dateOfBirth").toLocalDate();
         	     LocalDate weddingAnniversary = rs.getDate("weddingAnniversary").toLocalDate();

         	    Employee emp=new Employee( empId, firstName1,lastName1, address,  email, phoneNumber,
   						dateOfBirth, weddingAnniversary);
   			 list.add(emp);
            }

		}catch(SQLException e) {
				e.printStackTrace();
			}
		return list;
	}
	
	public boolean status(Employee t) {
		
		boolean flag=true;
		List<Employee>list=findAll();
		for(Employee e:list) {
			if(e.getEmpId()==t.getEmpId()) {
				flag=false;
			}
		}
		return flag;
		
		
	}
}

	
	

