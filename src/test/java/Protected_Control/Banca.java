package Protected_Control;

import Access_Control.Access_Control;

public class Banca extends Access_Control {

    public void incaOmetoda(){
        metodaProtected();
        metodaPublica();
    }
}
