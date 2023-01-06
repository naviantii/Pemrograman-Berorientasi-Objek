/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesmodifier;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang {
    int panjang;
    int lebar;
    private double luas;
    private double keliling;
    
    void hitungLuas(){
        this.luas = this.panjang * this.lebar;
    }
    
    void hitungKeliling(){
        this.keliling = 2* (this.panjang + this.lebar);
    }
    
    void output(){
        System.out.println("Luasnya : " + luas);
        System.out.println("Kelilingnya : " + keliling);
    }
}
