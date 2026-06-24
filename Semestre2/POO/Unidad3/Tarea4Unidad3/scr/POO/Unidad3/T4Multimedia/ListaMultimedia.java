package POO.Unidad3.T4Multimedia;

import java.util.Arrays;

public class ListaMultimedia {


    private Multimedia[] elementosMultimedia;
    private int capacidad;
    private int indiceTope = -1;

    public ListaMultimedia(int almacenar) {
        this.elementosMultimedia = new Multimedia[almacenar];
        this.capacidad = elementosMultimedia.length-1;
    }
    
    public int size(){
        return this.capacidad;
    }

    public Boolean agregar(Multimedia m){
        if (this.indiceTope == this.capacidad-1){

            return false;
        }
        else{
            indiceTope++;
            elementosMultimedia[indiceTope] = m;
            return true;
        }
        
    }
    public Multimedia get(int posicion){
        if (posicion  > -1 && posicion < elementosMultimedia.length)
        return elementosMultimedia[posicion];
        else
            return null;
    }
    
    public int indexOf(Multimedia m){
        
        for(int i = 0; i<= indiceTope; i++){
            
            if (elementosMultimedia[i].sonIguales(m)){
                return i;
            }
        }
        System.out.println("No se ha encontrado dicha multimedia.");
        return -1;
        
    }
    @Override
    public String toString() {
        return "ListaMultimedia [multimedias="
                + Arrays.toString(elementosMultimedia) + "]";
    }


    //Métodos específicos de esta tarea

    public void presentarMultimedia(){
        for (int i = 0; i<= indiceTope; i++){
            System.out.println(elementosMultimedia[i].toString());
        }
    }

    public void mostrarPeliculasSinActrizPrincipal(){
        for (int i = 0; i<= indiceTope; i++){
            if(elementosMultimedia[i] instanceof Pelicula){
                Pelicula pel = (Pelicula) elementosMultimedia[i];
                if (pel.getActrizPrincipal() == null ){
                    System.out.println(elementosMultimedia[i].toString());
                }
            }

            }
    }

    public void mostrarDiscosRock(){
        for (int i = 0; i<= indiceTope; i++){
            if(elementosMultimedia[i] instanceof Disco){
                Disco disc = (Disco) elementosMultimedia[i];
                if (disc.getGeneroSeleccionado() == Disco.Genero.rock ){
                    System.out.println(elementosMultimedia[i].toString());
                }
            }

            }
    }

    public int calcularDuracionTotal(){

        int duracionTotal = 0;
        for (int i = 0; i <= indiceTope; i++){
            duracionTotal += elementosMultimedia[i].getDuracionMultimedia();
        }
        return duracionTotal;
    }


}
