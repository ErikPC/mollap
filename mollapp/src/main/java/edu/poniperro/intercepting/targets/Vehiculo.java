package edu.poniperro.intercepting.targets;

public class Vehiculo implements Target {

    public Vehiculo() {
    };

    public void execucio(String nombre) {
        System.out.println("Puerta abierta " + nombre + "!");
    }
}
