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
public class KaryawanA {
//    //atribut
//    private String nikKaryawan;
//    private String namaKaryawan;
//    private int gajiPokok;
//    private final int tunjanganA;
//    private int totalGaji;
//
//    private void gajiPokok(){
//        this.gajiPokok = 3000000;
//    }
//    
//    KaryawanA() {
//        this.tunjanganA = 1500000;
//    }
//    
//    void setTotalGaji(){
//        if (gajiPokok > 0){
//            if (tunjanganA > 0){
//                this.totalGaji = this.gajiPokok + this.tunjanganA;
//                }
//        }
//    }
//    
//    double getTotalGaji(){
//        return this.totalGaji;
//    }
    
    
        
    // pak ari
    public String nik;
    public String nama;
    private int gapok = 3000000; //karna udah fix
    int tunjangan;
    protected int masaKerja;
    private int totalGaji;
    
    void setMasaKerja(int mk){
        if (mk > 0){
            this.masaKerja = mk;
        } else {
            System.out.println("Masa kerja tidak valid");
            System.exit(0);
        }
    }
    
    int getMasaKerja(){
        return this.masaKerja;
    }
    
    //kalo gapake private nanti di void printKaryawan gausah dipanggil, tp better dipanggil biar gak terlalu banyak method digunakan
    protected void hitungTunjangan(){
        if(masaKerja < 10){
            this.tunjangan = 2000000;
        } else {
            this.tunjangan = 3000000;
        }
    }
    
    private void hitungTotalGaji(){
        this.totalGaji = this.gapok + this.tunjangan;
    }
    
    void printKaryawan(){
        this.hitungTunjangan();
        this.hitungTotalGaji();
        System.out.println("NIK         :" + this.nik);
        System.out.println("Nama        :" + this.nama);
        System.out.println("-------------------------------");
        System.out.println("Masa Kerja  :" + this.masaKerja);
        System.out.println("Gaji Pokok  :" + this.gapok);
        System.out.println("Tunjangan   :" + this.tunjangan);
        System.out.println("-------------------------------");
        System.out.println("Total Gaji  :" + this.totalGaji);
    }
}
