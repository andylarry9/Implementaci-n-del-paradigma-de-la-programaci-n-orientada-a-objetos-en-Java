
package tareavirtual1_pr2;


public class Docente extends Persona {
  private int anosExperiencia;

    public Docente(String nombre, String cedula, String fechaNacimiento, String direccionParticular,
            int anosExperiencia) {
        super(nombre, cedula, fechaNacimiento, direccionParticular);
        this.anosExperiencia = anosExperiencia;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAños de Experiencia: " + anosExperiencia;
    }
}
