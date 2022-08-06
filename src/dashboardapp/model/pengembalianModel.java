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
public class pengembalianModel {
    private String kodeBarang, kodePeminjam, namaBarang, tglPengembalian;
    private int stokBarang;

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

    public String getTglPengembalian() {
        return tglPengembalian;
    }

    public void setTglPengembalian(String tglPengembalian) {
        this.tglPengembalian = tglPengembalian;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    public void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }
    
    public void resetForm(){
        
    }
}
