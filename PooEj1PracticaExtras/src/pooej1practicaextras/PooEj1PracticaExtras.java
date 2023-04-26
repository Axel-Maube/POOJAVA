package pooej1practicaextras;

import Entidad.Cancion;
import java.util.Scanner;

public class PooEj1PracticaExtras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cancion cancion1 = new Cancion();
        System.out.println("Ingrese el nombre de la cancion");
        cancion1.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor de la cancion");
        cancion1.setAutor(leer.nextLine());
        System.out.println("El titulo de la cacion es: " + cancion1.getTitulo() + ". El autor de la cacion es: " + cancion1.getAutor());

    }

}
