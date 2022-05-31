package Teme.OOPmostenire.Goluri;

public class Ronaldinho extends Jucator{

    public Ronaldinho(String Nume, String Pozitie, Integer nrTricou, Double Inaltime) {
        super(Nume, Pozitie, nrTricou, Inaltime);
    }

    public void modalitateSut(){
        System.out.println("Lovitura libera");
        super.modalitateSut();
    }

    public void posibilitateExecutie(){
        System.out.println("Golurile se pot da din urmatoarele posibilitati: ");
    }
    public void posibilitateExecutie(String penalty){
        System.out.println("Cel mai lame: "+ penalty);
    }
    public void posibilitateExecutie(String penalty,Integer unspe){
        System.out.println("Lovitura de "+penalty+" se mai poate numi si "+unspe+" metrii");
    }









}
