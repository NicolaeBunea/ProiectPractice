package Teme.OOPmostenire;

public class Client_1 extends Banca {

    public Integer PIN;
    public Integer CNP;

    public Client_1(String nume, String prenume, Boolean statut, Integer PIN, Integer CNP) {
        super(nume, prenume, statut);
        this.PIN=PIN;
        this.CNP=CNP;
    }
    public void infoClient_1(){
        System.out.println("PIN-ul este: "+PIN);
        System.out.println("CNP-il este: "+CNP);
    }

}
