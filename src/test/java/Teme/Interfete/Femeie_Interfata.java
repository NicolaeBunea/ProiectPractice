package Teme.Interfete;

public class Femeie_Interfata {

    private String nume;
    private String prenume;
    private Integer varsta;
    private String ocupatie;

    public Femeie_Interfata(String nume, String prenume, Integer varsta, String ocupatie) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.ocupatie = ocupatie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }
}
