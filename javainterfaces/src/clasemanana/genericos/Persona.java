package clasemanana.genericos;

public class Persona implements Comparable<Persona> {
    private int dni;
    private String nombre;

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Persona p) {

        if(this.dni < p.dni){
            return -1;
        } else if (this.dni == p.dni){
            return 0;
        } else {
            return 1;
        }
        //De menor DNI a Mayor DNI
//        return this.dni - p.getDni();
    }
}
