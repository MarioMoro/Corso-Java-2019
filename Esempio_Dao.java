

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

//CLASSE SINGLETON PER LA CONNESSIONE AL DB
public class Dao {

	private static Connection c=null;
	private static DataSource ds=null;
	
	private Dao() {
		
		
		Context initCtx;
		Context envCtx;
		try {
				initCtx = new InitialContext();
				envCtx = (Context)initCtx.lookup("java:comp/env");
				ds = (DataSource)envCtx.lookup("jdbc/ciccio");
			}
		catch (NamingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		
	}
	
	public static Connection getConnection() {
		
		if(ds==null) {
			new Dao();
		}
		try {
			c=ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
		
	}
	public static void closeConnection() {
		
		
		try {
			if(c!=null) {
				c.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
