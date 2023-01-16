/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.*;
/**
 *
 * @author user
 */
public class ConnectionProvider {
    public static Connection getCon(){
    try{
        Class.forName("org.h2.Driver");
        Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        return con;
    }
    catch(Exception e){
            return null;
                    }
    }
}
