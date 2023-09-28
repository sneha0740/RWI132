package com.railworld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MainFunction {
	
	public static void ins()throws Exception{

		Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/WORKING","root","root");
		PreparedStatement ps=con.prepareStatement("insert into Employee(EID,Ename,Gender) values( ?,?,?)");
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a data");
		ps.setInt(1, sc.nextInt());
		ps.setString(2, sc.next());
		ps.setString(3, sc.next());
		ps.setString(4, sc.next());
		
		int n=ps.executeUpdate();
		System.out.println("value inserted");
		ps.close();
		con.close();
	}
	
//	public void del()throws Exception{
//
//		Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/WORKING","root","root");
//		PreparedStatement ps=con.prepareStatement("insert into Employee(EID,Ename,Gender) values( ?,?,?)");
//		Scanner sc =new Scanner(System.in);
//		ps.setInt(1, sc.nextInt());
//		ps.setString(2, sc.next());
//		ps.setString(3, sc.next());
//		ps.setString(4, sc.next());
//		
//		int n=ps.executeUpdate();
//		System.out.println("value inserted");
//		ps.close();
//		con.close();
//	}
//	public void update()throws Exception{
//
//		Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/WORKING","root","root");
//		PreparedStatement ps1=con.prepareStatement("insert into Employee(EID,Ename,Gender) values( ?,?,?)");
//	String sql= "Update Employee set Ename=? where eid=1111";
//		PreparedStatement ps=con.prepareStatement(sql);
//		ps1.setString(1,"Shivam");
//		int n=ps1.executeUpdate();
//		ps1.close();
//		con.close();
//	}
	}


