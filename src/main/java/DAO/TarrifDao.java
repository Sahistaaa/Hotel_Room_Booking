package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sahista.Customer;
import com.sahista.Tarrif;

public class TarrifDao {
	public static boolean insertTarrifRecord(Tarrif t) {
		boolean f = false;
		try {
			Connection con = DbConnection.getCon();
			String query = "insert into Tarrif(roomtype,price,facility	) values(?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			// set the value of parameters

			pst.setString(1, t.getRoomType());
			pst.setString(2, t.getPrice());
			pst.setString(3, t.getFacility());

			// execute..
			pst.executeUpdate();

			f = true;
		} catch (Exception e) {
		}
		return f;
	}

	public static boolean deleteTarrifRecord(int reg) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = DbConnection.getCon();
			String query = "delete from Tarrif where slno=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			// set the value of parameters
			pstmt.setInt(1, reg);

			// execute..
			pstmt.executeUpdate();

			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}

	public static void showTarrifRecords() {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = DbConnection.getCon();
			String query = "select * from Tarrif";
			PreparedStatement t = con.prepareStatement(query);
			ResultSet set = t.executeQuery();
			if (set == null)
				System.out.println("Nothing is Inside To Show.....");

			while (set.next()) {
				int id = set.getInt(1);
				String roomtype = set.getString(2);
				String price = set.getString(3);
				String facility = set.getString(4);

				System.out.println(
						"SlNo: " + id + "\n RoomType: " + roomtype + "\n Price: " + price + "\n Facility: " + facility);
				System.out.println("----------------------------------------------");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static boolean updateTarrif(String roomtype, String price) {
		boolean f = false;
		try {
			Connection con = DbConnection.getCon();
			String query = "update Tarrif set price=? where roomtype=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, price);
			ps.setString(2, roomtype);
			ps.executeQuery();
			f = true;

		} catch (Exception e) {

		}
		return f;

	}
}
