/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoserializables;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJAV
 */
public class Libro implements serializable {

    private String nombre;
    private int numero_pag;
    private int cod;
    private double valor_pago;
    private Autor autor;
    private int año_publicacion;
    public Libro() {
    }

    public Libro(String nombre, int numero_pag, int cod, double valor_pago, Autor autor, int año_publicacion) {
        this.nombre = nombre;
        this.numero_pag = numero_pag;
        this.cod = cod;
        this.valor_pago = valor_pago;
        this.autor = autor;
        this.año_publicacion = año_publicacion;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_pag() {
        return numero_pag;
    }

    public void setNumero_pag(int numero_pag) {
        this.numero_pag = numero_pag;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(double valor_pago) {
        this.valor_pago = valor_pago;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAño_publicacion() {
        return año_publicacion;
    }

    public void setAño_publicacion(int año_publicacion) {
        this.año_publicacion = año_publicacion;
    }

    public static void main(String[] args) {
        Libro libro = new Libro();
        Libro libro1 = new Libro("Emancipada", 455, 111, 15.30, new Autor("Alberth ", "Eintein", 65, "Boliviano"),1996);
        Libro libro2 = new Libro("OJOS DE MI PRINCESA", 566, 222, 18.50, new Autor("DANIELA", "LOPEZ", 65, "PERUANA"), 1969);
        Libro libro3 = new Libro("LOS TRES CERDITOS", 33, 333, 1.30, new Autor("GABRIELA  ", "MISTRAL", 65, "COLOMBIANA"), 1992);
        Libro libro4 = new Libro("100 AÑOS DE SOLEDAD", 756, 444, 16.90, new Autor("DIEGO ", "LUMBARDO", 65, "Boliviano"), 1914);
        Libro libro5 = new Libro("CAPERUCITA ROJA", 120, 555, 8.25, new Autor("SALVADOR ", "BUSTAMANTE CELI", 65, "PUERTO RIQUEÑA"), 1994);

        List<Libro> lista = new ArrayList<>();

        lista.add(libro1);
        lista.add(libro2);
        lista.add(libro3);
        lista.add(libro4);
        lista.add(libro5);
        leeryescribir objeto = new leeryescribir();
        objeto.escrbirobjeto("‪C:\\Users\\ISTLOJAV\\Desktop\\biblioteca.txt", lista);
        objeto.leerlibro("‪C:\\Users\\ISTLOJAV\\Desktop\\biblioteca.txt");
        objeto.leerLista("‪C:\\Users\\ISTLOJAV\\Desktop\\biblioteca.txt");
        
      
        System.out.println("bhk"+objeto.libromasantiguo(lista).getAño_publicacion());
    }

}
