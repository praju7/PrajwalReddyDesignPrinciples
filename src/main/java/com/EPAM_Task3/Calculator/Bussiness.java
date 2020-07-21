package com.EPAM_Task3.Calculator;



public class Bussiness {
	
	DatabaseLayer dbobj;
	
	public Bussiness() {
		dbobj=new DatabaseLayer();
	}

	
	
	public int add(int num1,int num2)
	{
		int result=(num1)+(num2);
		 dbobj.insertValues(num1,num2,result);
		 return result;
		
	
	}
	
	public int sub(int num1,int num2)
	{
		int result=(num1)-(num2);
		 dbobj.insertValues(num1,num2,result);
		return result;
		

	}
	
	public int mul(int num1,int num2)
	{
		int result=(num1)*(num2);
		 dbobj.insertValues(num1,num2,result);
		return result;


	
	}
	
	public int div(int num1,int num2)
	{
		int result=(num1)/(num2);
		 dbobj.insertValues(num1,num2,result);
		return result;
		

	
	}
	
	public int mod(int num1,int num2)
	{
		int result=(num1)%(num2);
		 dbobj.insertValues(num1,num2,result);
		return result;
		
		

	}
	
	
	
	
	 
	

}
