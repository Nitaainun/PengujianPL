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
public class Keuangan_Model {
    
    private int Id_Keuangan;
    private int Id_User;
    private String Taggal;
    private int Pemasukan;
    private int Pengeluaran;
    
    public Keuangan_Model(int IdKeuangan, int IdUser, String Taggal, int Pemasukan, int Pengeluaran){
        this.Id_Keuangan = IdKeuangan;
        this.Id_User = IdUser;
        this.Taggal = Taggal;
        this.Pemasukan = Pemasukan;
        this.Pengeluaran = Pengeluaran;
        
    }
    
    public void setId_Keuangan(int Id_Keuangan){
        this.Id_Keuangan = Id_Keuangan;
    }
    
    public void setId_User(int Id_User){
        this.Id_User = Id_User;
    }
    
    public void setTaggal(String Taggal){
        this.Taggal = Taggal;
    }
    
    public void setPemasukan(int Pemasukan){
        this.Pemasukan = Pemasukan;
    }
    
    public void setPengeluaran(int Pengeluaran){
        this.Pengeluaran = Pengeluaran;
    }
    
    public int getId_Keuangan() {
        return Id_Keuangan;
    }
    
    public int getId_User() {
        return Id_User;
    }
    
    public String getTaggal() {
        return Taggal;
    }
    
    public int getPemasukan() {
        return Pemasukan;
    }
    
    public int getPengeluaran() {
        return Pengeluaran;
    }
    
}
