/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject5;

/**
 *
 * @author ASUS
 */
public class Karyawan {
    // atribut
    String nama;
    String id;
    String alamat;
    int gaji;
    
    Karyawan(String a, String b, String c, int d){
        this.nama = a;
        this.id = b;
        this.alamat = c;
        this.gaji = d;
    }
    
    void tampilData(){
        System.out.println("ID Karyawan : " + this.id);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Alamat      : " + this.alamat);
        System.out.println("Gaji        : Rp " + this.gaji);
    }
}
