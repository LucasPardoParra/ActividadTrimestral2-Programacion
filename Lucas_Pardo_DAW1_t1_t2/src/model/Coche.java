package model;

import java.util.ArrayList;
import java.util.List;

public class Coche {
    // Atributos
    private String piloto;
    private String marca;
    private String modelo;
    private int cv;
    private int cc;
    private String matricula;
    private double velocidad;
    private List<Double> listaVelocidades; // Lista de velocidades utilizadas para calcular la velocidad media
    private double kmRecorridos;

    // Constructor
    public Coche() {
    }

    public Coche(String piloto, String marca, String modelo, int cv, int cc, String matricula, List<Double> listaVelocidades) {
        this.piloto = piloto;
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.cc = cc;
        this.matricula = matricula;
        this.listaVelocidades = new ArrayList<>();
    }

    // Getters y setters
    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    // Metodo acelerar
    public void acelerar(double velocidadDeseada) {
        if (cv < 100) {
            velocidad = Math.random() * velocidadDeseada;
        } else {
            velocidad = (Math.random() * velocidadDeseada) + 10;
        }

        // Asegurar que el incremento mínimo sea 10 km/h
        if (velocidad < 10) {
            velocidad = 10;
        }

        // Guardar la velocidad del coche por cada vez que acelera
        listaVelocidades.add(velocidad);

        // Aumentar los kilómetros recorridos en un 50% del incremento de velocidad
        kmRecorridos += velocidad * 0.5;
    }

    // Metodo mostrarDatos
    public void mostrarDatosPreCarrera() {
        System.out.println("Piloto: " + piloto);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("CV: " + cv);
        System.out.println("CC: " + cc);
        System.out.println("Matrícula: " + matricula);
    }

    public void mostrarDatosPostCarrera() {
        System.out.println("Piloto: " + piloto);
        System.out.println("Velocidad media: " + calcularVelocidadMedia());
        System.out.println("Km recorridos: " + kmRecorridos);
    }

    public double calcularVelocidadMedia() {
        double sumaVelocidades = 0;
        double velocidadMedia = 0;
        for (double velocidad : listaVelocidades) {
            sumaVelocidades = sumaVelocidades + velocidad;
        }
        return velocidadMedia = sumaVelocidades / listaVelocidades.size();
    }
}