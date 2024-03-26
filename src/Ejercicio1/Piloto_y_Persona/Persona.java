package Ejercicio1.Piloto_y_Persona;

public class Persona {
    private int dni;
    private int edad;
    private String nombre;

    public Persona(){}

    public Persona(int dni, int edad, String nombre) {
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
