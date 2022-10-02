/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import DATABASE.KeuanganDatabaseConnections;
import MODEL.Keuangan_Model;
import VIEW.DaftarCatatankeuangan;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author fachrur fatanillah
 */
public class DaftarCatatankeuangan_Control {
    public List <Keuangan_Model> Keuangan;
    DaftarCatatankeuangan DaftarCatatankeuangan;
    
    
    public DaftarCatatankeuangan_Control(DaftarCatatankeuangan DaftarCatatankeuangan){
        Keuangan = KeuanganDatabaseConnections.GetData();
        this.DaftarCatatankeuangan = DaftarCatatankeuangan;
    }
    
    public void getKeuanganData(int idUser, DaftarCatatankeuangan CatatanKeuangan) {
        try{
           CatatanKeuangan.ModelTable.getDataVector().removeAllElements();
           CatatanKeuangan.ModelTable.fireTableDataChanged();
           Object[] obj = new Object[4];
           for (int i = 0 ; i < Keuangan.size() && Keuangan.get(i).getId_User() == idUser;i++){
                   obj[0] = Keuangan.get(i).getTaggal();
                   obj[1] = Keuangan.get(i).getPemasukan();
                   obj[2] = Keuangan.get(i).getPengeluaran();
                   CatatanKeuangan.ModelTable.addRow(obj);
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data Kosong",
                "warning",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public int getTotalJumalahPemasukan(DaftarCatatankeuangan CatatanKeuangan){
        int TotalJumalahPemasukan = 0;
        Object[] obj = new Object[4];
            for (int i = 0 ; i < Keuangan.size();i++){
                   obj[0] = Keuangan.get(i).getPemasukan();
                   TotalJumalahPemasukan = TotalJumalahPemasukan + Keuangan.get(i).getPemasukan();
            }
            return TotalJumalahPemasukan;
    }
    
    public int getTotalJumalahPengeluaran(DaftarCatatankeuangan CatatanKeuangan){
        int TotalJumalahPengeluaran = 0;
        
        Object[] obj = new Object[4];
            for (int i = 0 ; i < Keuangan.size();i++){
                   obj[0] = Keuangan.get(i).getPemasukan();
                   TotalJumalahPengeluaran = TotalJumalahPengeluaran + Keuangan.get(i).getPengeluaran();
            }
        return TotalJumalahPengeluaran;
    }
    
}
