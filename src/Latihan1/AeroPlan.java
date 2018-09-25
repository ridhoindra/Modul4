/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author Indrachelsea
 */
public class AeroPlan extends Vehicle{
    public void walk(){
        System.out.println("Aeroplane is Flying");
    }
    public void fuel(){ 
        System.out.println("Fuels");
    }
    public static void main(String[]args){
        AeroPlan a = new AeroPlan();
        a.function();
        a.fuel();
        a.walk();
    }
}
