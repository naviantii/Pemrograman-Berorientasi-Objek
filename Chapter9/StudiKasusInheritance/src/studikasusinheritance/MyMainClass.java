/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasusinheritance;

/**
 *
 * @author ASUS
 */
public class MyMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen d1 = new Dosen();
        d1.namaPegawai = "Budi";
        d1.kodePegawai = "P01";
        d1.golPegawai = 3;
        d1.nidn = "9181818";
        System.out.println("Gaji Pokok : " + d1.hitungGajiPokok() );
        System.out.println("Tunjangan : " + d1.hitungTunjangan());
    }
    
}
