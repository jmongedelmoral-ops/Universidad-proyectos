package vectorGenerico;
import java.util.Arrays;
import java.util.Comparator;

public class Vector<T> {
    private T datos[];
    private int tope;

    public Vector(int tam) {
        this.datos = (T[]) new Object[tam];
        this.tope = -1;
    }

    private boolean lleno() {
        return this.tope == datos.length - 1;
    }

    private boolean vacio() {
        return this.tope == -1;
    }

    public String add(T objeto) {
        if (!lleno()) {
            datos[++tope] = objeto;
            return "Alta Exitosa";
        }
        return "Sin espacio";
    }

    //  Método profesional con Comparator
      public String presentar(T obj, Comparator<? super T> comparador) {
        String info = "";

        if (!vacio()) {
            for (int i = 0; i <= tope; i++) {
                if (comparador.compare(datos[i], obj) == 0) {
                    info += datos[i] + "\n";
                }
            }
        } else {
            info = "No hay datos";
        }
        return info;
    }

    //Creamos la clase sort para ordenar, el criterio para ordenar será definido por 
    //criterio del comparador;
    //Vector.sort(1, porEdad) ordenará los elementos por edad de menor(posicion = 0) a mayor.
      public void sort(int orden, Comparator<? super T> comparador) {
    // Usamos datos.length - 1 porque el último elemento ya estará en su lugar
    for (int i = 0; i < tope - 1; i++) {
        for (int j = 0; j < tope - i - 1; j++) {
            
            // Usamos la tricotomía: 1 es mayor, -1 es menor
            int resultadoCmp = comparador.compare(datos[j], datos[j + 1]);
            
            // Lógica de intercambio (Swap)
            // Si orden == 1 (Ascendente), movemos los "mayores" a la derecha
            // Si orden == 2 (Descendente), movemos los "menores" a la derecha
            boolean debeIntercambiar = (orden == 1) ? (resultadoCmp > 0) : (resultadoCmp < 0);

            if (debeIntercambiar) {
                T temp = datos[j];
                datos[j] = datos[j + 1];
                datos[j + 1] = temp;
            }
        }
    }
}

    @Override
    public String toString() {
        return Arrays.toString(datos);
    }
}