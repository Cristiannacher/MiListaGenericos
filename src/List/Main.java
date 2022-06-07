package List;

import Exceptions.ObjectNotfoundException;

public class Main {
    public static void main(String[] args) throws ObjectNotfoundException {

        String palabra = "Hola";
        String palabra2 = "aroz";
     

        MiLista<String> miLista = new MiLista<>();

        miLista.insert(palabra);
        miLista.print();

        miLista.insert(palabra2);
        miLista.print();

        System.out.println(miLista.isEmpty());
        miLista.remove(palabra);
        miLista.print();


        System.out.println(miLista.getObjectAtPosition(2));
        System.out.println(miLista.getFirstElemnet());
        System.out.println(miLista.getLastElement());


    }

}
