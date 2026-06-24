package POO.Unidad4.ExamenPracticoInterfaces.Clases.PaqueteEmisores;

import POO.Unidad4.ExamenPracticoInterfaces.Clases.Emisores;

public abstract class DispositivosComunicacion extends Emisores {

    // ==Atributos==
    private String marca;
    
    // ==Constructor==

    public DispositivosComunicacion(int id, String marca) {
        super(id);
        this.marca = marca;
    }
    
    // ==Métodos==
    

    
    public void encender(){}
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
