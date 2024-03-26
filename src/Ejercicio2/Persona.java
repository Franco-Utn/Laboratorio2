package Ejercicio2;

public class Persona extends Entidad {

    private String apellido;


    public Persona(int idPersona, String nombre, String apellido) {
        super(idPersona, nombre, "Persona");
        this.apellido = apellido;

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    @Override
    public String obtenerInformacionAdicional() {
        return "Apellido: " + apellido + "\n" ;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                obtenerInformacionAdicional();
    }
}
