package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sahista.roomInfo;

public class roomInfoDAO {
	public static boolean insertRoomInfo(roomInfo r) {
		boolean f = false;
		try {
			Connection con = DbConnection.getCon();
			String query = "insert into roomInfo(roomno,floorno,roomtype) values(?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			//set the value of parameters
		    pst.setString(1,r.getRoomno());
		    pst.setString(2,r.getFloorno());
		    pst.setString(3,r.getRoomtype());
		    
			//execute..
			pst.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}public static void showRoomInfo() {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = DbConnection.getCon();
			String query = "select * from roomInfo";
			PreparedStatement t = con.prepareStatement(query);
			ResultSet set = t.executeQuery();
			if(set==null)
				System.out.println("Nothing is Inside to Show.....");
			while(set.next()) {
				int roomno= set.getInt(1);
				String floorno = set.getString(2);
				String roomtype= set.getString(3);
				
				System.out.println("Room No: " + roomno +"\nFloor No: "+floorno+"\nRoom Type: "+roomtype);
				System.out.println("----------------------------------------------");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static boolean deleteRoomInfo(String roomno) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = DbConnection.getCon();
			String query = "delete from bookingInfo where Roomno=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			//set the value of parameters
			pstmt.setString(1,roomno);
			
			//execute..
			pstmt.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}
}
