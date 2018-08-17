package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBController {
    
    private static DBController dbcontroller = new DBController();
    private static Connection con;
    
    
    static {
        try {
            Class.forName("org.sqlite.JDBC");
            
        } catch (ClassNotFoundException e) {
            System.err.println("Fehler beim Laden des JDBC-Treibers");
            e.printStackTrace();
        }
    }    
 
     private DBController(){
         initDBConnection();
         createTableUser();
         createTableVoc();
    }
     
      public static DBController getInstanceOfDB(){
         if(dbcontroller == null){
             dbcontroller = new DBController();
         }
         
         return dbcontroller;
     }
      
      private void initDBConnection() {
        try {
            if (con != null)
                return;
            System.out.println("Creating Connection to Database...");
            con = DriverManager.getConnection("jdbc:sqlite:vc.db");
            if (!con.isClosed())
                System.out.println("...Connection established");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                try {
                    if (!con.isClosed() && con != null) {
                        con.close();
                        if (con.isClosed())
                            System.out.println("Connection to Database closed");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
      }
        
        private void createTableUser(){
        try{
            con = DriverManager.getConnection("jdbc:sqlite:vc.db");
         Statement stat = con.createStatement();
         
         stat.executeUpdate("CREATE TABLE IF NOT EXISTS user(id integer PRIMARY KEY AUTOINCREMENT, mainlanguage text NOT NULL, lastTest date, username text);");
        }
        catch (SQLException e) {
            System.err.println("Error. It doesn't work");
            e.printStackTrace();
        }
     }
       
       private void dropTableUser(){
           try{
               con = DriverManager.getConnection("jdbc:sqlite:vc.db");
           Statement stat = con.createStatement();
           stat.executeUpdate("DROP TABLE IF EXISTS user");
           }
           
           catch (SQLException e){
               System.err.println("Error. It doesn't work");
            e.printStackTrace();
           }
           
       }
       
       private void createTableVoc(){
        try{
            con = DriverManager.getConnection("jdbc:sqlite:vc.db");
         Statement stat = con.createStatement();
         
         stat.executeUpdate("CREATE TABLE IF NOT EXISTS vocabulary(id integer PRIMARY KEY AUTOINCREMENT, wordlang1 text NOT NULL, wordlang2 text NOT NULL, memo text, dayofcreation date NOT NULL, lastcall date, archieved boolean);");
        }
        catch (SQLException e) {
            System.err.println("Error. It doesn't work");
            e.printStackTrace();
        }
     }
       
       private void dropTableVoc(){
           try{
               con = DriverManager.getConnection("jdbc:sqlite:vc.db");
           Statement stat = con.createStatement();
           stat.executeUpdate("DROP TABLE IF EXISTS vocabulary");
           }
           
           catch (SQLException e){
               System.err.println("Error. It doesn't work");
            e.printStackTrace();
           }
           
       }
     
     
     
}
