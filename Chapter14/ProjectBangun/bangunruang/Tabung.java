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
public class Tabung extends BangunRuang {
    // atribut jari-jari
    public double jejari;
    public double tinggi;
     
    // method untuk hitung luas lingkaran
    @Override
    public double hitungLuas(){
        double luas = 3.14 * 2 * this.jejari * (this.jejari + this.tinggi);
        return luas;
    }
    
    // method untuk hitung keliling
    @Override
    public double hitungVolume(){
 	  double volume = 3.14 * this.tinggi * this.jejari * this.jejari;
          return volume;
    }
}
