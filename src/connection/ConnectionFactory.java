/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author vinicius
 */
public class ConnectionFactory {
      
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
   
   private static final String URL = "jdbc:mysql://localhost:3306/eng";
//    private static final String URL = "jdbc:mysql://localhost:3306/dbloja";
//    private static final String URL = "jdbc:mysql://localhost:3306/eng";
    private static final String PASS = "";
    
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexao", ex);
        }
    }
    
    
    
    public static void closeConecction (Connection con ){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
               System.err.println("Erro: "+ex);
            }
        }
    }
    
    public static void closeConecction (Connection con ,PreparedStatement stmt){
        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException ex) {
              System.err.println("Erro: "+ex);
            }
        }
        closeConecction(con);
    }
    
    public static void closeConecction (Connection con ,PreparedStatement stmt,ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException ex) {
               System.err.println("Erro: "+ex);
            }
        }
        closeConecction(con,stmt);
    }
}
