package Ejercicio1.Avion_y_Flota;

public class Avion {
    private String modelo;
    private int motores;
    private int ruedas;

    public Avion(String modelo, int motores, int ruedas) {
        this.modelo = modelo;
        this.motores = motores;
        this.ruedas = ruedas;
    }

    public Avion() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Motores: " + motores + ", Ruedas: " + ruedas;
    }
}
