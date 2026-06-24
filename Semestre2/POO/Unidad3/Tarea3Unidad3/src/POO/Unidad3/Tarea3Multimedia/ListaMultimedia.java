package POO.Unidad3.Tarea3Multimedia;

import java.util.Arrays;

public class ListaMultimedia {

    
    private int tope = -1;
    private Multimedia[] multimedias;
    private int almacenar; 

    public ListaMultimedia(int almacenar) {
        this.multimedias = new Multimedia[almacenar];
        this.almacenar = multimedias.length-1;
    }
    
    public int size(){
        return this.almacenar;
    }

    public Boolean add(Multimedia m){
        if (this.tope == this.almacenar-1){

            return false;
        }
        else{
            tope++;
            multimedias[tope] = m;
            return true;
        }
        
    }
    public Multimedia get(int posicion){
        if (posicion  > -1 && posicion < multimedias.length)
        return multimedias[posicion];
        else
            return null;
    }
    
    public int indexOf(Multimedia m){
        
        for(int i = 0; i<= tope; i++){
            
            if (multimedias[i].igual(m)){
                return i;
            }
        }
        System.out.println("No se ha encontrado dicha multimedia.");
        return -1;
        
    }
    @Override
    public String toString() {
        return "ListaMultimedia [multimedias="
                + Arrays.toString(multimedias) + "]";
    }
    

}
