/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ruhul
 */
import java.sql.*;
public class JavaApplication1 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
       Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection con = DriverManager.getConnection("jdbc:oracle:thin:toru_dbms@//localhost:1521/xe","toru_dbms","123");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from account");
    System.out.println("A_ID"+"   "+"A_TYPE"+"    "+"C_ID");
    while(rs.next())
    {
       System.out.println(rs.getInt(1)+"      "+rs.getString(2)+"      "+rs.getString(3));
    }
    
        }
    
}
