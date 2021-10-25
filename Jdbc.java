
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;



public class Jdbc{

	public static <PreapareStatement> void main(String[] args) 
	{
		try
		{
	 DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());//First Step
	 System.out.println("...Driver Register");
	 Connection con=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb","SA","");
	 Statement s1=con.createStatement();
	 ResultSet result=s1.executeQuery("select * from REGISTRATION From");
	 Scanner sc1=new Scanner(System.in);
	 Scanner sc2=new Scanner(System.in);
	 Scanner sc3=new Scanner(System.in);
	 System.out.println("Enter username");
	 String uname=sc2.nextLine();
	 System.out.println("Enter password");
	 String pass=sc2.nextLine();
	 System.out.println("Enter age");
	 String age=sc2.nextLine();
	 System.out.println("Enter address");
	 String addre=sc2.nextLine();
	
	 PreparedStatement p=con.prepareStatement("Insert Into REGISTRATION values(?,?,?,?) ");
	 p.setString(1,uname);
	 p.setString(2,pass);
	 p.setString(3,age);
	 p.setString(4,addre);
	 int rows=p.executeUpdate();
	 System.out.println("Row Created"+rows);
	 p.close();
	 con.close();
	 
		}                                                                                                          
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("program Ended");
	}
}

