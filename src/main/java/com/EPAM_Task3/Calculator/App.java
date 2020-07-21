package com.EPAM_Task3.Calculator;

import java.util.*;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Bussiness obj=new Bussiness();
        Scanner scan=new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("Enter two numbers");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        System.out.println("Choose the operation you need to perform on the two numbers");
        System.out.println("1)Addition...\n"
        		+ "2)Subtraction....\n"
        		+ "3)Multiplication....\n"
        		+ "4)Division....\n"
        		+ "5)Modulus");
       
        System.out.println("Enter your choice");
        int choice=scan.nextInt();
        
        
        switch(choice) {
        	case 1:System.out.println(obj.add(num1,num2));
        	
        	break;
        	case 2:System.out.println(obj.sub(num1,num2));
        	break;
        	case 3:System.out.println(obj.mul(num1,num2));
        	break;
        	case 4:System.out.println(obj.div(num1,num2));
        	break;
        	case 5:System.out.println(obj.mod(num1,num2));
        	break;
        	default:System.out.println("Invalid Choice");
        	
        }
        
    }
    
}
