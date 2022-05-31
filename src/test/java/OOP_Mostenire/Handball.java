package OOP_Mostenire;

import java.util.List;

public class Handball extends Sport{

    public Boolean capitan;
    public Integer nrEchipament;
    public List<String> reguli;


    public Handball(String nume, String denumire, Boolean esteEchipa, Integer nrMembrii, Boolean capitan, Integer nrEchipament, List<String> reguli) {
        super(nume, denumire, esteEchipa, nrMembrii);
        this.capitan= capitan;
        this.nrEchipament= nrEchipament;
        this.reguli= reguli;
    }
    public void infoHandball(){
        System.out.println("Informatiile despre handball sunt: ");
        System.out.println("Are echipa un capitan? "+ capitan);
        System.out.println("Numarul de echipamente ale echipei: "+nrEchipament);
        System.out.println("Regulile sportului sunt: "+reguli);

    }
}
