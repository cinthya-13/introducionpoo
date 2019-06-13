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
public class NewClass {
    //declarar atributos
    private int año;
    private String modelos;
    private String marca;
    //DECLARO METODOS
    public void guardarInformacion(){
        System.out.println("HI SOY LA COMPUTADORA Y GUARDO INFORRMACION");
    }
    public static void leerInformacion(){
        System.out.println(" hola soy la computadora y leo informacion");
}
    public void imprimirInformacion(String info){
        System.out.println(info);
    }
    public static void main(String[] args) {
        NewClass primerobjeto=new NewClass();
        primerobjeto.guardarInformacion();
        primerobjeto.imprimirInformacion("hola");
        primerobjeto.imprimirInformacion("chao");
    }
}
    

