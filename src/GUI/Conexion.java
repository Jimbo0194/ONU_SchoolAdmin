/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mvind
 */
public class Conexion {
    
    public static Connection getConnection(){
        
        String conexionURL = "jdbc:sqlserver://localhost:1433;"
                + "database = Proyecto_Progra;"
                + "user = Admin;"
                + "password = Proyecto;"
                + "loginTimeout = 45;";

        try {

            Connection con = DriverManager.getConnection(conexionURL);
            return con;

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
    
}
