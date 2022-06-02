package Teme.Interfete;

public class Femeie_Angajat extends Femeie_Interfata implements F_Angajat{

    public Femeie_Angajat(String nume, String prenume, Integer varsta, String ocupatie) {
        super(nume, prenume, varsta, ocupatie);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul "+getNume()+" "+getPrenume()+" cu varsta: "+getVarsta()+" de ani, munceste");
    }

    @Override
    public void iaSalariu() {
        System.out.println("Angajatul "+getNume()+" "+getPrenume()+" cu varsta: "+getVarsta()+" de ani, ia salariu");

    }
}
