package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.sahista.assignRoom;
import DAO.assignRoomDAO;

public class AssignRoommodule {

	public static void main() {
		// TODO Auto-generated method stub
		System.out.println("<-----------------------WELCOME TO AssignRoom  MODULE--------------------->");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
		while(true)
		{
			System.out.print("<-------Tab(1) Register Assign Room\t");
			System.out.print("(2) Show Assign Room\t");
			System.out.println("(4) Delete Assign Room\t");
			System.out.println("(5) Go Back");
			System.out.println("(6) LogOut--------->");
			int c=Integer.parseInt(br.readLine());
			if(c==1)
			{
				System.out.println("Enter the Room Number:");
				String roomno=br.readLine();
				System.out.println("Enter Room Type:");
			 String roomtype=br.readLine();
			 System.out.println("Enter the Facility:");
				 String facility=br.readLine();
			assignRoom	 ar=new assignRoom(roomno,roomtype,facility);
				 boolean f=assignRoomDAO.insertAssignRoom(ar);
				 if(f)
					 System.out.println("Data is inserted Successfully.......");
				 else
					 System.out.println("Data is not inserted Successfully");
			}
			else if(c==2)
			{
				assignRoomDAO.showAssignRoom();
			}
			else if(c==3)
			{
				System.out.println("Enter the room number:");
				String roomno=br.readLine();
			 assignRoomDAO.deleteassignRoom(roomno);
			
			}

		}
		}
		catch(Exception e)
		{
			System.err.println("Some error occured....");
			AssignRoommodule.main();
		}

	}

}
