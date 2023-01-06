/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayjava;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Rerata {
    int n;
    
    double hitungRerata(int[] data){
        int sum = 0;
        for (int i=0; i<this.n; i++){
            sum += data[i];
        }
        int hasil = sum/n;
        return hasil;
    }
    
    void rerata(){
        int[] bil = new int[100];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah data :");
        this.n = input.nextInt();
        
        for (int i=0; i<this.n; i++){
            System.out.println("Masukkan data ke-" + (i+1) + ": ");
            bil[i] = input.nextInt();
        }
        
        System.out.println("Reratanya adalah : " + this.hitungRerata(bil));
    }
}
