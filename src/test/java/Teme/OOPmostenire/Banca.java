package Teme.OOPmostenire;

public class Banca {

    public String nume;
    public String prenume;

    public Boolean statut;

    public Banca(String nume, String prenume, Boolean statut) {
        this.nume = nume;
        this.prenume = prenume;
        this.statut = statut;
    }

    public void detaliiClient(){
        System.out.println("Numele clientului este: "+nume);
        System.out.println("Prenumele clientului este: "+prenume);
        System.out.println("Este persoana fizica? "+statut);
    }
}
