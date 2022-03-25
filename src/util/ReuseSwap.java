/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author hsavaryjackson
 */
public class ReuseSwap {
    public String nameRecyclable, nameNonRecyclable;
    public double dRatio, dWeight;
    
    public ReuseSwap(String recName, String nonRecName, double ratio,  double weight){
	nameRecyclable = recName;
	nameNonRecyclable = nonRecName;
	dRatio = ratio;
	dWeight = weight;
    }
    
    public String toString(){
	return nameRecyclable + " " + nameNonRecyclable + "  " + String.valueOf(dRatio) + " " +String.valueOf(dWeight);
    }
	   
}
