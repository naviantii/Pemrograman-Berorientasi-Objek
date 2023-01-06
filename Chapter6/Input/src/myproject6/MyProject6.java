/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject6;
import java.util.Scanner;


public class MyProject6 {
    public static void main(String[] args) {
        /// TIPE DATA JAVA
        Integer a = 30;
        
        System.out.println(a.byteValue());
        System.out.println(a.compareTo(a));
        System.out.println(a.doubleValue());
        System.out.println(a.equals(a));
        System.out.println(a.floatValue());
        System.out.println(a.getClass());
        System.out.println(a.hashCode());
        System.out.println(a.intValue());
        System.out.println(a.longValue());
        System.out.println(a.shortValue());
        System.out.println(a.toString());
        
        
        /// INPUT SCANNER
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bil 1: ");
        int bil1 = input.nextInt();
        
        System.out.print("Masukkan bil 2: ");
        int bil2 = input.nextInt();
        
        int hasil = bil1 + bil2;
        System.out.println("Hasil penjumlahannya adalah " + hasil);
        
    }
    
}
