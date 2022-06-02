package OOP_Abstract;

public class Persoana_Somer_Abstract extends Persoana_Abstract {
    private String Nume;
    private String Prenume;
    private String Meserie;

    public Persoana_Somer_Abstract(String nume, String prenume, String meserie) {
        Nume = nume;
        Prenume = prenume;
        Meserie = meserie;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public void setPrenume(String prenume) {
        Prenume = prenume;
    }

    public String getMeserie() {
        return Meserie;
    }

    public void setMeserie(String meserie) {
        Meserie = meserie;
    }

    @Override
    void munceste() {

    }

    @Override
    void primesteSalariu() {

    }

    @Override
    void invata() {

    }

    @Override
    void primesteBursa() {

    }

    @Override
    void someaza() {

    }

    @Override
    void primesteAjutor() {
        verificaVarsta(5);

    }
}
