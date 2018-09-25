/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author Indrachelsea
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Line a = new Line (0,50,4,26);
        Line b = new Line (6,2,4,5);
        a.getLength();
        b.getLength();
        System.out.println("aLen>bLen = "+a.isGreater(a,b));
        System.out.println("aLen<bLen = "+a.isLess(a,b ));
        System.out.println("aLen=bLen = "+a.isEqual(a, b));
    }
    
}
