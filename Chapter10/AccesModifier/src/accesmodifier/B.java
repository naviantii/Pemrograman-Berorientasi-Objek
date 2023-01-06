/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesmodifier;

/**
 *
 * @author ASUS
 */
public class B {
    void test(){
        A obj = new A();
        obj.x = 101;
        obj.y();
    }
}
