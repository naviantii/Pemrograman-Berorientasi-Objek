/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang {
    private double panjang;
    private double lebar;
    private double luas;
    
    void setPanjang(double p){
        // pasti ada argumennya kek double p
        if (p>0){
            this.panjang = p;
        } else{
            System.out.println("Nilai tidak valid");
            System.exit(0);
        }
    }
    
    void setLebar(double l){
        if (l>0){
            this.lebar = l;
        } else{
            System.out.println("Nilai tidak valid");
            System.exit(0);
        }
    }
    
    double getPanjang(){
        // gausah pake argumen
        return this.panjang;
    }
    
    double getLebar(){
        return this.lebar;
    }
    
    double hitungLuas(){
        this.luas = this.panjang * this.lebar;
        return this.luas;
    }
}
