/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;
import java.util.*;

public class TebakAngka {

    public static void main(String[] args) {
        // atribut
        int max = 100;
        int min = 1;
        
        // random
        Random tebak = new Random();
        int bil = min + tebak.nextInt(max);
        
        System.out.println("Selamat datang! Saya telah memilih sebuah bilangan bulat secara acak antara 0 - 100. Silakan tebak ya-!");
        Scanner input = new Scanner(System.in);
        
        // tebak angka
        while(true){
            System.out.print("Tebakan anda : ");
            int tebakan = input.nextInt();
            if (tebakan == bil){
                System.out.println("Selamat, bilangan tebakan anda benar-! :D");
                break;
            } else if (tebakan > 100){
                System.out.println("Harap masukkan bilangan antara 0 - 100");
            } else if (tebakan < 0){
                System.out.println("Harap masukkan bilangan antara 0 - 100");
            } else if (tebakan >= bil){
                System.out.println("Bilangan tebakan anda terlalu besar");
            } else if (tebakan <= bil){
                System.out.println("Bilangan tebakan anda terlalu kecil");
            } 
        }
    }
    
}
