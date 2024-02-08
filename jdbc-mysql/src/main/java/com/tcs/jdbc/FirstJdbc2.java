package com.tcs.jdbc;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
 
public class FirstJdbc2 {
	public static void main(String[] args) throws SQLException {
		// 1. establish connection = 3 (url,username,pwd or database)
		// url = "jdbc:mysql://localhost:3306:schemaname/dbname
		// 2. Obtain statement reference
		// 3. Prepare SQL statement as string 
		// 4. execute statement
		// 5. Fetch results
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?","root","Root123$");
		System.out.println("connected...");
		Statement st = con.createStatement();
		/*String sql ="insert into EMP values("+"1012,'abc','MANAGER',7839,'1999-01-01',2300,null,10)";;
		int count = st.executeUpdate(sql);
		System.out.println("Record inserted:"+count);*/
		String update="update EMP set sal = sal + 0 where deptno in(10,20,30)";
		int count =st.executeUpdate(update);
		System.out.println();
		
		String sql="select * from EMP where EMPNO=1012";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getString(4));
		/*ResultSetMetaData rsms = (ResultSetMetaData) rs.getMetaData();
		
		System.out.println(rsms.getColumnCount());
		System.out.println(rsms.getColumnName(1));
		System.out.println(rsms.getColumnName(2));
		System.out.println(rsms.getColumnName(3));*/
		
	
		
		
		
		}
	}
 
}

