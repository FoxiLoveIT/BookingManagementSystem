/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Client;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ClientDao {

    public static void save(Client client) {
        String query = "insert into client(name,email,mobileNumber,password,answer) values('" + client.getName() + "','" + client.getEmail() + "','" + client.getMobileNumber() + "','" + client.getPassword() + "','" + client.getAnswer() + "')";
        dbOperations.setDataOrDelete(query, "Registered SuccessFully");
    }

    public static Client login(String email, String password) {
        Client client = null;
        try {
            ResultSet rs = dbOperations.getData("Select * from  client WHERE email ='" + email + "' and password ='" + password + "'");
            while (rs.next()) {
                client = new Client();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return client;
    }

    public static Client getSecurityQuestion(String email) {
        Client client = null;
        try {
            ResultSet rs = dbOperations.getData("Select * from  client WHERE email ='" + email + "'");
            while (rs.next()) {
                client = new Client();
                client.setAnswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return client;
    }

    public static void update(String email, String newPassword) {
        String query = "update client set password = '" + newPassword + "' where email ='" + email + "'";
        dbOperations.setDataOrDelete(query, "Password Changed Successfully");
    }
}
