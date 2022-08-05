/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboardapp.Controller;

import static dashboardapp.Controller.koneksi.rs;
import static dashboardapp.Controller.koneksi.stm;
import dashboardapp.View.DataBarang;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class DataBarangController {
    private DefaultTableModel tableModel;
    
    public DataBarangController() {
        //
    }

    /**
     * @return the tableModel
     */
    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    /**
     * @param tableModel the tableModel to set
     */
    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }
    
    public void getData(DataBarang view) {
        Object[] header = {"No","Kode Barang", "Nama Barang", "Harga", "Stok"};
        tableModel = new DefaultTableModel(null, header);
        view.getTabelDataBarang().setModel(tableModel);
        
        String sql = "SELECT * FROM barang";
        
        try {
            Connection conn = new koneksi().getConnetion(sql);
            rs = stm.executeQuery(sql);
            int i = 0;
            
            while (rs.next()) {               
                i++;
                String kodeBarang = koneksi.rs.getString("kode_barang");
                String namaBarang = koneksi.rs.getString("nama_barang");
                String harga = koneksi.rs.getString("harga");
                String stock = koneksi.rs.getString("stock");
                
                String[] dataTable = {Integer.toString(i),kodeBarang, namaBarang, harga, stock};
                
                tableModel.addRow(dataTable);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Untuk menampilkan Data");
        }
    }
    
    public void TambahData(DataBarang view) {
        String kodeBrg = view.getKodeBarang().getText();
        String namaBrg = view.getNamaBarang().getText();
        String hargaBrg = view.getHargaBarang().getText();
        String stockBrg = view.getStok().getText();
        
        String sql = "insert into barang(kode_barang, nama_barang, harga, stock) values('"+kodeBrg+"','"+namaBrg+"','"+hargaBrg+"','"+stockBrg+"')";
        
        try {
            Connection conn = new koneksi().getConnetion(sql);
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
            getData(view);
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Gagal Menambahkan Data", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void tabelClicked(DataBarang view) {
        int column;
        int row;
        
        tableModel = (DefaultTableModel) view.getTabelDataBarang().getModel();
        column = view.getTabelDataBarang().getSelectedColumn();
        row = view.getTabelDataBarang().getSelectedRow();
        String dataTerpilih = view.getTabelDataBarang().getValueAt(row, column)
                .toString();
        String kodeBrg = view.getTabelDataBarang().getValueAt(row, 1).toString();
        String namaBrg = view.getTabelDataBarang().getValueAt(row, 2).toString();
        String harga = view.getTabelDataBarang().getValueAt(row, 3).toString();
        String stock = view.getTabelDataBarang().getValueAt(row, 4).toString();
        
        view.getKodeBarang().setText(kodeBrg);
        view.getNamaBarang().setText(namaBrg);
        view.getHargaBarang().setText(harga);
        view.getStok().setText(stock);
                
    }
    
    public void hapusData(DataBarang view) {
        int statusDelete;
        int row;
        tableModel = (DefaultTableModel) view.getTabelDataBarang().getModel();
        row = view.getTabelDataBarang().getSelectedRow();
        Object kode = view.getTabelDataBarang().getValueAt(row, 1);
        
        statusDelete = JOptionPane.showConfirmDialog(null,
                "Apakah anda ingin menghapus data ini", 
                "Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
        
        try {
            if (row >= 0) {
                if (statusDelete == 0) {
                    String sql = "delete from barang where kode_barang = '"+kode+"' ";
                    Connection conn = new koneksi().getConnetion(sql);
                    stm.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                    getData(view);
                    conn.close();
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Tidak Ada Yang Dihapus");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
        
        
        

        
        
        
    }


    
}
