package com.polytech.tp;

public class CoursBuilder {
    // TODO: Implémenter le pattern Builder
    private String matiere=null;
    private String enseignant=null;
    private String salle=null;
    private String date=null;
    private String heureDebut=null;
    private boolean estOptionnel= false;
    private String niveau=null;
    private boolean necessiteProjecteur= false;


    Cours cour=null;
    
    public CoursBuilder setMatiere(String matiere) {
        this.matiere=matiere;
        return this; }
    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant=enseignant;
        return this; }
    public CoursBuilder setSalle(String salle) {
        this.salle=salle;
        return this; }
    public CoursBuilder setDate(String date){
        this.date=date;
        return this;
    }
    public CoursBuilder setHeureDebut(String heureDebut){
        this.heureDebut=heureDebut;
        return this;
    }
    public CoursBuilder setEstOptionnel(boolean estOptionnel){
        this.estOptionnel=estOptionnel;
        return this;
    }

    public CoursBuilder setNiveau(String niveau){
        this.niveau=niveau;
        return this;
    }
    public CoursBuilder setNecessiteProjecteur(boolean necessiteProjecteur){
        this.necessiteProjecteur=necessiteProjecteur;
        return this;
    }


    
    public Cours build() {

        this.cour=new Cours(this.matiere,this.enseignant,this.salle,this.date,this.heureDebut,this.estOptionnel,this.niveau,this.necessiteProjecteur);
        return this.cour;
    }
}