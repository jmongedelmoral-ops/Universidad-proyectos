package POO.Unidad4.ExamenPracticoInterfaces.Clases;

import POO.Unidad4.ExamenPracticoInterfaces.Interfaces.EmisordeAlerta;

public abstract class Emisores implements EmisordeAlerta {
    
    // ==Atributos==
    private int id;

    // ==Constructor==
    
    public Emisores(int id) {
        this.id = id;
    }

    // ==Métodos==
    public int getId(){
        return this.id;
    }

}
