package OOP_Interface;

public class Persoana_Somer extends Persoana_Interface implements Somer{

    public Persoana_Somer(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void someaza() {
        System.out.println("Somerul "+getNume()+" "+getPrenume()+" "+" someaza");
    }

    @Override
    public void ajutorSocial() {
        System.out.println("Somerul "+getNume()+" "+getPrenume()+" "+" primeste ajutor social");

    }
}
