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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // persegi panjang
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.hitungLuas(10, 5);
        pp1.hitungKeliling(10, 5);
        
        PersegiPanjang pp2 = new PersegiPanjang();
        pp2.hitungLuas(3.6, 8);
        pp2.hitungKeliling(3.6, 8);
        
        PersegiPanjang pp3 = new PersegiPanjang();
        pp3.hitungLuas(6, 8.3);
        pp3.hitungKeliling(6, 8.3);
        
        PersegiPanjang pp4 = new PersegiPanjang();
        pp4.hitungLuas(5.6, 8.8);
        pp4.hitungKeliling(5.6, 8.8);
        
        // persegi
        Persegi p1 = new Persegi();
        p1.hitungLuas(4.5);
        p1.hitungKeliling(4.5);
        
        Persegi p2 = new Persegi();
        p2.hitungLuas(7);
        p2.hitungKeliling(7);
        
        // lingkaran
        Lingkaran l1 = new Lingkaran();
        l1.hitungLuas(5);
        l1.hitungKeliling(5);
        
        Lingkaran l2 = new Lingkaran();
        l2.hitungLuas(7.4);
        l2.hitungKeliling(7.4);
        
        // segitiga
        Segitiga s1 = new Segitiga();
        s1.hitungLuas(8,10);
        
        Segitiga s2 = new Segitiga();
        s2.hitungLuas(8, 11.5);
        
        Segitiga s3 = new Segitiga();
        s3.hitungLuas(12.2, 9);
        
        Segitiga s4 = new Segitiga();
        s4.hitungLuas(13.9, 20.7);
    }
}
