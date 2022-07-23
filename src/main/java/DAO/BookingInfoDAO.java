package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sahista.BookingInfo;
import com.sahista.Customer;

public class BookingInfoDAO {
	public static boolean insertBookingInfo(BookingInfo b) {
		boolean f = false;
		try {
			Connection con = DbConnection.getCon();
			String query = "insert into bookingInfo(bookingId,bdate,time,roomno,roomtype,price) values(?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			// set the value of parameters
			pst.setInt(1, b.getBookingId());
			pst.setString(2, b.getBooking_date());
			pst.setString(3, b.getTime());
			pst.setString(4, b.getRoomno());
			pst.setString(5, b.getRoomtype());
			pst.setString(6, b.getPrice());
			// execute..
			pst.executeUpdate();

			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}

	public static void showBookigInfo() {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = DbConnection.getCon();
			String query = "select * from bookingInfo";
			PreparedStatement t = con.prepareStatement(query);
			ResultSet set = t.executeQuery();
			if (set == null)
				System.out.println("Nothing is inside to show.......");

			while (set.next()) {
				int id = set.getInt(1);
				String date = set.getString(2);
				String time = set.getString(3);
				String roomno = set.getString(4);
				String roomtype = set.getString(5);
				String price = set.getString(6);

				System.out.println("Booking Id:" + id + "\nBooking Date: " + date + "\nBooking Time: " + time
						+ "\nRoom No: " + roomno + "\nRoom Type: " + roomtype + "\nPrice: " + price);
				System.out.println("----------------------------------------------");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static boolean deleteBookingInfo(int bookingId) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = DbConnection.getCon();
			String query = "delete from bookingInfo where bookingId=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			// set the value of parameters
			pstmt.setInt(1, bookingId);

			// execute..
			pstmt.executeUpdate();

			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}

	public static boolean updateBookingInfo(int val, String toUpdate, int bookingId) {
		// TODO Auto-generated method stub
		boolean f = false;

		try {
			Connection con = DbConnection.getCon();
			if (val == 1) {
				// Update Room Type

				String query = "update bookinfInfo set roomno=? where bookingId=?";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, toUpdate);
				pstmt.setInt(2, bookingId);

				// execute..
				pstmt.executeUpdate();
				f = true;
			} else if (val == 2) {
				// Update Room Type
				String query = "update bookingInfo set roomtype=? where bookingId=?";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, toUpdate);
				pstmt.setInt(2, bookingId);

				// execute..
				pstmt.executeUpdate();
				f = true;
			} else if (val == 3) {
				// Update Price
				String query = "update bookingInfo set price=? where bookingId=?";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, toUpdate);
				pstmt.setInt(2, bookingId);

				// execute..
				pstmt.executeUpdate();
				f = true;
			}
		} catch (Exception E) {

		}
		return f;
	}
}
