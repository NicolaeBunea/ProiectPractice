package OOP_Incapsulare;

import org.junit.Test;

public class Masina_Test {

    @Test
    public void incapsulareTest(){
        Audi audiA6= new Audi("Audi", "A6", 60000);
        System.out.println(audiA6.getPret());
        audiA6.setModel("A3");
        System.out.println(audiA6.getModel());
        audiA6.cumparaMasina();
        audiA6.afiseazaMasini();
        audiA6.afiseazaMasini("Audi");
        audiA6.afiseazaMasini("Audi", 2020);

        Jaguar jaguarNou=new Jaguar("Jaguar","XF", 30000);
        jaguarNou.cumparaMasina();

    }

}
