// Definición de la clase Vuelo
package Ejercicio1.Reserva_Y_Vuelo;

class Vuelo {
    private int idVuelo;
    private int alturaMaxima;
    private int velocidadMaxima;

    // Constructor de la clase Vuelo
    public Vuelo(int idVuelo, int alturaMaxima, int velocidadMaxima) {
        this.idVuelo = idVuelo;
        this.alturaMaxima = alturaMaxima;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Getters y setters
    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}
