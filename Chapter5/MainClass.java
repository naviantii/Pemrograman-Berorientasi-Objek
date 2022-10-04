/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar.pkg2.pkg1;

/**
 *
 * @author ASUS
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Persegi Panjang
        PersegiPanjang pp1 = new PersegiPanjang(10, 5);
        pp1.hitungLuas();
        pp1.hitungKeliling();
        
        PersegiPanjang pp2 = new PersegiPanjang(3.6, 8);
        pp2.hitungLuas();
        pp2.hitungKeliling();
        
        PersegiPanjang pp3 = new PersegiPanjang(6, 8.3);
        pp3.hitungLuas();
        pp3.hitungKeliling();
        
        PersegiPanjang pp4 = new PersegiPanjang(5.6, 8.8);
        pp4.hitungLuas();
        pp4.hitungKeliling();
        
        // Persegi
        Persegi p1 = new Persegi(4.5);
        p1.hitungLuas();
        p1.hitungKeliling();
        
        Persegi p2 = new Persegi(7);
        p2.hitungLuas();
        p2.hitungKeliling();
        
        // Lingkaran
        Lingkaran l1 = new Lingkaran (5);
        l1.hitungLuas();
        l1.hitungKeliling();
        
        Lingkaran l2 = new Lingkaran (7.4);
        l2.hitungLuas();
        l2.hitungKeliling();
        
        // Segitiga
        Segitiga s1 = new Segitiga (8, 10);
        s1.hitungLuas();
        
        Segitiga s2 = new Segitiga (8, 11.5);
        s2.hitungLuas();
        
        Segitiga s3 = new Segitiga (12.2, 9);
        s3.hitungLuas();
        
        Segitiga s4 = new Segitiga (13.9, 20.7);
        s4.hitungLuas();
    }
}
