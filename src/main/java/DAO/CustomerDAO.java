package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sahista.Customer;

public class CustomerDAO {

	public static boolean insertCustomerRecord(Customer c) {
		boolean f = false;
		try {
			Connection con = DbConnection.getCon();
			String query = "insert into customer(userId,customerName,gender,address,age,mobileNumber,email	) values(?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			//set the value of parameters
		    pst.setInt(1,c.getUserId());
		    pst.setString(2,c.getCustomerName());
		    pst.setString(3,c.getGender());
		    pst.setString(4,c.getAddress());
		    pst.setString(5,c.getAge());
		    pst.setString(6,c.getMobileNumber());
		    pst.setString(7,c.getEmail());
			//execute..
			pst.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}
	public static boolean deleteCustomerRecord(int userID) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = DbConnection.getCon();
			String query = "delete from customer where userId=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			//set the value of parameters
			pstmt.setInt(1, userID);
			
			//execute..
			pstmt.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}
	public static void showCustomertRecords() {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = DbConnection.getCon();
			String query = "select * from customer";
			PreparedStatement t = con.prepareStatement(query);
			ResultSet set = t.executeQuery();
			if(set==null)
				System.out.println("Nothing is inside to Show.....");
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String gender = set.getString(3);
				String address = set.getString(4);
				String age=set.getString(5);
				String mobile=set.getString(6);
				String email=set.getString(7);
				
				System.out.println("Customer UserId: " + id +"\nCustomer CustomerName: "+name+"\nGender: "+gender+"\nCutomer Address: "+address+"\nCustomer Age: "+age+"\nCustomer ContactNumber: "+mobile+"\nCustomer emailId: "+email );
				System.out.println("----------------------------------------------");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public static boolean updateCustomer(int val,String toUpdate,int id) {
		// TODO Auto-generated method stub
		boolean f = false;
		
		try {
			  Connection con = DbConnection.getCon();
			 if(val == 1) {
					//Update Name
					
						String query = "update Customer set customerName=? where userId=?";
						PreparedStatement pstmt = con.prepareStatement(query);
						pstmt.setString(1, toUpdate);
						pstmt.setInt(2, id);
						
						//execute..
						pstmt.executeUpdate();
						f = true;
				}
				else if(val == 2) {
					//Update Gender
					String query = "update Customer set gender=? where userId=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else if(val == 3) {
					//Update Address
					String query = "update Customer set address=? where userId=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else if(val == 4) {
					//Update Age
					String query = "update Customer set age=? where userId=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else if(val == 5) {
					//Update MobileNmber
					String query = "update Customer set mobileNumber=? where userId=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else if(val == 6) {
					//Update Email
					String query = "update Customer set email=? where userId=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
		}
		catch(Exception E)
		{
			
		}
		return f;	 
	}
}
