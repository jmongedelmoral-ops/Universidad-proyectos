package com.proyectofinal;

public interface Vector<T> {

    
    
    void add(T elemento);
    void delete(int index);
    
    void replace(int index, T nuevoElemento);
    int search(int id);
    
    
    
    boolean isFull();
    boolean isEmpty();
    
}
