
package tareavirtual1_pr2;


public class Estudiante extends Persona {
 private String tituloMasAltoObtenido;

    public Estudiante(String nombre, String cedula, String fechaNacimiento, String direccionParticular,
            String tituloMasAltoObtenido) {
        super(nombre, cedula, fechaNacimiento, direccionParticular);
        this.tituloMasAltoObtenido = tituloMasAltoObtenido;
    }

    public String getTituloMasAltoObtenido() {
        return tituloMasAltoObtenido;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTítulo más alto obtenido: " + tituloMasAltoObtenido;
    }
}