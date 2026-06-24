package POO.Unidad4.ExamenPracticoInterfaces.Clases;


import POO.Unidad4.ExamenPracticoInterfaces.Interfaces.Vector;

public class VEmisores implements Vector<Emisores> {
    private int tope = -1;
    private Emisores[] emisores;

    public VEmisores(int tam) {
        this.emisores = new Emisores[tam];
    }

    // ==Implementacion de métodos del interfaz==
    @Override
    public void add(Emisores elemento) {
        if (tope != emisores.length - 1) {
            tope++;
            emisores[tope] = elemento;

        }
    }

    @Override
    public void delete(int index) {
        if(tope != -1){
            // Desplazar las emisores siguientes hacia la izquierda
            for (int j = index; j < tope - index; j++) {
                emisores[j] = emisores[j + 1];
            }
            emisores[tope - 1] = null; // Limpiamos la última posición
            tope--; // Reducimos el tope
            System.out.println("Emisor " + emisores[index] + " eliminado.");
        }
        else
            System.out.println("No existen emisores");

    }

    @Override
    public int search(int id) {
        for (int i = 0; i<=tope; i++ ){
            if(emisores[i].getId() == id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void displayAll(){
        for (int i = 0; i <= tope; i++){
            System.out.println(emisores[i].toString());
        }
    }
    

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public Emisores[] getEmisores() {
        return emisores;
    }

    public void setEmisores(Emisores[] emisores) {
        this.emisores = emisores;
    }




}
