

package tareavirtual1_pr2;



public class Persona {
    private String nombre;
    private String cedula;
    private String fechaNacimiento;
    private String direccionParticular;

    public Persona(String nombre, String cedula, String fechaNacimiento, String direccionParticular) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.direccionParticular = direccionParticular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccionParticular() {
        return direccionParticular;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCédula: " + cedula + "\nFecha de Nacimiento: " + fechaNacimiento
                + "\nDirección Particular: " + direccionParticular;
    }
}