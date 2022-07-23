package main;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import com.sahista.BookingInfo;

import DAO.BookingInfoDAO;

public class BookingInfoModule {
	public static void main()
	{
		System.out.println("<-----------------------WELCOME TO BOOKING INFO  MODULE--------------------->");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
		while(true)
		{
			System.out.print("<-------Tab(1) Register Booking Information\t");
			System.out.print("(2) Show Booking Info\t");
			System.out.println("(3) Update Booking Info\t");
			System.out.println("(4) Delete Booking Info\t");
			System.out.println("(5) Go Back");
			System.out.println("(6) LogOut--------->");
			int c=Integer.parseInt(br.readLine());
			if(c==1)
			{
				System.out.println("Enter the Customer Booking Id:");
				int userId=Integer.parseInt(br.readLine());
				System.out.println("Enter Booking Date:");
			 String customerName=br.readLine();
			 System.out.println("Enter the Booking Time:");
				 String gender=br.readLine();
				 System.out.println("Enter the Room No:");
			    String address=br.readLine();
			    System.out.println("Enter the Room Type:");
				String age=br.readLine();
				System.out.println(" Enter mobile No:");
				String mobileNumber=br.readLine();
				BookingInfo bi =new BookingInfo(userId,customerName,gender,address,age,mobileNumber);
				 boolean f=BookingInfoDAO.insertBookingInfo(bi);
				 if(f)
					 System.out.println("Data is inserted Successfully.......");
				 else
					 System.out.println("Data is not inserted Successfully");
			}
			else if(c==2)
			{
				BookingInfoDAO.showBookigInfo();
			}
			else if(c==3)
			{
				System.out.print("<----------TAB (1) Update Room Number:\t");
				System.out.print("(2) Udate Room Type\t");
				System.out.print("(3) Udate  Price\t");
				
				int c2=Integer.parseInt(br.readLine());
				if(c2==1)
				{
				System.out.println("Enter the Customer Booking Id:");
				int userId=Integer.parseInt(br.readLine());
				System.out.println("Enter Room Number:");
			 String roomno=br.readLine();
			 BookingInfoDAO.updateBookingInfo(c2,roomno,userId);
				}
				else if(c2==2)
				{
					System.out.println("Enter the Customer Booking Id:");
					int userId=Integer.parseInt(br.readLine());
			 System.out.println("Enter the Room Type:");
				 String roomtype=br.readLine();
				 BookingInfoDAO.updateBookingInfo(c2,roomtype,userId);
				}
				else if(c2==3)
				{
					System.out.println("Enter the Customer Booking Id:");
					int userId=Integer.parseInt(br.readLine());	
				 System.out.println("Enter the Price");
			    String price=br.readLine();
			    BookingInfoDAO.updateBookingInfo(c2,price,userId);
				}
				
				
			}
			else if(c==4)
			{
				System.out.println("Enter Customer Booking Id to delete:");
				int userId=Integer.parseInt(br.readLine());
				BookingInfoDAO.deleteBookingInfo(userId);
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
			BookingInfoModule.main();
			
		}

	}

}
