package OOP_Interface;

public class Persoana_Somer_Angajat_Student extends Persoana_Interface implements Angajat,Somer,Student{
    public Persoana_Somer_Angajat_Student(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void munceste() {
        System.out.println("Somerul/studentul/Angajatul "+getNume()+" "+getPrenume()+" "+" munceste");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Somerul/studentul/Angajatul "+getNume()+" "+getPrenume()+" "+" primeste salariu");

    }

    @Override
    public void someaza() {
        System.out.println("Somerul/studentul/Angajatul "+getNume()+" "+getPrenume()+" "+" someaza");

    }

    @Override
    public void ajutorSocial() {
        System.out.println("Somerul/studentul/Angajatul "+getNume()+" "+getPrenume()+" "+" primeste ajutor social");

    }

    @Override
    public void invata() {
        System.out.println("Somerul/studentul/Angajatul "+getNume()+" "+getPrenume()+" "+" invata");

    }

    @Override
    public void primesteBursa() {
        System.out.println("Somerul/studentul/Angajatul "+getNume()+" "+getPrenume()+" "+" primeste bursa");

    }
}
