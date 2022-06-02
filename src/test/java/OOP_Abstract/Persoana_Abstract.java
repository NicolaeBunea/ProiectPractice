package OOP_Abstract;

public abstract class Persoana_Abstract {

    //Abstractizare= conceptul pe baza caruia definim comportamentul unei clase
    //recunoastem o clasa abstracta dupa cuvantul "abstract"
    //principala diferenta intre o interfata si clasa abstracata (poate sa nu sa contina metode abstracte)
    //O clasa poate extinde o clasa abstracata
    //O clasa abstracta poate sa implementeze o interfata
    //Poti sa mostenesti o singura clasa abstracta
    //Clasa care mosteneste o clasa abstracta=> implementeaza toate metodele abstracte
    //Clasa abstracta poate sa contina un construcot => nu poti crea obiecte

    abstract void munceste();
    abstract void primesteSalariu();
    abstract void invata();
    abstract void primesteBursa();
    abstract void someaza();
    abstract void primesteAjutor();


    public void verificaVarsta(Integer varsta){
        if (varsta>=18){
            System.out.println("Persoana e majora");
        }
        else {
            System.out.println("Persoana e minora");
        }
    }

}
