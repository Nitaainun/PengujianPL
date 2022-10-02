/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATABASE;

import MODEL.Keuangan_Model;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//import net.proteanit.sql.DbUtils;

/**
 *
 * @author fachrur fatanillah
 */
public class KeuanganDatabaseConnections {
    
    static final String DB_URL = "jdbc:mysql://localhost:3306/skywallet";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static com.mysql.jdbc.Connection Con = null;
    static PreparedStatement pst = null;
    static ResultSet Rs = null;
    static com.mysql.jdbc.Statement St = null;
    
    static int UserId;
    static Statement St1 = null;
    static ResultSet Rs1 = null;
    
    public static List<Keuangan_Model> GetData(){
        try{
            ArrayList<Keuangan_Model> ItemsList = new ArrayList<Keuangan_Model>();
            Con = (com.mysql.jdbc.Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            St = (com.mysql.jdbc.Statement) Con.createStatement();

            String sql = "SELECT * FROM tblkeuangan";
            Rs = St.executeQuery(sql);


            while(Rs.next()){
                ItemsList.add(new Keuangan_Model(Rs.getInt("Id_Keuangan"), Rs.getInt("Id_User"), Rs.getString("Tanggal")
                                ,Rs.getInt("Pemasukan"),Rs.getInt("Pengeluaran")));
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


