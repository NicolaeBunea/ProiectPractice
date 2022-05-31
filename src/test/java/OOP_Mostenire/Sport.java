package OOP_Mostenire;

public class Sport {

    public String nume;
    public String denumire;
    public Boolean esteEchipa;
    public Integer nrMembrii;


    public Sport(String nume, String denumire, Boolean esteEchipa, Integer nrMembrii) {
        this.nume = nume;
        this.denumire = denumire;
        this.esteEchipa = esteEchipa;
        this.nrMembrii = nrMembrii;
    }

    //OOP Mostenire= principiul pe baza caruia clasa parinte poate sa fie mostenita de n Clase copii.
    //Exemplu: casa bunicilor cu nepotii ( nepotii au acces la toate obiectele din casa si pot face ce vor cu ele)
    //In java putem mostenii o singura clasa.
    //In momentul in care clasa copil mosteneste clasa parinte trebuie sa apelam constructorul din clasa parinte

    public void infoSport(){
        System.out.println("Numele sportului este:"+nume);
        System.out.println("Ce fel de sport este: "+denumire);
        System.out.println("Este un sport de echipa? "+esteEchipa);
        System.out.println("Numarul de jucatori intr-o echipa: "+nrMembrii);

    }

}
