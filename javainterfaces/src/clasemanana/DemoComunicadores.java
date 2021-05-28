package clasemanana;

public class DemoComunicadores {

    public static void main(String[] args) {

        Comunicador c = ComunicadorFactory.crearInstancia();
        c.enviarmensaje("Hola soy pablo");

        Comunicador c1 = ComunicadorFactory.crearInstancia();
        Comunicador c2 = ComunicadorFactory.crearInstancia();
        Comunicador c3 = ComunicadorFactory.crearInstancia();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
