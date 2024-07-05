package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Libro> libros;
    public void agregarLibro(Libro libro){}
    public void listarTodos(){}{
        this.libros = new ArrayList<Libro>();
    }
    public void agregarLibros(Libro libro){
        libros.add(libro);
        System.out.printf("Libro agregado."+ libro.toString());
    }
    public void crearLibro(){
        System.out.printf("Ingrese el titulo del libro");
        String titulo = scanner.nextLine();
        System.out.printf("Ingrese el autor del libro");
        String autor = scanner.nextLine();
        System.out.printf("Ingrese la cantidad de paginas");
        Integer cantidadPags = scanner.nextInt();

        Libro nuevoLibro = new Libro(titulo,autor,cantidadPags);

        libros.add(nuevoLibro);
    }

    public void buscarLibro(String titulo){}}
