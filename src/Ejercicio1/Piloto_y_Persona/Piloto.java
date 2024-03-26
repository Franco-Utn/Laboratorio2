package Ejercicio1.Piloto_y_Persona;

import java.util.ArrayList;

public class Piloto extends Persona implements Volador{
    private int horasvuelo;
    private int nroLicencia;

    public Piloto() {
    }

    public Piloto(int dni, int edad, String nombre, int horasvuelo, int nroLicencia) {
        super(dni, edad, nombre);
        this.horasvuelo = horasvuelo;
        this.nroLicencia = nroLicencia;
    }

    public int getHorasvuelo() {
        return horasvuelo;
    }

    public void setHorasvuelo(int horasvuelo) {
        this.horasvuelo = horasvuelo;
    }

    public int getNroLicencia() {
        return nroLicencia;
    }

    public void setNroLicencia(int nroLicencia) {
        this.nroLicencia = nroLicencia;
    }
    public void agregarPiloto(ArrayList<Piloto> listaPilotos, Piloto piloto) {
        listaPilotos.add(piloto);
    }
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + ", DNI: " + this.getDni() + ", Edad: " + this.getEdad() + ", Horas de vuelo: " + this.getHorasvuelo() + ", Número de licencia: " + this.getNroLicencia();
    }

    // -	Una implementación entre la clase piloto y la interface Volador
    @Override
    public void volar() {
        System.out.println("El piloto se encuentra volando");
    }
}
