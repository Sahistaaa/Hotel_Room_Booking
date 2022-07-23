package DAO;
import java.sql.*;
public class DbConnection {
	
	
		static Connection con;
		public static Connection getCon() {
			
			try {
				
				//load the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//create the Connection
				String user = "root"; //user of mysql
				String password = "123456"; //password of mysql
				String url = "jdbc:mysql://localhost:3306/HotelManagementSystem";
				con = DriverManager.getConnection(url,user,password);
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return con;
			
		}
	}

	;

