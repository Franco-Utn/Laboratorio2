package Ejercicio2;

public class Avion {

    private int idAvion;
    private String modelo;
    private String matricula;
    private int capacidadPasajeros;

    public Avion(int idAvion, String modelo, String matricula, int capacidadPasajeros) {
        this.idAvion = idAvion;
        this.modelo = modelo;
        this.matricula = matricula;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "idAvion=" + idAvion +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", capacidadPasajeros=" + capacidadPasajeros +
                '}';
    }
}