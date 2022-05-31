package OOP_Interface;

public class Persoana_Student extends Persoana_Interface implements Student{

    public Persoana_Student(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void invata() {
        System.out.println("Studentul: "+getNume()+" "+getPrenume()+" invata");
    }

    @Override
    public void primesteBursa() {
        System.out.println("Studentul: "+getNume()+" "+getPrenume()+" primeste bursa");

    }
}
