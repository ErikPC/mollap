package edu.poniperro.intercepting.filtres;

public class Autoritzacio implements Filtre {
    public Autoritzacio() {
    };

    public void execucio(String nombre) {
        System.out.println("Autorizacion OK para " + nombre);
    }
}
