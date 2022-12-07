/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author ASUS
 */
public class Bola extends BangunRuang{
    // atribut jari-jari
    public double jejari;
     
    // method untuk hitung luas lingkaran
    @Override
    public double hitungLuas(){
        double luas = 4/3 * 3.14 * this.jejari * this.jejari * this.jejari;
        return luas;
    }
    
    // method untuk hitung keliling
    @Override
    public double hitungVolume(){
 	  double volume = 3.14 * 4 * this.jejari * this.jejari;
          return volume;
    }
}
