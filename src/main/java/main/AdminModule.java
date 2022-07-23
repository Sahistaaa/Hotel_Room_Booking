package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import DAO.LoginDao;

public class AdminModule 
{

	public static void main() throws NumberFormatException, IOException, SQLException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		try
		{
			System.out.println("Enter your userId------>");
		String reg=br.readLine();
		
		System.out.println("Please enter your password ");
		String password=br.readLine();
		if(LoginDao.showPassword(reg,password))
		{
			while(true)
			{
				System.out.print("<-------TAB(1) Customer Module\t");
				System.out.print("(2) Tariff  Module\t");
				System.out.print("(3) bookingInfo Module\t");
				System.out.print("(4) assignRoom Module\t");
				System.out.print("(5) roomInfo Module\t");
				System.out.print("(6) Log Out\t");
				System.out.print("(7) Go Back------->");
				int c=Integer.parseInt(br.readLine());
				if(c==1)
				{
					CustomerModule.main();
				}
				else if(c==2)
				{
				TarrifModule.main();	
				}
				else if(c==3)
				{
					BookingInfoModule.main();
				}
				else if(c==4)
				{
					AssignRoommodule.main();		
					
				}
				else if(c==5)
				{
					RoomInfoModule.main();
				}
				else if(c==6)
				{
					System.out.println("Thank you for using our application");
					System.exit(0);
				}
				else if(c==7)
				{
					break;
				}
				else
				{
					System.out.println("Press currect Tab");
				}
				

	}

		}
		}
		catch(Exception e)
		{
			System.err.println(e);
			AdminModule.main();
		}
	}
}
