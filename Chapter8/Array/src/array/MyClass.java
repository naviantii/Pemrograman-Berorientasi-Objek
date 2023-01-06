/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class MyClass {
    void simpleArray(){
        // melihat data biasa
        int[] bil = new int[5];
        
        bil[0] = 5;
        bil[1] = 4;
        bil[2] = 7;
        bil[3] = 9;
        bil[4] = 1;
        
        System.out.println(bil[3]);
        
        // menampilkan semua data berdasar input
        Scanner input = new Scanner(System.in);
        for (int i=0; i<bil.length; i++){
            System.out.println("Masukkan data : ");
            bil[i] = input.nextInt();
        }
        System.out.println("Tampilan semua data : ");
        
        for (int data : bil){
            System.out.println(data);
            
        }
    }
}
