/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection cn;
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tour","root","");
            
        } catch (Exception e) {
            System.out.println("ERROR"+e);
        } 
        return cn;
    }
    
}
