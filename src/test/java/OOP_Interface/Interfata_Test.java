package OOP_Interface;

import org.junit.Test;

public class Interfata_Test {

    @Test
    public void metodaInterfata(){

        //Persoana angajat
        Persoana_Angajat persoana_angajat=new Persoana_Angajat("Gyo", "Gyuri","Sudor");
        persoana_angajat.munceste();
        persoana_angajat.primesteSalariu();

        //Persoana student

        Persoana_Student persoana_student= new Persoana_Student("Ionci","Baci","Student");
        persoana_student.invata();
        persoana_student.primesteBursa();

        //Persoana angajat- student

        Persoana_Student_Angajat persoana_student_angajat= new Persoana_Student_Angajat("Ion", "Ionel","Student/Angajat");
        persoana_student_angajat.invata();
        persoana_student_angajat.munceste();
        persoana_student_angajat.primesteSalariu();
        persoana_student_angajat.primesteBursa();
    }

    //persoana student

}
