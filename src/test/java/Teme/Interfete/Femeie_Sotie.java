package Teme.Interfete;

public class Femeie_Sotie extends Femeie_Interfata implements F_Sotie{
    public Femeie_Sotie(String nume, String prenume, Integer varsta, String ocupatie) {
        super(nume, prenume, varsta, ocupatie);
    }

    @Override
    public void curatenie() {
        System.out.println("Sotia "+getNume()+" "+getPrenume()+" cu varsta: "+getVarsta()+" de ani, face curatenie");
    }

    @Override
    public void spala() {
        System.out.println("Sotia "+getNume()+" "+getPrenume()+" cu varsta: "+getVarsta()+" de ani, spala");

    }
}
