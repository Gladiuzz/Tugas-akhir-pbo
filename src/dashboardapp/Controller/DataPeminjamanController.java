/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboardapp.Controller;

import static dashboardapp.Controller.koneksi.rs;
import static dashboardapp.Controller.koneksi.stm;
import dashboardapp.View.DataPeminjaman;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class DataPeminjamanController {
    private DefaultTableModel tableModel;
    
    public DataPeminjamanController() {
        //
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }
    
    public void getData(DataPeminjaman view) {
        Object[] header = {"No","Kode Peminjam", "Nama Peminjam", "Stok Peminjaman",
        "Tanggal Peminjam"};
        tableModel = new DefaultTableModel(null, header);
        view.getTabel_peminjam().setModel(tableModel);
        
        String sql = "select * from peminjaman";
        
        try {
            Connection conn = new koneksi().getConnetion(sql);
            rs = stm.executeQuery(sql);
            int i = 0;
            
            while (rs.next()) {                
                i++;
                String kodePeminjam = rs.getString("kode_peminjaman");
                String kodeBarang = rs.getString("kode_barang");
                String namaPeminjam = rs.getString("nama_peminjam");
                String jumlahPeminjam = rs.getString("stok_peminjaman");
                String statusPeminjam = rs.getString("status_peminjaman");
                String tglPeminjam = rs.getString("tanggal_pinjam");
                String tglPengembalian = rs.getString("tanggal_pengembalian");
                
                String[] dataTable = {Integer.toString(i),kodePeminjam,kodeBarang,namaPeminjam,jumlahPeminjam,statusPeminjam,tglPeminjam,tglPengembalian};
                
                tableModel.addRow(dataTable);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Untuk menampilkan Data");
        }
    }
    
    public void tambahData(DataPeminjaman view) {
        String kodePeminjam = view.getKodePinjam().getText();
        String kodeBarang = "MI002";
        String namaPeminjam = view.getNamaPeminjam().getText();
        String jumlahPeminjam = view.getJumlahPeminjaman().getText();
        String statusPeminjam = "Dipinjam";
        String tglPeminjam = view.getTglPeminjam().getText();
        String tglPengembalian = "";
        
        
        
        String sql = "insert into peminjaman(kode_peminjaman, kode_barang, nama_peminjam, stok_peminjaman,"
                + "status_peminjaman, tanggal_pinjam, tanggal_pengembalian)"
                + " values('"+kodePeminjam+"','"+kodeBarang+"','"+namaPeminjam+"','"+Integer.parseInt(jumlahPeminjam)+"','"+statusPeminjam+"','"+tglPeminjam+"','"+tglPengembalian+"')";
        
        System.out.println(sql);
        try {
            Connection conn = new koneksi().getConnetion(sql);
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Gagal Menambahkan Data", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
