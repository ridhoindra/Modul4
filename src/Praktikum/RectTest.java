/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Indrachelsea
 */
public class RectTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rect a = new Rect(1, 1, 4, 4);
        Rect b = new Rect(2, 3, 5, 6);

        System.out.println("2,3 is Inside the Union");
        System.out.println(a + " union" + b + " =" + a.union(b));
        System.out.println(a + " intersection" + b + " =" + a.intersection(b));
    }

}
