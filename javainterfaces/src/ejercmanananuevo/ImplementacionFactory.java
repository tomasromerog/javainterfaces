package ejercmanananuevo;

import java.util.Comparator;

public class ImplementacionFactory implements ComparatorFactory{

    @Override
    public Comparator crearComparador() {
        return new DniComparator();
    }
}
