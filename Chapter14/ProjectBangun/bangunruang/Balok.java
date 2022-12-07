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
public class Balok extends BangunRuang{
        // atribut jari-jari
    public double panjang;
    public double lebar;
    public double tinggi;
     
    // method untuk hitung luas lingkaran
    @Override
    public double hitungLuas(){
        double luas = 2 * (this.panjang * this.lebar + this.panjang * this.tinggi + this.lebar * this.tinggi);
        return luas;
    }
    
    // method untuk hitung keliling
    @Override
    public double hitungVolume(){
 	  double volume = this.panjang * this.lebar * this.tinggi;
          return volume;
    }
}
