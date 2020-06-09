package highscore;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class HighScore {
	
	static Connection conn = null;

	
	/******************************************************
	 * 
	 * 
	 * Implement this by calling the method:
	 * "showTopTenResults()"
	 * That will show the top ten and nothing else.
	 * 
	 * If you want to add a new result call the 
	 * "addResult(String name, int score)"
	 * Send the players name and total score. 
	 * 
	 * 
	 *****************************************************/
	
	
	
	public static void Connect() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	    	conn = DriverManager.getConnection("jdbc:mysql://192.168.1.235/highscore?" +
	    		                                   "user=knizia&password=123");
		} catch (SQLException ex) {
	        // handle any errors
	        System.out.println("SQLException: " + ex.getMessage());
	        System.out.println("SQLState: " + ex.getSQLState());
	        System.out.println("VendorError: " + ex.getErrorCode());
	    }
		
	}
	
	public static void showTopTenResults() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		

		try {
			Connect();
			String query = "SELECT * FROM test ORDER BY score DESC LIMIT 10";
			java.sql.Statement st = conn.createStatement();
	    	ResultSet rs = st.executeQuery(query);
	    	int i = 0;
	    	System.out.format("Placering \tNamn \tResultat \tdatum \n");
	    	while (rs.next())
	        {
	    		int place = i + 1;
	    		int id = rs.getInt("id");
	    		String name = rs.getString("name");
	    		int score = rs.getInt("score");
	    		Timestamp ts = rs.getTimestamp("time");
	    		java.util.Date date = ts;
	    		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	    		String time = formatter.format(date);

		        System.out.format("%s \t\t%s \t%s \t\t%s \n", place, name , score, time);
		        i++;
	        }
	    	st.close();
		}
    	catch (SQLException ex) {
	        // handle any errors
	        System.out.println("SQLException: " + ex.getMessage());
	        System.out.println("SQLState: " + ex.getSQLState());
	        System.out.println("VendorError: " + ex.getErrorCode());
	    }
	}
	
	public static void addResult(String name, int score) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		try {
			Connect();
			String query = "INSERT INTO `test` (`name`, `score`) VALUES ('" + name + "', '" + score + "');";
			java.sql.Statement st = conn.createStatement();
	    	st.executeUpdate(query);
	    	
		} catch (SQLException ex) {
	        // handle any errors
	        System.out.println("SQLException: " + ex.getMessage());
	        System.out.println("SQLState: " + ex.getSQLState());
	        System.out.println("VendorError: " + ex.getErrorCode());
	    }
	}
}
