package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sahista.Customer;

import DAO.CustomerDAO;
import DAO.DbConnection;

public class CustomerModule {
	public static void main() throws NumberFormatException, IOException
	{
		System.out.println("<-----------------------WELCOME TO CUSTOMER  MODULE--------------------->");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
		while(true)
		{
			System.out.print("<-------Tab(1) Register Customer\t");
			System.out.print("(2) Show Customer\t");
			System.out.println("(3) Update Customer\t");
			System.out.println("(4) Delete Customer\t");
			System.out.println("(5) Go Back");
			System.out.println("(6) LogOut--------->");
			int c=Integer.parseInt(br.readLine());
			if(c==1)
			{
				System.out.println("Enter the User Id:");
				int userId=Integer.parseInt(br.readLine());
				System.out.println("Enter Customer Name:");
			 String customerName=br.readLine();
			 System.out.println("Enter the Gender:");
				 String gender=br.readLine();
				 System.out.println("Enter the Address:");
			    String address=br.readLine();
			    System.out.println("Enter the Age:");
				String age=br.readLine();
				System.out.println("Enter Mobile Number");
				String mobileNumber=br.readLine();
				System.out.println("Enter Email:");
				String email=br.readLine();
				Customer c1 =new Customer(userId,customerName,gender,address,age,mobileNumber,email);
				 boolean f=CustomerDAO.insertCustomerRecord(c1);
				 if(f)
					 System.out.println("Data is inserted Successfully.......");
				 else
					 System.out.println("Data is not inserted Successfully");
			}
			else if(c==2)
			{
				CustomerDAO.showCustomertRecords();
			}
			else if(c==3)
			{
				System.out.print("<----------TAB (1) Update name:\t");
				System.out.print("(2) Udate Gender\t");
				System.out.print("(3) Udate  Address\t");
				System.out.print("(4) Udate Age\t");
				System.out.print("(5) Udate Mobile number\t");
				System.out.println("(6) Udate Email--------->");
				int c2=Integer.parseInt(br.readLine());
				if(c2==1)
				{
				System.out.println("Enter the User Id:");
				int userId=Integer.parseInt(br.readLine());
				System.out.println("Enter Customer Name:");
			 String customerName=br.readLine();
			 CustomerDAO.updateCustomer(c2,customerName,userId);
				}
				else if(c2==2)
				{
					System.out.println("Enter the User Id:");
					int userId=Integer.parseInt(br.readLine());
			 System.out.println("Enter the Gender:");
				 String gender=br.readLine();
				 CustomerDAO.updateCustomer(c2,gender,userId);
				}
				else if(c2==3)
				{
					System.out.println("Enter the User Id:");
					int userId=Integer.parseInt(br.readLine());	
				 System.out.println("Enter the Address:");
			    String address=br.readLine();
			    CustomerDAO.updateCustomer(c2,address,userId);
				}
				else if(c2==4)
				{
					System.out.println("Enter the User Id:");
					int userId=Integer.parseInt(br.readLine());
			    System.out.println("Enter the Age:");
				String age=br.readLine();
				 CustomerDAO.updateCustomer(c2,age,userId);
				}
				else if(c2==5)
				{
					System.out.println("Enter the User Id:");
					int userId=Integer.parseInt(br.readLine());
				System.out.println("Enter Mobile Number");
				String mobileNumber=br.readLine();
				 CustomerDAO.updateCustomer(c2,mobileNumber,userId);
				}
				else if(c2==6)
				{
					System.out.println("Enter the User Id:");
					int userId=Integer.parseInt(br.readLine());
				System.out.println("Enter Email:");
				String email=br.readLine();
				 CustomerDAO.updateCustomer(c2,email,userId);
				}
			}
			else if(c==4)
			{
				System.out.println("Enter User Id to delete:");
				int userId=Integer.parseInt(br.readLine());
				CustomerDAO.deleteCustomerRecord(userId);
			}
			else if(c==5)
			{
				break;
			}
			else if(c==6)
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Press currect tab");
			}
			
		}
	}
		catch(Exception e)
		{
			System.err.println("Please enter correct data");
			Main.main(null);
		}

	}
	

}
