/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar.pkg2.pkg1;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang {
    // atribut
    double panjang;
    double lebar;
    
    // constructor
    PersegiPanjang(double p, double l){
        this.panjang = p;
        this.lebar = l;
    
    }

    PersegiPanjang() {
        this.panjang = 0;
        this.lebar = 0;
    }
    
    PersegiPanjang(double p) {
        this.panjang = p;
        this.lebar = 0;
    }
    
    // method
    void hitungLuas(){
        double luas = this.panjang * this.lebar;
        System.out.println("Hasil luas dari persegi panjang adalah " + luas);
}
    
    void hitungKeliling(){
        double keliling = 2 * (this.panjang + this.lebar);
        System.out.println("Hasil keliling dari persegi panjang adalah " + keliling);
}
    }
