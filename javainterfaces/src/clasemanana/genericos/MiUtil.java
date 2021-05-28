package clasemanana.genericos;

public class MiUtil {
    public static <T extends Comparable<T>> void ordenar(T arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length-1 ; j++){
//                if( arr[j] > arr[j + 1])
                if(arr[j].compareTo(arr[j+1])>0){
                    T aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }
}
