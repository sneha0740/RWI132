package com.railworld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Updatejdbc {

	public static void main(String[] args) throws Exception{
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/WORKING","root","root");
//		PreparedStatement ps1=con.prepareStatement("insert into Employee(EID,Ename,Gender) values( ?,?,?)");
//		String sql= "Update Employee set Ename=? where eid=1111";
//		PreparedStatement ps1=con.prepareStatement(sql);
//		ps1.setString(1,"Shivam");
//		int n=ps1.executeUpdate();
//		ps1.close();
//		con.close();
		 
		 String sql= "delete  from employee  where eid=1111";
			PreparedStatement ps1=con.prepareStatement(sql);

			int n=ps1.executeUpdate();
			ps1.close();
			con.close();
		
	}

}
