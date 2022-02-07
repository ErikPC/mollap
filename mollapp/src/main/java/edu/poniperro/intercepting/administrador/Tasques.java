package edu.poniperro.intercepting.administrador;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.intercepting.filtres.Filtre;
import edu.poniperro.intercepting.targets.Target;

public class Tasques {

    private Target target;
    private List<Filtre> tasques;

    public Tasques() {
        this.tasques = new ArrayList<Filtre>();
    };

    public List<Filtre> getTasques() {
        return this.tasques;
    }

    public Target getTarget() {
        return this.target;
    }

    public void afegirTasca(Filtre tasques) {
        getTasques().add(tasques);
    }

    public void execucio(String nombre) {
        getTasques().stream().forEach(f -> f.execucio(nombre));
        getTarget().execucio(nombre);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
