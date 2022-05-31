package OOP_Incapsulare;

public class Masina {

    //Incapsulare= conceptul prin care tinem departe de exterior
    //valorile variabilelor
    //Private= acces control- care blocheaza valorile variabilelor sa
    //fie vazute inafara clasei in care ai declarat-o
    //Ca sa vedem/modificam valorile folosim conceptul de "get" si "set"



    private String brand;
    private String model;
    private Integer pret;

    //Polimorfism= Dinamic si static
    //Polimorfismul dinamic= intr-o ierarhie de clase obtinute prin mostenire o metoda
    //poate avea implementari diferite
    //Polimorfismul static= mai multe metode cu acelasi nume se pot diferentia prin numarul de
    //parametrii si tipul parametrilor
    //Polimorfimul dinamic= override
    //Polimorfimsul static= overload
    //Polimorfismul static nu se poate aplica la metodele cu return



    public Masina(String brand, String model, Integer pret) {
        this.brand = brand;
        this.model = model;
        this.pret = pret;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getPret() {
        return pret;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //Definim o metoda pe care o vom suprascrie

    public void cumparaMasina(){
        System.out.println("Vreau sa cumpar o masina: ");
    }



}
