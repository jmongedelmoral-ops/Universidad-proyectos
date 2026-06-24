package empleados;

public abstract class Persona {
    protected String nombre;
    protected String RFC;

    public Persona(String nombre, String RFC) {
        this.nombre = nombre;
        this.RFC = RFC;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRFC() { return RFC; }
    public void setRFC(String rFC) { RFC = rFC; }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", RFC=" + RFC;
    }
}