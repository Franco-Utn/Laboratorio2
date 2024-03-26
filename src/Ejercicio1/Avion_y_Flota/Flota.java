package Ejercicio1.Avion_y_Flota;

public class Flota extends Avion {
    private int cantidad;
    private String tipos;

    public Flota(String modelo, int motores, int ruedas, int cantidad, String tipos) {
        super(modelo, motores, ruedas);
        this.cantidad = cantidad;
        this.tipos = tipos;
    }
    public Flota(){

    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    @Override
    public String toString() {
        return "Cantidad de tripulantes: " + cantidad + ", Rangos de tripulantes: " + tipos;
    }
}