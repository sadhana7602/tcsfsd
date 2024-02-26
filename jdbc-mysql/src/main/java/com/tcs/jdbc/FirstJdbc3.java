package com.tcs.jdbc;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
 
public class FirstJdbc3 {
	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?","root","Root123$");
		System.out.println("connected...");
		PreparedStatement ps = con.prepareStatement("update EMP set sal= sal+ ? where EMPNO = ?");
		ps.setInt(1,0);
		ps.setInt(2, 7839);
		int count =ps.executeUpdate();
		System.out.println("record updated "+count);
		
		
		
		
		
		}
	}
 


