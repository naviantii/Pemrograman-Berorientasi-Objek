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
public class A {
    // access modifier default, hanya bisa diakses di package yang sama (tanpa public)
    protected int x;
    
    public void y(){
        System.out.println("Hello");
    }
}
