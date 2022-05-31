package OOP_Interface;

public class Persoana_Student_Somer extends Persoana_Interface implements Student,Somer{
    public Persoana_Student_Somer(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void someaza() {
        System.out.println("Somerul/student "+getNume()+" "+getPrenume()+" "+" someaza");
    }

    @Override
    public void ajutorSocial() {
        System.out.println("Somerul/studentul "+getNume()+" "+getPrenume()+" "+" primeste ajutor social");

    }

    @Override
    public void invata() {
        System.out.println("Somerul/studentul "+getNume()+" "+getPrenume()+" "+" invata");

    }

    @Override
    public void primesteBursa() {
        System.out.println("Somerul/studentul "+getNume()+" "+getPrenume()+" "+" primeste bursa");

    }
}
