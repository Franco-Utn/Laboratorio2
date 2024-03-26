package Ejercicio1.Reserva_Y_Vuelo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso

        // Creamos instancias de vuelo
        Vuelo vuelo1 = new Vuelo(1, 10000, 800);
        Vuelo vuelo2 = new Vuelo(2, 12000, 900);

        // Creamos instancias de reserva asociadas a vuelos específicos
        Reserva reserva1 = new Reserva("Aeropuerto A", 2, new Date(), 1);
        Reserva reserva2 = new Reserva("Aeropuerto B", 3, new Date(), 2);

        // Accedemos a la información de la reserva y del vuelo asociado
        System.out.println("Reserva 1:");
        System.out.println("Aeropuerto: " + reserva1.getAeropuerto());
        System.out.println("Cantidad de Boletos: " + reserva1.getCantidadBoletos());
        System.out.println("Horario de Salida: " + reserva1.getHorarioSalida());
        System.out.println("ID de Vuelo: " + reserva1.getIdVuelo());
        System.out.println("Altura Máxima del Vuelo asociado: " + vuelo1.getAlturaMaxima());
        System.out.println("Velocidad Máxima del Vuelo asociado: " + vuelo1.getVelocidadMaxima());
    }
}