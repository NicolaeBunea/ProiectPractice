package OOP_Interface;

public class Persoana_Angajat extends Persoana_Interface implements Angajat{

    public Persoana_Angajat(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    //Concept "solid"


    @Override
    public void munceste() {
        System.out.println("Angajatul "+getNume()+" "+getPrenume()+" "+" munceste");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul "+getNume()+" "+getPrenume()+" "+" primeste salariu");

    }
}
