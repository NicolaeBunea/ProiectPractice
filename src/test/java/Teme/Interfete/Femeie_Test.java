package Teme.Interfete;

import org.junit.Test;

public class Femeie_Test {

    @Test
    public void metodaFemeie(){

        //Femeie mama
        Femeie_Mama femeie_mama= new Femeie_Mama("Angela","Miruna", 35,"casnica");
        femeie_mama.gateste();
        femeie_mama.areGrijaCopil();
        System.out.println("");

        //Femeie Sotie
        Femeie_Sotie femeie_sotie= new Femeie_Sotie("Angela","Miruna", 35,"casnica");
        femeie_sotie.spala();
        femeie_sotie.curatenie();
        System.out.println("");

        //Femeie Angajat
        Femeie_Angajat femeie_angajat=new Femeie_Angajat("Angela","Miruna", 35,"casnica");
        femeie_angajat.munceste();
        femeie_angajat.iaSalariu();
        System.out.println("");

        //Femeia Mama Sotie Angajat
        Femeie_Mama_Sotie_Angajat femeie_mama_sotie_angajat=new Femeie_Mama_Sotie_Angajat("Angela","Miruna", 35,"casnica");
        femeie_mama_sotie_angajat.gateste();
        femeie_mama_sotie_angajat.areGrijaCopil();
        femeie_mama_sotie_angajat.curatenie();
        femeie_mama_sotie_angajat.spala();
        femeie_mama_sotie_angajat.munceste();
        femeie_mama_sotie_angajat.iaSalariu();

    }
}
