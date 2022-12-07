/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang extends BangunDatar {
    // atribut panjang lebar
    public double panjang;
    public double lebar;
    
    
    public double hitungLuas(){
        double luas = this.panjang * this.lebar;
        return luas;
    }
    

    public double hitungKeliling(){
        double keliling = 2 * (this.panjang + this.lebar);
        return keliling;
    }
}
