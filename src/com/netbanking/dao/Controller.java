package com.netbanking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.netbanking.entities.Data;
import com.netbanking.entities.User;

public class Controller {
	Connection con;
	ResultSet rs;
	PreparedStatement ps;
	Statement st;
	
	public Controller()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usermanagement","root","Jaimatadi@814112");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public int registerUser(User user) {
		  try {
		        ps = con.prepareStatement("INSERT INTO datamanagement (Name, FatherName, Email, Date_of_Birth, Phone, Gender, Marital, Address, City, State, Pincode, Religion, Category, Income, Education, Occupation, PAN, Aadhar_no, Existing_Account, UserId, Password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)");
		        
		        // Set parameter values for the prepared statement using user object
		        ps.setString(1, user.getName());
		        ps.setString(2, user.getFname());
		        ps.setString(3, user.getEmail());
		        ps.setString(4, user.getDob());
		        ps.setLong(5, user.getPhone());
		        ps.setString(6, user.getGender());
		        ps.setString(7, user.getMarital());
		        ps.setString(8, user.getAddress());
		        ps.setString(9, user.getCity());
		        ps.setString(10, user.getState());
		        ps.setInt(11, user.getPincode());
		        ps.setString(12, user.getReligion());
		        ps.setString(13, user.getCategory());
		        ps.setString(14, user.getIncome());
		        ps.setString(15, user.getEducation());
		        ps.setString(16, user.getOccupation());
		        ps.setString(17, user.getPan());
		        ps.setLong(18, user.getAadhar());
		        ps.setString(19, user.getE_account());
		        ps.setString(20, user.getUid());
		        ps.setString(21, user.getPassword());

		        // Execute the prepared statement to insert the user data into the database
		        int rowsInserted = ps.executeUpdate();

		        // Return the number of rows inserted (typically 1 if successful)
		        return rowsInserted;
		    } catch (SQLException e) {
		        e.printStackTrace();
		        // Handle any exceptions here
		        return 0; // Return 0 to indicate failure
		    }
		}
		//In this updated code, I've removed the return 0; statement at the beginning of the method, and I've added code to set parameter values for the prepared statement using the user object. After setting the parameters, the executeUpdate method is called to insert the user data into the database. The method returns the number of rows inserted, which is typically 1 if the insertion is successful.

	public User checkLogin(String userId, String pwd) {
		User user=null;
		try {
			ps=con.prepareStatement("SELECT * FROM datamanagement WHERE UserId =? AND Password =?");
			ps.setString(1, userId);  
	        ps.setString(2, pwd);     
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				user=new User();
				user.setUid(rs.getString("UserId"));
				user.setPassword(rs.getString("Password"));
				user.setName(rs.getString("Name"));
				user.setBalance(rs.getLong("balance"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	public int updateBalance(String uid, long balance) {
		int status=0;
		try {
			ps=con.prepareStatement("UPDATE datamanagement SET Balance = ? WHERE UserId = ?");
			ps.setLong(1, balance);
			ps.setString(2, uid);
			status = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
//	st=con.createStatement();
//	 status = st.executeUpdate("insert into mini_statement where UserId=uid,Date=date,Type='deposit',Amount=balance");

	public int updatePassword(String uid, String newPassword) {
		int status=0;
		
		try {
			ps=con.prepareStatement("UPDATE datamanagement SET Password = ? WHERE UserId = ?");
			ps.setString(1, newPassword);
			ps.setString(2, uid);
			 status = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	public int deleteUser(String uid) {
		int status=0;
		try {
			ps=con.prepareStatement("delete from datamanagement where UserId=?");
			ps.setString(1, uid);
			status = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	public int depoType(String uid, long newDeposit, String text, Date date) {
		int status=0;
		try {
			ps=con.prepareStatement("insert into mini_statement values(?,?,?,?)");
			ps.setString(1, uid);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
	        ps.setDate(2, sqlDate);
			ps.setString(3, text);
			ps.setLong(4, newDeposit);
			 status = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
		
	}

	public int withdrawType(String uid, long withdrawAmt, String text, Date date) {
		int status=0;
		try {
			ps=con.prepareStatement("insert into mini_statement values(?,?,?,?)");
			ps.setString(1, uid);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
	        ps.setDate(2, sqlDate);
			ps.setString(3, text);
			ps.setLong(4, withdrawAmt);
			 status = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}

	public List<Data> getData(String uid) {
		List<Data> userList = new ArrayList();
		try {
			ps=con.prepareStatement("select * from mini_statement where UserId=?");
			ps.setString(1, uid);
			 ResultSet rs = ps.executeQuery();
			 while (rs.next()) {
		            Data data = new Data();
		            data.setUserid(rs.getString("UserId"));
		            data.setDate(rs.getDate("Date"));
		            data.setType(rs.getString("Type"));
		            data.setAmount(rs.getLong("Amount"));
		            userList.add(data);
		        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}

	public void delData(String uid) {
		try {
			ps=con.prepareStatement("delete from mini_statement where UserId=?");
			ps.setString(1, uid);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

		//Please make sure to handle exceptions appropriately in your application.






	
	
	
	


}
