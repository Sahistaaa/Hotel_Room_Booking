package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
public static boolean showPassword(String userId,String password) throws SQLException{
	
	boolean f=false;
	Connection con=DbConnection.getCon();
	String query="select * from Admin where password=? and userId=?";
	PreparedStatement st=con.prepareStatement(query);
	st.setString(1,password);
	st.setString(2,userId);
	ResultSet rt=st.executeQuery();
	if(rt!=null)
	{
		f=true;
		
	}
	return f;
}

}
