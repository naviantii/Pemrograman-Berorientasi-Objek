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
public class Persegi {
    // atribut
    double sisi;
    
    // constructor
    Persegi(double s){
        this.sisi = s;
    }
    
    Persegi(){
        this.sisi = 0;
    }
    
    // method
    void hitungLuas(){
        double luas = this.sisi * this.sisi;
        System.out.println("Luas dari persegi adalah " + luas);
    }
    
    void hitungKeliling(){
        double keliling = 4 * this.sisi;
        System.out.println("Keliling dari persegi adalah " + keliling);
    }
}
