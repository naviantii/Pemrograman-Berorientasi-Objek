
import bangundatar.*;
import bangunruang.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class MainClass{
    public static void main(String[] args) {
        // bangun datar
        Persegi p1 = new Persegi();
        p1.sisi = 2;
        p1.tampilHasil();
        
        Lingkaran l1 = new Lingkaran();
        l1.jejari = 10;
        l1.tampilHasil();
        
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.lebar = 5; 
        pp1.panjang = 10;
        pp1.tampilHasil();
        
        //bangun ruang
        Balok b1 = new Balok();
        b1.lebar = 5;
        b1.panjang = 10;
        b1.tinggi = 15;
        b1.tampilHasil();
        
        Bola bl1 = new Bola();
        bl1.jejari = 100;
        bl1.tampilHasil();
        
        Tabung t1 = new Tabung();
        t1.jejari = 10;
        t1.tinggi = 20;
        t1.tampilHasil();
    }
}
