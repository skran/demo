package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	
	public static Connection  getConn() {
		Connection conn = null;
        try {
        	// 加载HSQL DB的JDBC驱动
            Class.forName("org.hsqldb.jdbcDriver");
            // 在内存中建立数据库db,用户名为sa,密码为空
            conn = DriverManager.getConnection("jdbc:hsqldb:mem:db", "sa", "");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return conn;
    }
	
	public static void closeConn(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void initData(Connection conn) {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate("create table student(Sid VARCHAR(100), Sname VARCHAR(100), Ssex VARCHAR(10), Sage integer, Sclass VARCHAR(100), Sdept VARCHAR(100), Saddr VARCHAR(100))");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
