package edu.poniperro.intercepting.administrador;

import edu.poniperro.intercepting.filtres.Filtre;
import edu.poniperro.intercepting.targets.Target;

public class ProgramadorTasques {
    private Tasques tasques;

    public ProgramadorTasques(Target target) {
        this.tasques = new Tasques();
        this.tasques.setTarget(target);
    }

    public Tasques getTasques() {
        return this.tasques;
    }

    public void setTasca(Filtre filtre) {
        this.tasques.afegirTasca(filtre);
    }

    public void executarTasques(String nombre) {
        this.tasques.execucio(nombre);
    }
}
