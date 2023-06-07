package Metodos;
public class Avion {
    private String modelo;
    private int capacidadPasajeros;
    private double velocidadMaxima;
    private boolean enVuelo;
    
    // Constructor
    public Avion(String modelo, int capacidadPasajeros, double velocidadMaxima) {
        this.modelo = modelo;
        this.capacidadPasajeros = capacidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.enVuelo = false;
    }
    
    // Métodos getter y setter para los atributos
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
    
    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
    
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public boolean isEnVuelo() {
        return enVuelo;
    }
    
    // Métodos para controlar el estado del avión
    
    public void despegar() {
        if (!enVuelo) {
            enVuelo = true;
            System.out.println("El avión ha despegado.");
        } else {
            System.out.println("El avión ya está en vuelo.");
        }
    }
    
    public void aterrizar() {
        if (enVuelo) {
            enVuelo = false;
            System.out.println("El avión ha aterrizado.");
        } else {
            System.out.println("El avión ya está en tierra.");
        }
    }
    
    public void mostrarInformacion() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        
        if (enVuelo) {
            System.out.println("El avión está en vuelo.");
        } else {
            System.out.println("El avión está en tierra.");
        }
    }
}
