/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DELL
 */
public class Conexion {
    
    public static Connection cn;
    
    public static Connection getConnection(){  
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=GYAM;user=usuarioSQL;password=321;");
        } catch (Exception e) {
            cn = null;
        }
        return cn;
    }
    
    public static void main(String[] args){
        
        Connection pruebacn = Conexion.getConnection();
        
        if (pruebacn != null) {
            System.out.println("Conectado");
            System.out.println("" + pruebacn);
        }else{
            System.out.println("Desconectado");
        }
    }
    
}
