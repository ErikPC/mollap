package edu.poniperro.intercepting.clients;

import edu.poniperro.intercepting.administrador.ProgramadorTasques;

public class Mollapp implements Client {

    private ProgramadorTasques programador;

    public Mollapp() {
    };

    public void setProgramadorTasques(ProgramadorTasques programador) {
        this.programador = programador;
    }

    public void enviarPeticio(String nombre) {
        this.programador.executarTasques(nombre);
    }
}
