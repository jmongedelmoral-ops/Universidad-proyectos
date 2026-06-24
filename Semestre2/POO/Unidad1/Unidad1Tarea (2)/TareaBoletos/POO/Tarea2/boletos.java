package POO.Tarea2;

//Esta libreria es importada para poder usar el tipo de dato Date en los atributos 
//fechaSalida y fechaRetorno

public class boletos {

//Atributos y constructor
 private String codigo;
 private Pasajero pasajero;
 private Asiento AsientoSalida;
 private Asiento AsientoRetorno;
 private Vuelo VueloSalida;
 private Vuelo VueloRetorno;
private metodoDePago metodoDePago;

    public boletos(String codigo, Pasajero pasajero, Asiento asientoSalida, Asiento asientoRetorno, Vuelo vueloSalida,
            Vuelo vueloRetorno, metodoDePago metodoDePago) {
        this.codigo = codigo;
        this.pasajero = pasajero;
        this.AsientoSalida = asientoSalida;
        this.AsientoRetorno = asientoRetorno;
        this.VueloSalida = vueloSalida;
        this.VueloRetorno = vueloRetorno;
        this.metodoDePago = metodoDePago;
    }
    // Métodos para mostrar los datos del vuelo de salida y retorno
    public String datosSalida() {
        return "Vuelo de salida: " + VueloSalida.getLocacionSalida() + " a " + VueloSalida.getLocacionLlegada() + 
        "\n Hora de salida: " + VueloSalida.getHoraSalida()+"\n hora de llegada: " + VueloSalida.getHoraLlegada() +
        "\n el día " + VueloSalida.getFechaSalida() + " (YYYY-MM-DD)";
    }
    public String datosRetorno() {
        return "Vuelo de retorno: " + VueloRetorno.getLocacionSalida() + " a " + VueloRetorno.getLocacionLlegada() + 
        "\n Hora de salida: " + VueloRetorno.getHoraSalida() + "\n Hora de llegada: " + VueloRetorno.getHoraLlegada() + 
        "\n el día " + VueloRetorno.getFechaSalida() + " (YYYY-MM-DD)"
        + "\n Método de pago: " + metodoDePago.getMedio();
    }
    
    // Métodos getters, setters y toString
    public String getCodigo() {
        return codigo;
    }
    public Pasajero getPasajero() {
        return pasajero;
    }
    public Asiento getAsientoSalida() {
        return AsientoSalida;
    }
    public Asiento getAsientoRetorno() {
        return AsientoRetorno;
    }
    public Vuelo getVueloSalida() {
        return VueloSalida;
    }
    public Vuelo getVueloRetorno() {
        return VueloRetorno;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
    public void setAsientoSalida(Asiento asientoSalida) {
        AsientoSalida = asientoSalida;
    }
    public void setAsientoRetorno(Asiento asientoRetorno) {
        AsientoRetorno = asientoRetorno;
    }
    public void setVueloSalida(Vuelo vueloSalida) {
        this.VueloSalida = vueloSalida;
    }
    public void setVueloRetorno(Vuelo vueloRetorno) {
        this.VueloRetorno = vueloRetorno;
    }

    @Override
    public String toString() {
        return "boletos \n[codigo=" + codigo + ", \npasajero=" + pasajero + ", \nAsientoSalida=" + AsientoSalida
                + ", \nAsientoRetorno=" + AsientoRetorno + ", \nVueloSalida=" + VueloSalida + ", \nVueloRetorno="
                + VueloRetorno +", \nfechaSalida=" + VueloRetorno.getFechaSalida() + ", \nfechaRetorno=" + VueloRetorno.getFechaSalida()  
             + "]";
    }


}
