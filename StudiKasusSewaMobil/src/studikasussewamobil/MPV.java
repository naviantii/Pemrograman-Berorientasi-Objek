/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasussewamobil;

/**
 *
 * @author ASUS
 */
public class MPV extends Mobil implements Sopir {
    // atribut
    public int TARIF_DASAR_SEWA = 500000;
    public int tarifSopir;
    
    @Override
    public double hitungSewaMobil() {
        double sewa = this.durasi / 12 * this.TARIF_DASAR_SEWA;
        return sewa;
    }

    @Override
    public double hitungTarifSopir() {
        if (this.tujuan == 1){
            this.tarifSopir = this.durasi / 12 * 400000;
        } else if (this.tujuan == 0){
            this.tarifSopir = this.durasi / 12 * 450000;
        }
        return tarifSopir;
    }
    
    @Override
    public void tampilRincianBiaya() {
        double totalBiaya = this.hitungSewaMobil() + this.hitungTarifSopir();
        double diskon;
        
        if (this.durasi >= 24){
            diskon = 0.05 * totalBiaya;
        } else{
            diskon = 0;
        }
        double totalTarif = totalBiaya - diskon;
        
        System.out.println("--------------------------------------");
        System.out.println("Nama Mobil          : " + this.merk);
        System.out.println("Nama Penyewa        : " + this.namaPenyewa);
        System.out.println("--------------------------------------");
        System.out.println("Biaya Sewa Mobil    : " + this.hitungSewaMobil());
        System.out.println("Biaya Sopir         : " + this.hitungTarifSopir());
        System.out.println("--------------------------------------");
        System.out.println("Total               : " + totalBiaya);
        System.out.println("Diskon              : " + diskon);
        System.out.println("--------------------------------------");
        System.out.println("Biaya Nett          : " + totalTarif);
    }
}
