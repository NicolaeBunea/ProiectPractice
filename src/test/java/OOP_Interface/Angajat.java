package OOP_Interface;

public interface Angajat {
    //Interfata contine doar metode abstracte(se defineste tipul metodei fara contina body)
    //Interfata se recunoaste dupa cuvantul "Interface"
    //Poate sa contina variabile
    //Interfata nu se mosteneste ci se implementeaza
    //Clasa care implementeaza interfata trebuie sa implementeze toate metodele interfetei
    //O clasa poate sa implementeze mai multe interfete
    //O clasa abstracta poate sa implementeze o interfata
    //O interfata nu contine un constructor=> nu putem declara obiecte


    void munceste();
    void primesteSalariu();

}
