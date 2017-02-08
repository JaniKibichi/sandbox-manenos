package com.africastalking.app.model;

import java.sql.*;

public class Model {
	Connection connection = null;
	public  Model() {
	  try {
	    Class.forName("org.sqlite.JDBC");
	  } catch (ClassNotFoundException e){
		System.out.println(e.getMessage());
	  }

	}

	public String update(String sql){
	  try {
		connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
		connection.setAutoCommit(true);
		Statement stmt = connection.createStatement();
		stmt.executeUpdate(sql);
		return "updated";
	  } catch (Exception e) {
		System.out.println(e);
		return "failed";
	  } finally {
		try {
		    if (connection != null)
			connection.close();
		} catch ( SQLException e) {
		   System.err.println(e);
		}
	   }
  	}

	public ResultSet select(String sql) {
		ResultSet rs = null;
		try {
		    connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
		    connection.setAutoCommit(true);
		    Statement stmt = connection.createStatement();
		    rs = stmt.executeQuery(sql);
		    return rs;
		} catch (Exception e) {
		    System.out.print(e);
		} finally {
		    try {
			if (connection != null)
			  connection.close();
		    } catch (SQLException e){
			System.err.println(e);
		    }
		}
		return rs;
	}
}
