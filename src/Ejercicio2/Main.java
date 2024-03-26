package Ejercicio2;

public class Main {

    public static void main(String[] args) {

        // Crear personas
        Persona juan = new Persona(1, "Juan", "Perez");
        Persona maria = new Persona(2, "Maria", "Lopez");

        // Crear piloto
        Piloto piloto = new Piloto(3, "Pedro", "Gomez", "Piloto comercial", 10000);

        // Crear avión
        Avion avion = new Avion(1, "Boeing 737", "XYZ789", 180);

        // Crear vuelo
        Vuelo vuelo = new Vuelo(1, "Buenos Aires", "Madrid", avion, piloto);

        // Imprimir información
        System.out.println("Persona 1:");
        System.out.println(juan.toString());

        System.out.println("\nPiloto:");
        System.out.println(piloto.toString());

        System.out.println("\nAvión:");
        System.out.println(avion.toString());

        System.out.println("\nVuelo:");
        System.out.println(vuelo.toString());

        // Ejemplo de uso del método volar()
        piloto.volar(); // El piloto vuela el avión (asociación implícita)
    }
}
