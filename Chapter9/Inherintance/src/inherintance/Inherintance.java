/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherintance;

/**
 *
 * @author ASUS
 */
public class Inherintance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.x = 10;
        a.y = 5;
        a.MyMethod1();
        
        ClassB b = new ClassB();
        b.x = 8;
        b.y = 8;
        b.MyMethod1();
        
        ClassC c = new ClassC();
        c.x = 3;
        c.y = 4;
        c.z = 5;
        c.MyMethod1();
    }
    
}
