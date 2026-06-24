package POO.Unidad3.Tarea3Multimedia;

public class Pelicula extends Multimedia {
    
    private String actorPrinc = null, actrizPrinc = null;
    
    

    public Pelicula(String titulo, String autor, int duracion, String actorPrinc, String actrizPrinc) {
        super(titulo, autor, duracion);
        if(actorPrinc == null && actrizPrinc == null){
            System.out.println("No se puede tener película sin almenos un actor o actriz principal");
            return;
        }
        this.actorPrinc = actorPrinc;
        this.actrizPrinc = actrizPrinc;
    }

    public String getActorPrinc() {
        return actorPrinc;
    }
    
    public String getActrizPrinc() {
        return actrizPrinc;
    }
    @Override
    public String toString() {
        return "Pelicula [titulo="
         + getTitulo()
         + ", autor="
         + getAutor()
         + ", actorPrinc="
         + actorPrinc
         + ", actrizPrinc="
         + actrizPrinc
         + ", duracion="
         + getDuracion() + "]";
    }
    
    
    
    

}
