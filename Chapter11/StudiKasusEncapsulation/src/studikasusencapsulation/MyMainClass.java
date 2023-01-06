/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasusencapsulation;

/**
 *
 * @author ASUS
 */
public class MyMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KaryawanB k1 = new KaryawanB();
        k1.nik = "300000";
        k1.nama = "Kai";
        k1.setMasaKerja(11);
        k1.printKaryawan();
    }
    
}
