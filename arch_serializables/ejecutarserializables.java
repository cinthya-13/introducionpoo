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
import java.util.ArrayList;
import java.util.List;
import serializab.estudiante;

/**
 *
 * @author ISTLOJAV
 */
public class ejecutarserializables {
     public void escrbirLista(String direccion, List<estudiante> lista) {
        try {
            ObjectOutputStream escrito = new ObjectOutputStream(new FileOutputStream(direccion));
            for (estudiante estudiante : lista) {

                escrito.writeObject(estudiante);
            }
            escrito.close();
        } catch (Exception e) {
            System.out.println("sintaxis error:" + e);
        }
     }
     public void leerLista(String dir) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dir));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador j1 = (Jugador) auxiliar;
                System.out.println(j1.getNombre());
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            
            System.out.println(e);
        }
     }
          public List<Jugador> leerJugador(String dir){
            List <Jugador> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dir));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador b1 = (Jugador) auxiliar;
                System.out.println(b1.getNombre());
                auxiliar = lector.readObject();
            }
        }catch (Exception e){
                    System.out.println(e);
                    }
            return lista;
              }
          public int edadmayor(List<Jugador> lista){
              int edadmayor = lista.get(0).getEdad();
              for(Jugador jugador:lista){
                  if(Jugador.> edadmayor){
              }
              
          }
     public static void main (String[] args) {
      ejecutarserializables objeto=new ejecutarserializables();
 
        Jugador J1 = new Jugador("cristhian", "ronaldo", 33,520,2005,new Equipo("juventus",20,"TURIN"));
        Jugador J2 = new Jugador("LIONEL", "MESSI", 31,600,2007,new Equipo("BARCELONA",30,"BARCELONA"));
        Jugador J3 = new Jugador("cristhian", "ronaldo", 28,200,2011,new Equipo("REAL MADRID",210,"MUSHUK RUNA"));
        Jugador J4 = new Jugador("cristhian", "ronaldo", 27,1590,2010,new Equipo("EMELEC",40,"GUAYAQUIL"));
         List<Jugador> lista= new ArrayList<>();
         
         
         lista.add(J1);
         lista.add(J2);
         lista.add(J3);
         lista.add(J4);
         
         int c =lista.size();
           
                   
         System.out.println(c);
         }
          Jugador.escrbirLista("‪C:\\Users\\ISTLOJAV\\Desktop\\practic.txt",lista);
     
    }
  