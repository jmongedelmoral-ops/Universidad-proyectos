package POO.Unidad3.T4Multimedia;

public abstract class Multimedia {
    
    private String tituloMultimedia; 
    private String autorMultimedia;
    private enum formato {
         wav, mp3, midi, avi, mov, mpg, claudio, dvd
    }
    private int duracionMultimedia;
    
    public Multimedia(String titulo, String autor, int duracion) {
        this.tituloMultimedia = titulo;
        this.autorMultimedia = autor;
        this.duracionMultimedia = duracion;
    }
    
    public String getTituloMultimedia() {
        return tituloMultimedia;
    }
    
    public String getAutorMultimedia() {
        return autorMultimedia;
    }
    
    public int getDuracionMultimedia() {
        return duracionMultimedia;
    }

    public boolean sonIguales(Multimedia multimedia){
        return(this.autorMultimedia.equals(multimedia.getAutorMultimedia()) && this.tituloMultimedia.equals(multimedia.getTituloMultimedia()));
    }
    
    
    @Override
    public String toString() {
        return "Multimedia [titulo=" + tituloMultimedia + ", autor=" + autorMultimedia + ", duracion=" + duracionMultimedia + "]";
    }
}
