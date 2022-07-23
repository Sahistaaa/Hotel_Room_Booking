package main;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import com.sahista.Tarrif;

import DAO.TarrifDao;

public class TarrifModule {

	public static void main() {
		// TODO Auto-generated method stub
		System.out.println("<-----------------------WELCOME TO TARRIF  MODULE--------------------->");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
		while(true)
		{
			System.out.print("<-------Tab(1) Register Tarrif\t");
			System.out.print("(2) Show Tarrif\t");
			System.out.println("(3) Update Tarrif\t");
			System.out.println("(4) Delete Tarrif\t");
			System.out.println("(5) Go Back");
			System.out.println("(6) LogOut--------->");
			int c=Integer.parseInt(br.readLine());
			if(c==1)
			{
				System.out.println("Enter the Room Type:");
				String roomtype=br.readLine();
				System.out.println("Enter Price:");
			 String price=br.readLine();
			 System.out.println("Enter the Facility:");
				 String facility=br.readLine();
				Tarrif tr=new Tarrif(roomtype,price,facility);
				 boolean f=TarrifDao.insertTarrifRecord(tr);
				 if(f)
					 System.out.println("Data is inserted Successfully.......");
				 else
					 System.out.println("Data is not inserted Successfully");
			}
			else if(c==2)
			{
				TarrifDao.showTarrifRecords();
			}
			else if(c==3)
			{
				System.out.println("Enter the roomtype:");
				String roomtype=br.readLine();
				System.out.println("Enter price:");
			 String price=br.readLine();
			 TarrifDao.updateTarrif(roomtype,price);
			
			}

		}
		}
		catch(Exception e)
		{
			System.err.println("Some error occured....");
			TarrifModule.main();
		}

		}
	
}
