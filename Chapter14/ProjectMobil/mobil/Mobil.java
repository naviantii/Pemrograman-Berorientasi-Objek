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
public abstract class Mobil {
    public String jenis;
    public String nama;
    public double jarak;
    public double kecepatan;
    public abstract double hitungBahanBakar();
    public abstract double hitungWaktu();
    public void tampilHasil(){
        System.out.println("Jumlah konsumsi bahan bakar mobil " + this.jenis + " " + this.nama  + " : " + this.hitungBahanBakar() + " liter");
        System.out.println("Lama waktu perjalanan mobil "  + this.jenis + " " + this.nama + " : " + this.hitungWaktu() + " jam");
    }
}
