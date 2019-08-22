/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arch_serializables;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import serializab.estudiante;

/**
 *
 * @author ISTLOJAV
 */
public class Equipo implements Serializable {
    private String nombre;
    private int numero_titulos;
    private String ciudad;

    public Equipo(String nombre, int numero_titulos, String ciudad) {
        this.nombre = nombre;
        this.numero_titulos = numero_titulos;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_titulos() {
        return numero_titulos;
    }

    public void setNumero_titulos(int numero_titulos) {
        this.numero_titulos = numero_titulos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    
}
      
