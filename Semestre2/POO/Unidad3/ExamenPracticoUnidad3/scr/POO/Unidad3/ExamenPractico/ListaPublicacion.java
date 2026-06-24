package POO.Unidad3.ExamenPractico;

public class ListaPublicacion {
    private Publicacion[] lista;
    private int tope;
    private int tamaño;

    public ListaPublicacion(int tamañoMaximo) {
        this.lista = new Publicacion[tamañoMaximo];
        this.tamaño = tamañoMaximo;
        this.tope = 0;
    }

    public int size() {
        return tope;
    }

    private boolean llena() {
        return tope == tamaño;
    }

    public boolean add(Publicacion m) {
        if (!llena()) {
            lista[tope] = m;
            tope++;
            return true;
        }
        return false;
    }

    public Publicacion get(int posicion) {
        if (posicion >= 0 && posicion < tope) {
            return lista[posicion];
        }
        System.out.println("Error: Posición no válida");
        return null;
    }

    public int indexOf(Publicacion m) {
    for (int i = 0; i < tope; i++) {
        // Primero comprobamos que ambos sean Periódicos
        if (lista[i] instanceof Periodico && m instanceof Periodico) {
            Periodico p1 = (Periodico) lista[i];
            Periodico p2 = (Periodico) m;
            
            if (p1.getNombre().equals(p2.getNombre()) && p1.getFecha().equals(p2.getFecha())) {
                return i;
            }
        }
    }
    return -1;
}

    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < tope; i++) {
            resultado += lista[i].toString() + "\n";
        }
        return resultado;
    }
}