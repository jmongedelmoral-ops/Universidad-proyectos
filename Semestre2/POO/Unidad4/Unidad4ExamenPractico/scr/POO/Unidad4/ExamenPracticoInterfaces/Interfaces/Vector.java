package POO.Unidad4.ExamenPracticoInterfaces.Interfaces;


// Interfaz extraida del proyecto final veterinaria. Fue modificada para
// solo tener agregar, eliminar, buscar y presentar.

public interface Vector<T> {

    // Agregar elemento
    void add(T elemento);

    // Elimina un elemento por ID
    void delete(int index);

    // Busca un elemento y devuelve su posición (índice)
    int search(int id);

    // Muestra todos
    void displayAll();
}