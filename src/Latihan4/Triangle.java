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
public class Triangle extends Shape{
    private int base,heigth;
    
    
    public Triangle (String color,int base,int heigth){
        super(color);
        this.base=base;
        this.heigth=heigth;
    }
    
    public String toString(){
        return "Triangle[base="+base+",heigth="+heigth+","+super.toString()+"]";
    }
    
    
    public double getArea(){
        return 0.5*base*heigth;
    }
}
