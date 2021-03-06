package com.java.layer3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.java.layer2.Department;
 
public class DepartmentDAOimpl implements DepartmentDAO {

	Connection conn;
	public  DepartmentDAOimpl()
	{
		try
		{
			System.out.println("DepartmentDAOimpl :loading the driver....getting the connection...");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered..");
			conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb");
			System.out.println("Connected..."+conn);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public void insertDepartment(Department dobj) 
	{
		System.out.println("DepartmentDAOimpl : insertDepartment(Department)- inserting Department...");
	try
		{
			PreparedStatement pst=conn.prepareStatement("insert into dept values(?,?,?)");
			pst.setInt(1, dobj.getDepartmentNumber());
			pst.setString(2, dobj.getDepartmentName());
			pst.setString(3, dobj.getDepatmentLocation());
			int rows=pst.executeUpdate();
			System.out.println("row created :rows");
			pst.close();
			conn.close();

	}
	catch(SQLException e)
	
	{
		e.printStackTrace();
	}
		
	}
	
	@Override
	public Department selectDepartment(int dno) {
		// TODO Auto-generated method stub
		System.out.println("DepartmentDAOImpl : selecting department by deptno");
		
		
		Department dept = null;
		try {
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from dept where deptno="+dno);
				if(rs.next() ) 
				{
					dept = new Department();
					dept.setDepartmentNumber(rs.getInt(1));
					dept.setDepartmentName(rs.getString(2));
					dept.setDepatmentLocation(rs.getString(3));
					
				}
		} 
		catch (SQLException e)
		{	e.printStackTrace(); }
		return dept;
	}

	

	@Override
	public List<Department> selectDepartment() {
		List<Department> deptList=new  ArrayList<Department>();
		try
		{
			System.out.println("DepartmentDAOimpl : Selecting all Department");
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from dept");
			while(rs.next())
			{
				Department dept=new Department();
				dept.setDepartmentNumber(rs.getInt(1));
				dept.setDepartmentName(rs.getString(2));
				dept.setDepatmentLocation(rs.getNString(3));
				deptList.add(dept);
				
		  }
		}
			catch(SQLException e) {
				e.printStackTrace();
			}
		
		return deptList;
	}

	@Override
	public void modifyDepartment(Department dobj) {
		// TODO Auto-generated method stub
		System.out.println("Departmentimpl :Updating Department");

		try
		{
			PreparedStatement pst=conn.prepareStatement("update dept set dname=?,dloc=?,where dno=?");
			
			pst.setString(1, dobj.getDepartmentName());
			pst.setString(2, dobj.getDepatmentLocation());
			pst.setInt(3, dobj.getDepartmentNumber());
			int rows=pst.executeUpdate();
			System.out.println("row updated :rows");
			pst.close();
			conn.close();

	}
	catch(SQLException e)
	
	{
		e.printStackTrace();
	}}

	@Override
	public void removeDepartment(int dno) {
		// TODO Auto-generated method stub
		System.out.println("Departmentimpl :Deleting Department");

		try
		{
			PreparedStatement pst=conn.prepareStatement("delete dept where dno=?");
			pst.setInt(1, dno);
			
			int rows=pst.executeUpdate();
			System.out.println("row deleted:rows");
			pst.close();
			conn.close();

	}
	catch(SQLException e)
	
	{
		e.printStackTrace();
	}

}
}
