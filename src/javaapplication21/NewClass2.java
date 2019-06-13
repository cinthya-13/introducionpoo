/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author ISTLOJAV 
 */
public class NewClass2{
    public static void main(String []args){
        
        String cadena = "Que hermoso es Ecuador";
        
        int longitud = cadena.length();
        
        System.out.println("Ejemplo de SubString 1 = " + cadena.substring(5));
        System.out.println("Ejemplo de SubString 2 = " + cadena.substring(5,9));
        System.out.println("Ejemplo de SubString 3 = " + cadena.substring(12));
    }
}
