package ejercmanananuevo.ejercmanana;

public class Persona implements Precedable<Persona> {
    private String nombre;
    private int dni;
    private CriterioDeComparacion criterioDeComparacion;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona(String nombre, int dni, CriterioDeComparacion criterioDeComparacion) {
        this.nombre = nombre;
        this.dni = dni;
        this.criterioDeComparacion = criterioDeComparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public int precedeA(Persona persona) {

        return this.criterioDeComparacion.comparar(persona, this);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }
}
