/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arch_serializables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import serializab.estudiante;

/**
 *
 * @author ISTLOJAV
 */
public class Jugador implements Serializable {
    private String nombre;
    private String apellido;
    private int edad;
    private int numero_goles;
    private int año_debut;
    private Equipo equipo;

    public Jugador(String nombre, String apellido, int edad, int numero_goles, int año_debut, Equipo equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numero_goles = numero_goles;
        this.año_debut = año_debut;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getNumero_goles() {
        return numero_goles;
    }

    public void setNumero_goles(int numero_goles) {
        this.numero_goles = numero_goles;
    }

    public int getAño_debut() {
        return año_debut;
    }

    public void setAño_debut(int año_debut) {
        this.año_debut = año_debut;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
    

       