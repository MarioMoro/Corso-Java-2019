//STEP 1. Importa i package richiesti
import java.sql.*;

public class FirstExample {
   // nome del driver JDBC e URL del DB
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/EMP";

   //  Credenziali di accesso al DB
   static final String USER = "username";
   static final String PASS = "password";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Registrazione del driver JDBC
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Aperura di una connessione
      System.out.println("Connessione al database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 4: Esecuzione di una query
      System.out.println("Creazione query...");
      stmt = conn.createStatement();
      String sql;
      sql = "SELECT id, first, last, age FROM Employees";
      ResultSet rs = stmt.executeQuery(sql);

      //STEP 5: Estrazione dei dati dal risultato ottenuto
      while(rs.next()){
         //Estrae i dati per nome della colonna
         int id  = rs.getInt("id");
         int age = rs.getInt("age");
         String first = rs.getString("first");
         String last = rs.getString("last");

         //Mostra il risultato
         System.out.print("ID: " + id);
         System.out.print(", Age: " + age);
         System.out.print(", First: " + first);
         System.out.println(", Last: " + last);
      }
      //STEP 6: Pulizia dell'ambiente
      rs.close();
      stmt.close();
      conn.close();
   }catch(SQLException se){
      //Gestione degli errori per JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Gestione degli errori per Class.forName
      e.printStackTrace();
   }finally{
      //finally usato per chiudere le risorse
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// niente che possa essere fatto
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
   System.out.println("Arrivederci!");
}
}
