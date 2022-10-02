/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATABASE;

import MODEL.User_Model;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fachrur fatanillah
 */
public class UserDatabaseConnections {
    static final String DB_URL = "jdbc:mysql://localhost:3306/skywallet";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static com.mysql.jdbc.Connection Con = null;
    static PreparedStatement pst = null;
    static ResultSet Rs = null;
    static com.mysql.jdbc.Statement St = null;
    
    public static List<User_Model> GetData(){
        try{
            ArrayList<User_Model> ItemsList = new ArrayList<User_Model>();
            Con = (com.mysql.jdbc.Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            St = (com.mysql.jdbc.Statement) Con.createStatement();

            String sql = "SELECT * FROM user";
            Rs = St.executeQuery(sql);


            while(Rs.next()){
                ItemsList.add(new User_Model(Rs.getInt("id"), Rs.getString("username"), Rs.getString("nama")
                                ,Rs.getString("password"),Rs.getInt("no_telp"), Rs.getString("jenis_kelamin")));
            }

            St.close();
            Con.close();

            return ItemsList;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
