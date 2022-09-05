/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

/**
 *
 * @author ASUS
 */
public class Lingkaran {
    // atribut
    
    int jejari;
    
    // methods
    
    void hitungLuas(){
        double luas = 3.14 * this.jejari * this.jejari;
        System.out.println("Luas lingkaran : " + luas + " satuan luas");
    }
    
    void hitungKeliling(){
        double keliling = 3.14 * 2 * this.jejari;
        System.out.println("Keliling lingkaran : " + keliling + " satuan panjang");
    }
}
