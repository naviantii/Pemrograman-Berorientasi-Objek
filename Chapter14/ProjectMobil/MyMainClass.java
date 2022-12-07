/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import mobil.*;
/**
 *
 * @author ASUS
 */
public class MyMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sedan a = new Sedan();
        a.jenis = "Sedan";
        a.nama = "A";
        a.jarak = 113;
        a.kecepatan = 60;
        a.tampilHasil();
            
        Sedan b = new Sedan();
        b.jenis = "Sedan";
        b.nama = "B";
        b.jarak = 531;
        b.kecepatan = 65;
        b.tampilHasil();
        
        SUV c = new SUV();
        c.jenis = "SUV";
        c.nama = "C";
        c.jarak = 655;
        c.kecepatan = 57;
        c.tampilHasil();
        
        SUV d = new SUV();
        d.jenis = "SUV";
        d.nama = "D";
        d.jarak = 526;
        d.kecepatan = 62;
        d.tampilHasil();
        
        MPV e = new MPV();
        e.jenis = "MPV";
        e.nama = "E";
        e.jarak = 539;
        e.kecepatan = 64;
        e.tampilHasil();
        
        MPV f = new MPV();
        f.jenis = "MPV";
        f.nama = "F";
        f.jarak = 428;
        f.kecepatan = 53;
        f.tampilHasil();
    }
    
}
