package edu.poniperro;

import edu.poniperro.intercepting.administrador.ProgramadorTasques;
import edu.poniperro.intercepting.clients.Mollapp;
import edu.poniperro.intercepting.filtres.Autenticacio;
import edu.poniperro.intercepting.filtres.Autoritzacio;
import edu.poniperro.intercepting.targets.Vehiculo;

public final class App {
    public static void main(String[] args) {

        /**
         * Configuració del programador de tasques
         * del sistema amb el tipus de target triat:
         * des de vehicles a qualsevol cosa que admiteix
         * la recepció d'un missatge.
         */
        ProgramadorTasques programadorTasques = new ProgramadorTasques(new Vehiculo());

        /**
         * Afegir al sistema les tasques que volem que el sistema
         * executi al rebre la petició del client.
         */
        programadorTasques.setTasca(new Autenticacio());
        programadorTasques.setTasca(new Autoritzacio());

        /**
         * Configuració de l'app client per a que
         * executi les tasques programades i
         * enviï el misstage al sistema.
         */
        Mollapp mollapp = new Mollapp();
        mollapp.setProgramadorTasques(programadorTasques);
        mollapp.enviarPeticio("Francesc");
    }
}
