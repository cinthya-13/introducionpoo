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
public class bicicletas {
    private int costo;
    private String modelo;
    private String color;
    private double tamañó;
    private String garantia;
    public void arquilerbicicletas(){
        System.out.println("hola soy la bicicleta si deseas me puedes arquilar");
    }
    public void repararbicicletas (){
        System.out.println("hola soy la bicicleta no estoy bien me puedes reparar");
    }
    public void excibirbicicletas (){
            System.out.println("hola soy la bicicleta y si deas te puedo excibir mas modelos si deseas");
    }
     public static void main(String[] args) {
        bicicletas primerobjeto=new bicicletas();
        primerobjeto.arquilerbicicletas();
        primerobjeto.repararbicicletas();
        primerobjeto.excibirbicicletas();
    }
}
