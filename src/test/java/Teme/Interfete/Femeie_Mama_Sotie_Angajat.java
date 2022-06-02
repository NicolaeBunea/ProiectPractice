package Teme.Interfete;

public class Femeie_Mama_Sotie_Angajat extends Femeie_Interfata implements F_Mama,F_Sotie,F_Angajat{
    public Femeie_Mama_Sotie_Angajat(String nume, String prenume, Integer varsta, String ocupatie) {
        super(nume, prenume, varsta, ocupatie);
    }

    @Override
    public void munceste() {
        System.out.println("Mama/Sotia/Angajatul "+getNume()+" "+getPrenume()+" cu varsta: "+getVarsta()+" de ani, munceste");
    }

    @Override
    public void iaSalariu() {
        System.out.println("Mama/Sotia/Angajatul "+getNume()+" "+getPrenume()+" cu varsta: "+getVarsta()+" de ani, ia salariu");

    }

    @Override
    public void gateste() {
        System.out.println("Mama/Sotia/Angajatul "+getNume()+" "+getPrenume()+" cu varsta: "+getVarsta()+" de ani, gateste");

    }

    @Override
    public void areGrijaCopil() {
        System.out.println("Mama/Sotia/Angajatul "+getNume()+" "+getPrenume()+" cu varsta: "+getVarsta()+" de ani, are grija de copil");

    }

    @Override
    public void curatenie() {
        System.out.println("Mama/Sotia/Angajatul "+getNume()+" "+getPrenume()+" cu varsta: "+getVarsta()+" de ani, face curatenie");

    }

    @Override
    public void spala() {
        System.out.println("Mama/Sotia/Angajatul "+getNume()+" "+getPrenume()+" cu varsta: "+getVarsta()+" de ani, spala");

    }
}
