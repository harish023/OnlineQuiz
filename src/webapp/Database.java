package webapp;
import java.sql.*;
public class Database {
	String name;
	String email_id;
	String password;
	String city;
	String mobile;
	
	public Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/techquiz","root","");
		return conn;
	}
	
	public void registerUser(String name,String email_id,String password,String city,String mobile) throws ClassNotFoundException, SQLException {
		Connection conn = createConnection();
		Statement stmt= conn.createStatement();
		String sql="INSERT INTO `user`(`name`, `email_id`, `password`, `city`, `mobile`) VALUES ('"+ name +"','"+ email_id +"','"+password+"','"+city+"','"+mobile+"' )";
		stmt.executeUpdate(sql);
		conn.close();
	}
	
	public ResultSet login(String email_id,String pass) throws SQLException, ClassNotFoundException {
		String nmm = null;
		Connection conn=createConnection();
		Statement stmt = conn.createStatement();
		String sql ="SELECT * FROM `user` WHERE `email_id`='"+email_id+"'";
		ResultSet results = stmt.executeQuery(sql);
		return results;
	}

	public ResultSet checkAns(String q) throws ClassNotFoundException, SQLException
	{
		Connection conn = createConnection();
		Statement stmt = conn.createStatement();
		String sql = "SELECT * FROM `c` WHERE `question`='"+q+"'";
		ResultSet res = stmt.executeQuery(sql);
		return res;
		
	}
	
	
	
	
	
}
