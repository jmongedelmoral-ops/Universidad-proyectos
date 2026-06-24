package empleados;



public abstract class Empleado extends Persona {
    protected String turno;
    protected int noEmp;
    protected int sueldo;

    
    
    
    public Empleado(String nombre, String RFC, String turno, int noEmp, int Sueldo) {
        super(nombre, RFC);
        this.turno = turno;
        this.noEmp = noEmp;
        this.sueldo = sueldo;
    }
    
    public String getTurno() {
        return turno;
    }

    

    public void setTurno(String turno) {
        this.turno = turno;
    }



    public int getNoEmp() {
        return noEmp;
    }
    
    
    
    public void setNoEmp(int noEmp) {
        this.noEmp = noEmp;
    }
    
    
    public int getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
    @Override
    public String toString() {
        return "Empleado [turno=" + turno + ", noEmp=" + noEmp + ", sueldo=" + sueldo + "]";
    }
}
