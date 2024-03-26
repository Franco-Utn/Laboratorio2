package Ejercicio1.Reserva_Y_Vuelo;

import java.util.Date;

// Definición de la clase Reserva
class Reserva {
    private String aeropuerto;
    private int cantidadBoletos;
    private Date horarioSalida;
    private int idVuelo; // Identificador único del vuelo asociado

    // Constructor de la clase Reserva
    public Reserva(String aeropuerto, int cantidadBoletos, Date horarioSalida, int idVuelo) {
        this.aeropuerto = aeropuerto;
        this.cantidadBoletos = cantidadBoletos;
        this.horarioSalida = horarioSalida;
        this.idVuelo = idVuelo;
    }

    // Getters y setters
    public String getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }

    public Date getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(Date horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }
}