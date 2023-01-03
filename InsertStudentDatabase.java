import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertStudentDatabase {

    public InsertStudentDatabase(String name, String mobile, String gender, String dateOfBirth, String address) {
		
        try{  
	        
            Class.forName("com.mysql.cj.jdbc.Driver");  
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/oop_java_swing_example?characterEncoding=latin1&autoReconnect=true&useSSL=false&useTimezone=true&serverTimezone=UTC","root","");
	        Statement st=con.createStatement();
	        // Adding record 
	        String query1="INSERT INTO student" + " (name, mobile, gender, dateOfBirth, address)" + " VALUES ('" + name + "','" + mobile + "','" + gender + "','" + dateOfBirth + "','" + address + "')";
	        st.executeUpdate(query1); // record added. 
			System.out.println("Data is successfully recorded");
	        con.close();  
	
	    }catch(Exception e){ System.out.println(e);} 
	//////////////////////////////
    }

}
