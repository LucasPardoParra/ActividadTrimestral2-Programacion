package controller;

import model.Coche;

import java.util.Scanner;

public class Carrera {
    Scanner scanner = new Scanner(System.in);
    Coche cocheDeportivo = new Coche("Fernando Alonso", "Ferrari", "LaFerrari", 960, 6200, "FER-777", null);
    Coche cocheFamiliar = new Coche("Carlos Sainz", "Renault", "Twingo", 90, 1600, "REN-123", null);
    Coche ganador = null;
    double kmTotales = 230;
    int numVueltas = 5;


    public Carrera() {
    }

    public Carrera(Coche cocheDeportivo, Coche cocheFamiliar, double kmTotales, int numVueltas) {
        this.cocheDeportivo = cocheDeportivo;
        this.cocheFamiliar = cocheFamiliar;
        this.kmTotales = kmTotales;
        this.numVueltas = numVueltas;
    }

    public void iniciarCarrera() {
        System.out.println("\n¡Bienvenidos todos a la 'Carrera del Siglo'! Hoy tenemos a dos grandes pilotos y sus coches:");
        System.out.println("El primer aspirante a llevarse el título es " + cocheDeportivo.getPiloto() + ", con su Ferrari LaFerrari.");
        System.out.println("El segundo competidor de la final de hoy es " + cocheFamiliar.getPiloto() + ", con su Renault Twingo.");

        System.out.println("\n¿Deseas ver las características de los coches antes de comenzar? (S/N)");
        String opcion1 = scanner.nextLine();
        do {
            if (opcion1.equalsIgnoreCase("S")) {
                System.out.println();
                cocheDeportivo.mostrarDatosPreCarrera();
                System.out.println();
                cocheFamiliar.mostrarDatosPreCarrera();
                System.out.println();
            } else if (opcion1.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.println("\nOpción no válida. Por favor, introduce 'S' o 'N'.");
            }
        } while (!opcion1.equalsIgnoreCase("S") && !opcion1.equalsIgnoreCase("N"));

        System.out.println("\nEl circuito de hoy es el de Spa-Francorchamps, en Bélgica");
        System.out.println("Los pilotos tendrán que recorrer " + kmTotales + " km en " + numVueltas + " vueltas.");

        System.out.println("¡Los pilotos ya están en la parrilla de salida! ¿Estás listo para comenzar? (S/N)");
        String opcion2 = scanner.nextLine();
        do {
            if (opcion2.equalsIgnoreCase("S")) {
                System.out.println("\n¡Que comience la carrera!");
            } else if (opcion2.equalsIgnoreCase("N")) {
                System.out.println("\n¡Imposible, la carrera tiene que comenzar ya! ¡Allá vamos!");
            } else {
                System.out.println("\nOpción no válida. Por favor, introduce 'S' o 'N'.");
            }
        } while (!opcion1.equalsIgnoreCase("S") && !opcion1.equalsIgnoreCase("N"));

        compararCoches();
        System.out.println("\n¡La carrera ha terminado! Se han dado " + numVueltas + " vueltas.");
        System.out.println("El ganador ha sido el coche con matrícula " + ganador.getMatricula());
        if (ganador == cocheDeportivo) {
            System.out.println("¡El público enloquece! ¡" + cocheDeportivo.getPiloto() + " ha hecho historia!");
        } else {
            System.out.println("¡El público enloquece! ¡" + cocheFamiliar.getPiloto() + " ha hecho historia!");
        }

        System.out.println("\nAhora veamos un desglose del rendimiento de los coches:");
        cocheDeportivo.mostrarDatosPostCarrera();
        System.out.println();
        cocheFamiliar.mostrarDatosPostCarrera();
        System.out.println();

        System.out.println("¡Gracias por asistir a la 'Carrera del Siglo'! ¡Hasta la próxima!");
    }

    // Metodo para acelerar los coches
    public void acelerarCoches() {
        for (int i = 0; i < numVueltas; i++) {
            cocheDeportivo.acelerar(300);
            cocheFamiliar.acelerar(150);
        }
    }

    // Metodo para comparar los coches y determinar el ganador
    // Si ninguno ha ganado, se siguen dando vueltas hasta que
    // uno de los dos alcance los km totales
    public void compararCoches() {
        while (cocheDeportivo.getKmRecorridos() < kmTotales && cocheFamiliar.getKmRecorridos() < kmTotales) {
            acelerarCoches();
            numVueltas++;
        }
        if (cocheDeportivo.getKmRecorridos() >= kmTotales) {
            ganador = cocheDeportivo;
        } else {
            ganador = cocheFamiliar;
        }
    }
}