package ejercmanananuevo;

import java.util.Comparator;

public class MainEjercicio {
    public static void main(String[] args) {

        //Aca le digo que tipo de comparacion quiero que me ejecute
        Comparator<Persona> comparador = new DniComparator();

        Persona p1 = new Persona("Tomas" , 12, comparador);
        Persona p2 = new Persona("Javier" , 14, comparador);
        Persona p3 = new Persona("Pedro" , 17, comparador);
        Persona p4 = new Persona("Valentina" , 11, comparador);

        Persona[] arr = {p1, p2,p3,p4};

        SortUtil.ordenar(arr);

        for(Persona ar: arr){
            System.out.println(ar.toString());
        }

        System.out.println("========Celular==========");

        Celular c1 = new Celular("Pepe" , 123);
        Celular c2 = new Celular("Juli" , 223);
        Celular c3 = new Celular("Santi" , 523);
        Celular c4 = new Celular("Nica" , 73);

        Celular[] arr2 = {c1,c2,c3,c4};
        SortUtil.ordenar(arr2);

        for (Celular cr: arr2){
            System.out.println(cr.toString());
        }

        System.out.println("==========");

        Persona p5 = new Persona("Tomas" , 12);
        Persona p6 = new Persona("Javier" , 14);
        Persona p7 = new Persona("Pedro" , 17);
        Persona p8 = new Persona("Valentina" , 11);

        Persona[] arr4 = {p1, p2,p3,p4};

        SortUtil.ordenar(arr4);

        for(Persona ar: arr4){
            System.out.println(ar.toString());
        }
    }
}
