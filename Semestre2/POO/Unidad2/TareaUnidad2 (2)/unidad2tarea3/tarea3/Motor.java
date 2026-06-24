package tarea3;
public class Motor {
    private int rpm = 0;
    private boolean encendido = false;

    public Motor() {
        this.rpm = 0;
        this.encendido = false;
    }

    public void cambiarRpm(int nuevaRpm) {
        if (this.encendido && this.rpm + nuevaRpm >= 0) {
            if(this.rpm + nuevaRpm > 10000) {
                System.out.println("No se pueden aumentar las RPM más allá de 10000. RPM actual: " + this.rpm);
                return;
            }
            this.rpm += nuevaRpm;
        } else {
            System.out.println("El motor está apagado o no se puede cambiar las RPM.");
        }
    }

    public void encender() {
        this.encendido = true;
        System.out.println("El motor se ha encendido.");
    }

    public void apagar() {
        this.encendido = false;
        this.rpm = 0;
        System.out.println("El motor se ha apagado.");
    }

    public void checarEstado() {
        if (this.encendido) {
            System.out.println("El motor está encendido. RPM actual: " + this.rpm);
        } else {
            System.out.println("El motor está apagado.");
        }
        
    }

    public void leerRpm() {
        System.out.println("RPM actual: " + this.rpm);
    }

    //setters y getters

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
    public int getRpm() {
        return rpm;
    }
    public boolean getEncendido() {
        return encendido;
    }

    @Override
    public String toString() {
            // TODO Auto-generated method stub
            return "Motor [rpm=" + rpm + ", encendido=" + encendido + "]";
    }

}
