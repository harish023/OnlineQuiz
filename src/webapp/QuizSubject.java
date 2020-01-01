package webapp;
import java.sql.*;

 

class QuizSubject {
	
	static int c=0,cpp=0,j=0,ds=0;
	public Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/techquiz","root","");
		return conn;
	}
	
	
	public ResultSet c() throws ClassNotFoundException, SQLException {
	++c;
		Connection conn = createConnection();
		Statement stmt = conn.createStatement();
		String sql= "SELECT * FROM `c` WHERE `question_num`='"+c+"'";
		ResultSet result = stmt.executeQuery(sql);
		
		return result;
	}
	
	public ResultSet cpp() throws ClassNotFoundException, SQLException {
		++cpp;
			Connection conn = createConnection();
			Statement stmt = conn.createStatement();
			String sql= "SELECT * FROM `cpp` WHERE `question_num`='"+cpp+"'";
			ResultSet result = stmt.executeQuery(sql);
			 
			return result;
		}
	public ResultSet java() throws ClassNotFoundException, SQLException {
		++j;
			Connection conn = createConnection();
			Statement stmt = conn.createStatement();
			String sql= "SELECT * FROM `java` WHERE `question_num`='"+j+"'";
			ResultSet result = stmt.executeQuery(sql);
			 
			return result;
		}
	public ResultSet datastructure() throws ClassNotFoundException, SQLException {
		++ds;
			Connection conn = createConnection();
			Statement stmt = conn.createStatement();
			String sql= "SELECT * FROM `datastructure` WHERE `question_num`='"+ds+"'";
			ResultSet result = stmt.executeQuery(sql);
			return result;
		}
		
		
	
	
}
