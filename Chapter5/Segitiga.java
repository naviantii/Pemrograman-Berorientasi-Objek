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
public class Segitiga {
    // atribut
    double alas;
    double tinggi;
    
    // constructor
    Segitiga(double a, double t){
        this.alas = a;
        this.tinggi = t;
    }
    
    Segitiga (double a){
        this.alas = a;
        this.tinggi = 0;
    }
    
    Segitiga(){
        this.alas = 0;
        this.tinggi = 0;
    }
    
    // methods 
    void hitungLuas(){
        double luas = 0.5 * this.alas * this.tinggi;
        System.out.println("Luas dari segitiga adalah " + luas);
    }
}
