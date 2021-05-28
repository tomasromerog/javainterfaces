package clasemanana.genericos;

public class DemoOrdenar {
    public static void main(String[] args) {

        Integer arr[] = {111,24,6,7,87,95};
        MiUtil.ordenar(arr);

        for(int x: arr){
            System.out.println(x);
        }

        String arr2[] = {"Pablo" , "Juan" , "Alberto"};
        MiUtil.ordenar(arr2);

        for(String y: arr2){
            System.out.println(y);
        }

        System.out.println("==============");

        Persona[] arr3 = {new Persona(10, "Pedro")
                ,new Persona (20, "Juan")
                ,new Persona (50, "Tomas")
                ,new Persona (80, "Valentina")
                ,new Persona (40, "Mili")};

        MiUtil.ordenar(arr3);

        for(Persona w: arr3){
            System.out.println(w);
        }
    }
}
