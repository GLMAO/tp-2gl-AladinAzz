package com.polytech.tp;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {
    private List<ICours> listeCours = new ArrayList<>();
    final ArrayList<Observer> listeners= new ArrayList<>();



    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        System.out.println("Nouveau cours ajouté : " + cours.getDescription());
        // TODO: C'est ici qu'il faudrait notifier les étudiants (Observer pattern)
        this.notify();
    }

    public void modifierCours(ICours cours, String message) {
        // Logique de modification...
        System.out.println("Cours modifié : " + message);
        // TODO: Notifier les observateurs ici aussi
        this.notify();
    }

    public void setChangement(String string) {
        // TODO Auto-generated method stub


        this.notifyObservers(string);

    }

    @Override
    public void attach(Observer o) {
        listeners.add(o);
    }

    @Override
    public void detach(Observer o) {
        listeners.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o :this.listeners){
            o.update(message);
        }
    }
}