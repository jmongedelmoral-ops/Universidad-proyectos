package POO.Unidad3.T4Multimedia;

public class Disco extends Multimedia {

    
    enum Genero{
        rock, pop, funky, flamenco, clasico, blues, tecno,
        ambiente, punk, jazz, hiphop
    }
    private Genero generoSeleccionado;
    
    public Disco(Genero generoSeleccionado, String titulo, String autor, int duracion) {
        this.generoSeleccionado = generoSeleccionado;
        super(titulo, autor, duracion);
        //TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Disco [Titulo=" + getTituloMultimedia() + ", Autor=" + getAutorMultimedia()
                + ", Duracion=" + getDuracionMultimedia() + "]";
    }

    public Genero getGeneroSeleccionado() {
        return generoSeleccionado;
    }
    
    

    
}
