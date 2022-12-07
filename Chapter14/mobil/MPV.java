/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author ASUS
 */
public class MPV extends Mobil {
    // method menghitung bahan bakar
    @Override
    public double hitungBahanBakar(){
        double konsumsi = this.jarak / 10;
        return konsumsi;
    }
    
    // method menghitung waktu perjalanan
    @Override
    public double hitungWaktu(){
        double waktu = this.jarak / this.kecepatan;
        return waktu;
    }
}
