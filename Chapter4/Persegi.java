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
public class Persegi {
    // luas
    void hitungLuas(int s){
        int luas = s*s;
        System.out.println("Luas perseginya adalah " + luas);
    }
    
    void hitungLuas(double s){
        double luas = s*s;
        System.out.println("Luas perseginya adalah " + luas);
    }
    
    // keliling
    void hitungKeliling(int s){
        int keliling = 4*s;
        System.out.println("Keliling perseginya adalah " + keliling);
    }
    
    void hitungKeliling(double s){
        double keliling = 4*s;
        System.out.println("Keliling perseginya adalah " + keliling);
    }
}
