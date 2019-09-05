/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoserializables;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJAV
 */
public class leeryescribir {

    public void escrbirobjeto(String direccion, List<Libro> lista) {
        try {
            ObjectOutputStream escrito = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Libro libro : lista) {

                escrito.writeObject(libro);
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
                Libro j1 = (Libro) auxiliar;
                System.out.println(j1.getNombre());
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {

            System.out.println(e);
        }
    }
      public List<Libro> leerlibro(String dir) {
        List<Libro> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dir));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Libro b1 = (Libro) auxiliar;
                System.out.println(b1.getNombre());
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }
    public Libro libromasantiguo (List<Libro> lista){
   Libro antiguo = lista.get(0);
        for (Libro libro : lista) {
            if (antiguo.getAño_publicacion() < libro.getAño_publicacion());
            antiguo = libro;
        }

        return antiguo;

    }

  public Libro libroactualizado(List<Libro> lista){
 Libro actual =lista.get(0);
    for (Libro libro:lista){
        if(actual.getAño_publicacion()<= libro.getAño_publicacion());
          actual=libro;
          
        }
         return actual;
    }
}
