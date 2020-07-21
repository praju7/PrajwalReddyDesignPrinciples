package com.EPAM_Task3.Calculator;


import java.sql.*;




interface data{
	 public void insertValues(int num1,int num2,int result);
}
public  class DatabaseLayer implements data {
	
	Connection con;
	Statement stmt;
	public DatabaseLayer()
	{
		
	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/sonoo","root","root");  
		 stmt=con.createStatement();
	 
		  
		 
		}
	catch(Exception e)
	{ System.out.println(e);
	} 


	}


	@Override
	public void insertValues(int num1, int num2, int result) {
		// TODO Auto-generated method stub
		try {
		String str="INSERT INTO calculator(num1,num2,result) VALUES (num1,num2,result)";
		stmt.executeUpdate(str);  
		
		
		con.close();
	}
		catch(Exception e)
		{ System.out.println(e);
		} 

	}

}
