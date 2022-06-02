package Teme.Interfete;

public class Femeie_Mama extends Femeie_Interfata implements F_Mama{
    public Femeie_Mama(String nume, String prenume, Integer varsta, String ocupatie) {
        super(nume, prenume, varsta, ocupatie);
    }

    @Override
    public void gateste() {
        System.out.println("Mama "+getNume()+" "+getPrenume()+" cu varsta: "+getVarsta()+" de ani, gateste");
    }

    @Override
    public void areGrijaCopil() {
        System.out.println("Mama "+getNume()+" "+getPrenume()+" cu varsta: "+getVarsta()+" de ani, are grija de copil");

    }
}
