/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject5;

/**
 *
 * @author ASUS
 */
public class MyClass {
    int x ;
    int y ;
    
    //constructor
    MyClass(int a, int b){
        this.x = a;
        this.y = b;
    }
    
    MyClass(){
        this.x = 0;
        this.y = 0;
    }
    
    MyClass(int a){
        this.x = a;
        this.y = 0;
    }
    
    //methods
    void output(){
        int hasil = this.x + this.y;
        System.out.println("Hasilnya penjumlahannya adalah " + hasil);
    }
}
