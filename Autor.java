/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoserializables;

/**
 *
 * @author ISTLOJAV
 */
public class Autor implements serializable {
    
   private String nombre_autor;
   private String apellido;
   private int edad;
   private String nacionalidad;
   

    public Autor() {
    }

    public Autor(String nombre_autor, String apellido, int edad, String nacionalidad) {
        this.nombre_autor = nombre_autor;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        
    }

    
    public String getNombre_autor() {
        return nombre_autor;
    }

    public void setNombre_autor(String nombre_autor) {
        this.nombre_autor = nombre_autor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


   
}
