/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author Indrachelsea
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape a = new Rectangle("red",4,5);
        System.out.println(a);
        System.out.println("Area is "+a.getArea());
        
        Shape b = new Triangle("blue",4,5);
        System.out.println(b);
        System.out.println("Area is "+b.getArea());
    }
    
}
