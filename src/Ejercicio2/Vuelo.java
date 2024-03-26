package Ejercicio2;

public class Vuelo {

    private int idVuelo;
    private String origen;
    private String destino;
    private Avion avion;
    private Piloto piloto;

    // Se elimina la relación con Pasajero

    public Vuelo(int idVuelo, String origen, String destino, Avion avion, Piloto piloto) {
        this.idVuelo = idVuelo;
        this.origen = origen;
        this.destino = destino;

        this.avion = avion;
        this.piloto = piloto;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }


    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "idVuelo=" + idVuelo +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", avion=" + avion +
                ", piloto=" + piloto +
                '}';
    }
}
