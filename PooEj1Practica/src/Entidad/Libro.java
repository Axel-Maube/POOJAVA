
package Entidad;

import java.util.Scanner;


public class Libro{

    
    private String iSBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro(String iSBN, String titulo, String autor, int numPaginas) {
        this.iSBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public Libro() {
    }

  
    
    public void guardarLibro (){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el ISNB");
        this.iSBN = leer.nextLine();
        System.out.print("Ingrese el titulo");
        this.titulo = leer.nextLine();
        System.out.print("Ingrese el autor");
        this.autor = leer.nextLine();
        System.out.print("Ingrese la cantidad de paginas");
        this.numPaginas = leer.nextInt();
    }
    public void mostrarLibro(){
        System.out.println("El ISBN es: " + this.iSBN);
        System.out.println("El titulo del libro es: " + this.titulo);
        System.out.println("El autor del libro es: " + this.autor);
        System.out.println("La cantidad de paginas del libro son: " + this.numPaginas);
    }
    
    
    
}
