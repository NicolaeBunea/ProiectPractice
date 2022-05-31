package OOP_Mostenire;

import java.util.List;

public class Fotbal extends Sport {

    public Boolean capitan;
    public Integer nrEchipamente;
    public List<String> reguli;


    public Fotbal(String nume, String denumire, Boolean esteEchipa, Integer nrMembrii,
                  Boolean capitan, Integer nrEchipamente, List<String> reguli) {
        super(nume, denumire, esteEchipa, nrMembrii);
        this.capitan=capitan;
        this.nrEchipamente=nrEchipamente;
        this.reguli=reguli;

    }

    public void infoFotbal(){
        System.out.println("Informatiile despre fotbal sunt: ");
        System.out.println("Are echipa un capitan? "+ capitan);
        System.out.println("Numarul de echipamente ale echipei: "+nrEchipamente);
        System.out.println("Regulile sportului sunt: "+reguli);

    }



}
