package edu.poniperro.intercepting.filtres;

public class Autenticacio implements Filtre {
    public Autenticacio() {
    };

    public void execucio(String nombre) {
        System.out.println("Autenticacio OK para " + nombre);
    }
}
