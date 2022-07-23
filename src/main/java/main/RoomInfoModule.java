package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.sahista.roomInfo;
import DAO.roomInfoDAO;

public class RoomInfoModule {

	public static void main() {
		// TODO Auto-generated method stub
		System.out.println("<-----------------------WELCOME TO Room Info  MODULE--------------------->");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
		while(true)
		{
			System.out.print("<-------Tab(1) Register RoomIno\t");
			System.out.print("(2) Show RoomInfo\t");
			System.out.println("(4) Delete RoomInfo\t");
			System.out.println("(5) Go Back");
			System.out.println("(6) LogOut--------->");
			int c=Integer.parseInt(br.readLine());
			if(c==1)
			{
				System.out.println("Enter the Room Number:");
				String roomno=br.readLine();
				System.out.println("Enter Floor Number:");
			 String floorNo=br.readLine();
			 System.out.println("Enter the RoomType:");
				 String roomType=br.readLine();
			roomInfo ri=new roomInfo(roomno,floorNo,roomType);
				 boolean f=roomInfoDAO.insertRoomInfo(ri);
				 if(f)
					 System.out.println("Data is inserted Successfully.......");
				 else
					 System.out.println("Data is not inserted Successfully");
			}
			else if(c==2)
			{
				roomInfoDAO.showRoomInfo();
			}
			else if(c==3)
			{
				System.out.println("Enter the room number:");
				String roomno=br.readLine();
			 roomInfoDAO.deleteRoomInfo(roomno);
			
			}

		}
		}
		catch(Exception e)
		{
			System.err.println("Some error occured....");
			RoomInfoModule.main();
		}


	}

}