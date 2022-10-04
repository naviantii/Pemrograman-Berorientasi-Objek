/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author ASUS
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Project 1
        
        // hitung luas setiap ruang
        
        Lingkaran A = new Lingkaran();
        A.r = 21;
        
        Persegi B = new Persegi();
        B.s = 42;
        
        // hitung luas total bidang dalam m2
        double totalLuasProject1 = (2 * A.hitungLuas()) + B.hitungLuas();
        System.out.println("Total luas bangun datar tersebut adalah " + totalLuasProject1 + "cm²");
        
        
        // Project 2
        
        // hitung luas setiap ruang
        
        // setengah lingkaran besar
        Lingkaran C = new Lingkaran();
        C.r = 14;
        
        // 1 lingkaran kecil
        Lingkaran D = new Lingkaran();
        D.r = 7;
        
        // hitung luas total bidang dalam m2
        double totalLuasProject2 = (0.5 * C.hitungLuas()) -  D.hitungLuas();
        System.out.println("Total luas bangun datar tersebut adalah " + totalLuasProject2+ "cm²");
    }
    
}
