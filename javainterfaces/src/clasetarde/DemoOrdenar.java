package clasetarde;

public class DemoOrdenar {
    public static void main(String[] args) {

        Persona p1 = new Persona("Tomas" , 12);
        Persona p2 = new Persona("Javier" , 14);
        Persona p3 = new Persona("Pedro" , 17);
        Persona p4 = new Persona("Valentina" , 11);

        Persona[] arr = {p1, p2,p3,p4};

        SortUtil.ordenar(arr , new PersonaComparatorImpleDNIDesc());

        for(Persona ar: arr){
            System.out.println(ar.toString());
        }

        SortUtil.ordenar(arr , new PersonaComparatorImpleNombreDesc());

        for(Persona ar: arr){
            System.out.println(ar.toString());
        }
    }
}
