/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasussewamobil;

/**
 *
 * @author ASUS
 */
public class MyMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sedan s1 = new Sedan();
        s1.namaPenyewa = "Mr. A";
        s1.merk = "Sedan";
        s1.tujuan = 0;
        s1.durasi = 48;
        s1.tampilRincianBiaya();
        
        Hatchback h1 = new Hatchback();
        h1.namaPenyewa = "Mr. B";
        h1.merk = "Hatchback";
        h1.tujuan= 1;
        h1.durasi = 24;
        h1.statusSopir = 1;
        h1.tampilRincianBiaya();
        
        Hatchback h2 = new Hatchback();
        h2.namaPenyewa = "Mr. C";
        h2.merk = "Hatchback";
        h2.tujuan= 1;
        h2.durasi = 156;
        h2.statusSopir = 0;
        h2.tampilRincianBiaya();
        
        MPV m1 = new MPV();
        m1.namaPenyewa = "Mr. D";
        m1.merk = "MPV";
        m1.tujuan = 0;
        m1.durasi = 72;
        m1.tampilRincianBiaya();
        
        MPV m2 = new MPV();
        m2.namaPenyewa = "Mr. E";
        m2.merk = "MPV";
        m2.tujuan = 0;
        m2.durasi = 72;
        m2.tampilRincianBiaya();
        
        SUV su1 = new SUV();
        su1.namaPenyewa = "Mr. F";
        su1.merk = "SUV";
        su1.tujuan = 1;
        su1.durasi = 96;
        su1.tampilRincianBiaya();
        
        SUV su2 = new SUV();
        su2.namaPenyewa = "Mr. G";
        su2.merk = "SUV";
        su2.tujuan = 0;
        su2.durasi = 144;
        su2.tampilRincianBiaya();
    }
    
}
