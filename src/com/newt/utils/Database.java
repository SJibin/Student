package com.newt.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Database {
	public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		FileInputStream dbFile = new FileInputStream("F:/JavaEE WorkSpace/StudentDetailsUsingJDBC/database.properties");
		Properties prop = new Properties();
		prop.load(dbFile);
		String driverName = prop.getProperty("driverName");
		String url = prop.getProperty("url");
		String userName = prop.getProperty("userName");
		String password = prop.getProperty("password");

		Class.forName(driverName.trim());
		Connection conn = DriverManager.getConnection(url, userName, password);
		return conn;
	}
}
