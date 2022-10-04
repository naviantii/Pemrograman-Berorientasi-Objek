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
public class Lingkaran {
    //atribut
    double jejari;
    
    // constructor
    Lingkaran(double r){
        this.jejari = r;
    }
    
    Lingkaran(){
        this.jejari = 0;
    }
    
    // method
    void hitungLuas(){
        double luas = 3.14 * this.jejari * this.jejari;
        System.out.println("Hasil luas dari lingkaran adalah " + luas);
}
    
    void hitungKeliling(){
        double keliling = 3.14 * 2 * this.jejari;
        System.out.println("Hasil keliling dari lingkaran adalah " + keliling);
}
}
