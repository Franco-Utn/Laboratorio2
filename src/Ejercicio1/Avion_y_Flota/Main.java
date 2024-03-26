package Ejercicio1.Avion_y_Flota;

public class Main {
    public static void main(String[] args) {
        Avion a1 = new Avion("Boeing 747", 4, 18);
        System.out.println("Detalles del avión:");
        System.out.println(a1.toString());

        Flota f1 = new Flota("Airbus A320", 2, 6, 8, "Pilotos y Copilotos");
        System.out.println("\nDetalles de la flota:");
        System.out.println(f1.toString());
    }
}