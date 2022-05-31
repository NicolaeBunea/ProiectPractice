package OOP_Interface;

public class Persoana_Student_Angajat extends Persoana_Interface implements Student,Angajat {

    public Persoana_Student_Angajat(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void munceste() {
        System.out.println("Studentul/angajatul: "+getNume()+" "+getPrenume()+" munceste");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Studentul/angajatul: "+getNume()+" "+getPrenume()+" primeste salariu");

    }

    @Override
    public void invata() {
        System.out.println("Studentul/angajatul: "+getNume()+" "+getPrenume()+" invata");

    }

    @Override
    public void primesteBursa() {
        System.out.println("Studentul/angajatul: "+getNume()+" "+getPrenume()+" primeste bursa");

    }
}
