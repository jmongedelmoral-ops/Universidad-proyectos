package POO.Unidad4.ExamenPracticoInterfaces.Clases.PaqueteEmisores;

import POO.Unidad4.ExamenPracticoInterfaces.Clases.Emisores;

public abstract class VehiculosEmergencia extends Emisores {

    // ==Atributos==

    private String codigo, zona;

    // ==Constructor==
    public VehiculosEmergencia(int id, String codigo, String zona) {
        super(id);
        this.codigo = codigo;
        this.zona = zona;
    }

    // ==Métodos==
    public void activarAlerta() {
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }


}
