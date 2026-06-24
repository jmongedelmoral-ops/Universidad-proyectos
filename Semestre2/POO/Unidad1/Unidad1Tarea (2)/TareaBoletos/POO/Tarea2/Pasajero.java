package POO.Tarea2;

//Esta librería es importada para el tipo Date en el atributo fechaDeNacimiento
import java.sql.Date;

public class Pasajero {

    //Atributos y constructor
    String nombre;
    String correo;
    Date fechaDeNacimiento;

    public Pasajero(String nombre, String correo, Date fechaDeNacimiento){
        this.nombre = nombre;
        this.correo = correo;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    // Métodos getters, setters y toString
        public String getNombre() {
            return nombre;
        }

        public String getCorreo() {
            return correo;
        }

        public Date getFechaDeNacimiento() {
            return fechaDeNacimiento;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public void setFechaDeNacimiento(Date fechaDeNacimiento) {
            this.fechaDeNacimiento = fechaDeNacimiento;
        }

        @Override
        public String toString() {
            return "Pasajero [nombre=" + nombre + ", correo=" + correo + ", fechaDeNacimiento=" + fechaDeNacimiento + "]";
        }
    
}
