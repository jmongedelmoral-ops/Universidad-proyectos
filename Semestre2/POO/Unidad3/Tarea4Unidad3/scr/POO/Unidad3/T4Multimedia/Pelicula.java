package POO.Unidad3.T4Multimedia;

public class Pelicula extends Multimedia {
    
    private String actorPrincipal = null, actrizPrincipal = null;
    
    

    public Pelicula(String actorPrincipal, String actrizPrincipal, String titulo, String autor, int duracion) {
        super(titulo, autor, duracion);
        if(actorPrincipal == null && actrizPrincipal == null){
            System.out.println("No se puede tener película sin almenos un actor o actriz principal");
            return;
        }
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    @Override
    public String toString() {
        return "Pelicula [titulo="
         + getTituloMultimedia()
         + ", autor="
         + getAutorMultimedia()
         + ", actorPrinc="
         + actorPrincipal
         + ", actrizPrinc="
         + actrizPrincipal
         + ", duracion="
         + getDuracionMultimedia() + "]";
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }
    
    public String getActrizPrincipal() {
        return actrizPrincipal;
    }
    
    
    
    

}
