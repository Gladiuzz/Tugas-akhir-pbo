/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboardapp.model;

/**
 *
 * @author LENOVO
 */
public class peminjamanModel {
    private String kodeBarang;
    private String kodePeminjam;
    private String namaBarang;
    private int stokPeminjaman;
    private String tglPinjam;

    public String getKodePeminjam() {
        return kodePeminjam;
    }

    public void setKodePeminjam(String kodePeminjam) {
        this.kodePeminjam = kodePeminjam;
    }
    
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStokPeminjaman() {
        return stokPeminjaman;
    }

    public void setStokPeminjaman(int stokPeminjaman) {
        this.stokPeminjaman = stokPeminjaman;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }
    
    public void resetForm(){
        
    }
    
}
