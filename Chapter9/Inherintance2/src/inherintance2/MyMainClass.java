/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherintance2;

/**
 *
 * @author ASUS
 */
public class MyMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.x = 5;
        a.y = 10;
        a.myMethod1();
        
        ClassB b = new ClassB();
        b.x = 5;
        b.y = 10;
        b.z = 15;
        b.myMethod1();
        
        ClassC c = new ClassC();
        c.c = 0;
        c.x = 5;
        c.y = 10;
        c.z = 15;
        c.myMethod1();
        c.myMethod2();
    }
    
}
