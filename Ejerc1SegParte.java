/*Create a class with the following methods:
Return type: void - Body: Iterate trough an Array and print the smallest number - Parameters: Array of integers.
Return type: void - Body: Iterate trough a HashMap and print the value based on the Key - Parameters: None.*/
package com.java.UnosquareJava.Ejercicio1.app.Ejerc1SegParte;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap; 

public class Ejerc1SegParte{
  public static void main(String[] args){

    Ejerc1SegParte smallest = new Ejerc1SegParte();
    int [] lista = new int [] {-4, -1, -7, -3, -4};     
    smallest.smallstNumber(lista);   

    Ejerc1SegParte hiteration = new Ejerc1SegParte();
    hiteration.hashIteration();

  }
  public void smallstNumber(int[] list ){
      int nM = list[0];
      for (int i=0; i < list.length; i++){
          if(list[i] < nM){
              nM = list[i];            
            } 
                    
        } 

    System.out.println("El numero menor es : " + nM);
  }

  public void hashIteration(){
    HashMap<Integer,String> hmap = new HashMap<Integer,String>();
    hmap.put(1, "Uno, ");
    hmap.put(2, "Dos, ");
    hmap.put(3, "Tres, ");
    hmap.put(4, "Cuatro, ");
    hmap.put(5, "Cinco, ");

    for (Integer h : hmap.keySet())
        System.out.println("La Llave es : " + h + " Y el valor es :" + hmap.get(h));
      
  }
}



