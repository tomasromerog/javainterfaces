package clasetarde;

import java.util.Comparator;

public class PersonaComparatorImpleDNIDesc implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getDni() - o2.getDni();
    }
}
