package Entidad;

//import java.util.Date;
public class Persona {

     String nombre;
     int edad;
     int id;
//public Date nacimiento;

    public Persona(String nombre, int edad, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }
     public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
/**
 * 
 * @param id 
 */
    public void setId(int id) {
        this.id = id;
    }

   

}
