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
public class MyMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // class MyClass
        MyClass m = new MyClass(10, 30);
        m.output();
        
        MyClass n = new MyClass();
        n.x = 10;
        n.y = 45;
        n.output();
        
        MyClass o = new MyClass(50);
        o.y = 20;
        o.output();
        
        // class Karyawan
        Karyawan k1 = new Karyawan("Kai", "K01", "Solo", 4000000);
        k1.tampilData();
    }
    
}
