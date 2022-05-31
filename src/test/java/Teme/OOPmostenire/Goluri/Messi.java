package Teme.OOPmostenire.Goluri;

public class Messi extends Jucator {

    public String modLovitura;
    public Integer metriiDistanta;
    public Boolean golSauNu;

    public Messi(String nume, String pozitie, Integer nrTricou, Double inaltime, String modLovitura,
                 Integer metriiDistanta, Boolean golSauNu){
        super(nume, pozitie, nrTricou, inaltime);
        this.modLovitura= modLovitura;
        this.metriiDistanta= metriiDistanta;
        this.golSauNu= golSauNu;
    }

    public void lovitura(){
        System.out.println(modLovitura+" pe poarta");
        System.out.println("Lovitura este de la: "+metriiDistanta+" metrii");
        System.out.println("Este gol? "+golSauNu);
    }

    public void booleanGol(){
        if (golSauNu){
            System.out.println("Ancara Mesii, Ancara Messi GOOOOOL!");
        }
        else {
            System.out.println("NUUU se poateee, cat de aproape!!");
        }
    }




}
