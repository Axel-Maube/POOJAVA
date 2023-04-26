/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método 
el número de ISBN, el título, el autor del libro y el número de páginas.
 */
package pooej1practica;

import Entidad.Libro;

public class PooEj1Practica {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.guardarLibro();
        libro1.mostrarLibro();
        Libro libro2 = new Libro ("25", "Harry Potter", "JKR", 1200);
        libro2.mostrarLibro();
        
    }

}
//Scanner leer = new Scanner(System.in).useDelimiter("\n");
//System.out.println("Ingrese el titulo del libro");
//libro1.setTitulo(leer.next());
//System.out.println(libro1.getTitulo());
//System.out.println("");
//System.out.println("Ingrese el ISNB del libro");
//libro1.setiSBN(leer.nextInt());
//System.out.println(libro1.getiSBN());
//System.out.println("");
// System.out.println("Ingrese el autor del libro");
// libro1.setAutor(leer.next());
//  System.out.print(libro1.getAutor());
// System.out.println("");
// System.out.println("Ingrese el numero de paginas del libro");
// libro1.setNumPaginas(leer.nextInt());
// System.out.print(libro1.getNumPaginas());
