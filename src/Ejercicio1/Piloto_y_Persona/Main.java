package Ejercicio1.Piloto_y_Persona;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Piloto> listaPilotos = new ArrayList<>();
        Piloto piloto1 = new Piloto(12345678, 37, "Juan", 5000, 12345);
        Piloto piloto2 = new Piloto(87654321, 30, "Maria", 1750, 54321);


        piloto1.agregarPiloto(listaPilotos, piloto1);
        piloto2.agregarPiloto(listaPilotos, piloto2);

        System.out.println("Lista de Pilotos:");
        for (Piloto piloto : listaPilotos) {
            System.out.println(piloto);
            //interfaz
            piloto.volar();
        }
    }
}