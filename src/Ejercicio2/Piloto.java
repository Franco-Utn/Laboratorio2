package Ejercicio2;
public class Piloto extends Persona implements Volador {

    private String licencia;
    private int horasVuelo;

    public Piloto(int idPiloto, String nombre, String apellido, String licencia, int horasVuelo) {
        super(idPiloto, nombre, apellido);
        this.licencia = licencia;
        this.horasVuelo = horasVuelo;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    @Override
    public String obtenerInformacionAdicional() {
        return "Licencia: " + licencia + "\n" +
                "Horas de vuelo: " + horasVuelo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                obtenerInformacionAdicional();
    }

    // -	Una implementación entre la clase piloto y la interface Volador
    @Override
    public void volar() {
        System.out.println("El piloto se encuentra volando");
    }
}
