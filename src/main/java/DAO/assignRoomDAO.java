package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sahista.Customer;
import com.sahista.assignRoom;

public class assignRoomDAO {
	public static boolean insertAssignRoom(assignRoom a) 
	{
		boolean f = false;
		try {
			Connection con = DbConnection.getCon();
			String query = "insert into assignRoom(room_no,roomtype,facility) values(?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			//set the value of parameters
		   
		    pst.setString(1,a.getRoom_no());
		    pst.setString(2,a.getRoomtype());
		    pst.setString(3,a.getFacility());
		    
			//execute..
			pst.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}

	public static void showAssignRoom() 
	{
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = DbConnection.getCon();
			String query = "select * from assignRoom";
			PreparedStatement t = con.prepareStatement(query);
			ResultSet set = t.executeQuery();
			if(set==null)
				System.out.println("Nothing is inside to show");
			if(set==null)
				System.out.println("Nothing is inside to Show......");
			
			while(set.next()) {
				
				String room_no = set.getString(1);
				String roomtype = set.getString(2);
				String facility= set.getString(3);
				
				
				System.out.println("Assign room number: " + room_no+"\nAssign room type: "+roomtype+"\nFacility: "+facility );
				System.out.println("----------------------------------------------");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public static boolean deleteassignRoom(String room_no)
	{
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = DbConnection.getCon();
			String query = "delete from assignRoom where room_no=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			//set the value of parameters
			pstmt.setString(1,room_no);
			
			//execute..
			pstmt.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}
	
		}


