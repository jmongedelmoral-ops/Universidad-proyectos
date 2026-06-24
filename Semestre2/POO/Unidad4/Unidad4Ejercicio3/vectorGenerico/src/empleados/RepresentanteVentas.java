package empleados;

public class RepresentanteVentas extends Empleado {
    private int comision;

    public RepresentanteVentas(String nombre, String RFC, String turno, int noEmp, int comision) {
        super(nombre, RFC, turno, noEmp, 0);
        this.comision = comision;
    }

    public int getComision() { return comision; }
    public void setComision(int comision) { this.comision = comision; }

    @Override
    public String toString() {
        return super.toString() + ", comision=" + comision;
    }
}	

