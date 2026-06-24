package POO.Unidad3.Tarea3Multimedia;

public abstract class Multimedia {
    
    private String titulo; 
    private String autor;
    private enum formato {
         wav, mp3, midi, avi, mov, mpg, claudio, dvd
    }
    private int duracion;
    
    public Multimedia(String titulo, String autor, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
    }
    
    public boolean igual(Multimedia multimedia){
        return(this.autor.equals(multimedia.getAutor()) && this.titulo.equals(multimedia.getTitulo()));
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    
    @Override
    public String toString() {
        return "Multimedia [titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + "]";
    }
}
