package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBload {
	public static void connect() {
		Connection conn = null;  
        try {  
            
            String url = "jdbc:sqlite:/home/safi/eclipse-workspace/FileManagement/src/laptopsdb.sqlite";  
         
            conn = DriverManager.getConnection(url);  
              
            System.out.println("Connection to SQLite has been established.");  
            
            String createTable = "CREATE TABLE IF NOT EXISTS DOB (sr_no integer PRIMARY KEY AUTOINCREMENT,date VARCHAR(10));";
            Statement statement = conn.createStatement();
            statement.execute(createTable);
            System.out.println("Table Created successfully");

            
            
            
        }
        catch (SQLException e) {
			
            System.out.println(e.getMessage());  
		}
        finally {  
            try {  
                if (conn != null) {  
                    conn.close();  
                }  
            } catch (SQLException ex) {  
                System.out.println(ex.getMessage());  
            }  
        }  
    
        
	}
	
}
