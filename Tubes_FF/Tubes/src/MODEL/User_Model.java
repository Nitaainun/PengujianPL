/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author fachrur fatanillah
 */
public class User_Model {
    
    private int idUser;
    private String username;
    private String nama;
    private String password;
    private int no_telp;
    private String jenis_kelamin;
    
    public User_Model(int id, String username, String nama, String password, int no_telp, String jenis_kelamin){
        this.idUser = id;
        this.username = username;
        this.nama = nama;
        this.password = password;
        this.no_telp = no_telp;
        this.jenis_kelamin = jenis_kelamin;
        
    }
    
    
    
    public void setidUser(int idUser){
        this.idUser = idUser;
    }
    
    public void setusername(String username){
        this.username = username;
    }
    
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public void setpassword(String password){
        this.password = password;
    }
    
    public void setno_telp(int no_telp){
        this.no_telp = no_telp;
    }
    
    public void setjenis_kelamin(String jenis_kelamin){
        this.jenis_kelamin = jenis_kelamin;
    }
    
    public int getidUser() {
        return idUser;
    }
    
    public String getusername() {
        return username;
    }
    
    public String getnama() {
        return nama;
    }
    
    public String getpassword() {
        return password;
    }
    
    public int getno_telp() {
        return no_telp;
    }
    
    public String getjenis_kelamin() {
        return jenis_kelamin;
    }
    
}
