package Teme.OOPmostenire.Goluri;

public class Jucator {

    public String Nume;
    public String Pozitie;
    public Integer nrTricou;
    public Double Inaltime;

    public Jucator(String Nume, String Pozitie, Integer nrTricou, Double Inaltime) {
        this.Nume = Nume;
        this.Pozitie = Pozitie;
        this.nrTricou = nrTricou;
        this.Inaltime = Inaltime;
    }

    public void infoJucator(){
        System.out.println("Numele jucatorului este: " +Nume);
        System.out.println("El joaca: "+Pozitie);
        System.out.println("Numarul de pe tricou este: "+nrTricou);
        System.out.println("Inaltimea lui este de: "+Inaltime);
    }

    public void modalitateSut(){
        System.out.println("Sut, si GOOOL!");
    }



}
