/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author ASUS
 */
public class Lingkaran {
    // luas
    void hitungLuas(int r){
        double luas = 3.14 * r * r;
        System.out.println("Luas lingkarannya adalah " + luas);
    }
    
    void hitungLuas(double r){
        double luas = 3.14 * r * r;
        System.out.println("Luas lingkarannya adalah " + luas);
    }
    
    // keliling
    void hitungKeliling (int r){
        double keliling = 3.14 * 2 * r;
        System.out.println("Luas lingkarannya adalah " + keliling);
    }
    
    void hitungKeliling (double r){
        double keliling = 3.14 * 2 * r;
        System.out.println("Luas lingkarannya adalah " + keliling);
    }
}
