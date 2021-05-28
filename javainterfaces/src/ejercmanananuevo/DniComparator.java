package ejercmanananuevo;

import java.util.Comparator;

public class DniComparator implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getDni() - o2.getDni();
    }
}
