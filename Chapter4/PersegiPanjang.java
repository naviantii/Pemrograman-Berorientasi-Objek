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
public class PersegiPanjang {
    // luas
    void hitungLuas(int p, int l){
        int luas = p*l;
        System.out.println("Luas persegi panjangnya adalah " + luas);
    }
    
    void hitungLuas(double p, int l){
        double luas = p*l;
        System.out.println("Luas persegi panjangnya adalah " + luas);
    }
    
    void hitungLuas(int p, double l){
        double luas = p*l;
        System.out.println("Luas persegi panjangnya adalah " + luas);
    }
    
    void hitungLuas(double p, double l){
        double luas = p*l;
        System.out.println("Luas persegi panjangnya adalah " + luas);
    }
    
    // keliling
    void hitungKeliling(int p, int l){
        int keliling = 2*(p+l);
        System.out.println("Keliling persegi panjangnya adalah " + keliling);
    }
    
    void hitungKeliling(double p, int l){
        double keliling = 2*(p+l);
        System.out.println("Keliling persegi panjangnya adalah " + keliling);
    }
    
    void hitungKeliling(int p, double l){
        double keliling = 2*(p+l);
        System.out.println("Keliling persegi panjangnya adalah " + keliling);
    }
    
    void hitungKeliling(double p, double l){
        double keliling = 2*(p+l);
        System.out.println("Keliling persegi panjangnya adalah " + keliling);
    }
}
