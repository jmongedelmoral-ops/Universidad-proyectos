package com.proyectofinal.gestionarConslt;

import java.time.LocalDate;

import com.proyectofinal.Vector;

public class VConsultas implements Vector<Consulta> {
    private Consulta[] consultas;
    private int ultimo;
    
    public VConsultas(int tamañoMaximo) {
        this.consultas = new Consulta[tamañoMaximo];
        this.ultimo = 0;
    }
       
    @Override
    public void replace(int posicionTope, Consulta nuevaConsulta) {
            consultas[posicionTope] = nuevaConsulta;
    }

    @Override
    public boolean isEmpty() {
        return ultimo == 0;
    }
    @Override
    public boolean isFull() {
        return ultimo == consultas.length;
    }
    @Override
    public void add(Consulta c) {
        if (!isFull()) {
            consultas[ultimo] = c;
            ultimo++;
        }
    }
    @Override
    public void delete(int id) {
        for (int i = 0; i < ultimo; i++) {
            if (consultas[i].getIdConsulta() == id) {
                // Desplazamos los elementos
                for (int j = i; j < ultimo - 1; j++) {
                    consultas[j] = consultas[j + 1];
                }
                consultas[ultimo - 1] = null;
                ultimo--;
                break;
            }
        }
    }

    public void ordenar() {
        // Ordenamiento simple por fecha (Burbuja)
        for (int i = 0; i < ultimo - 1; i++) {
            for (int j = 0; j < ultimo - 1 - i; j++) {
                if (consultas[j].getFechaConsulta().isAfter(consultas[j+1].getFechaConsulta())) {
                    Consulta temp = consultas[j];
                    consultas[j] = consultas[j+1];
                    consultas[j+1] = temp;
                }
            }
        }
    }

    public String presentarUnaConsulta(int id) {
        for (int i = 0; i < ultimo; i++) {
            if (consultas[i].getIdConsulta() == id) {
                return consultas[i].toString();
            }
        }
        return "Consulta no encontrada";
    }

    public String presentarXFecha(LocalDate fecha) {
        String res = "";
        for (int i = 0; i < ultimo; i++) {
            if (consultas[i].getFechaConsulta().equals(fecha)) {
                res += consultas[i].toString() + "\n";
            }
        }
        return res;
    }

    public String presentarConsultasAtendidas(LocalDate fecha) {
        String res = "";
        for (int i = 0; i < ultimo; i++) {
            if (consultas[i].getFechaConsulta().equals(fecha) && consultas[i].Asistio()) {
                res += consultas[i].toString() + "\n";
            }
        }
        return res;
    }

    public String presentarTodasConsulta() {
        String res = "";
        for (int i = 0; i < ultimo; i++) {
            res += consultas[i].toString() + "\n";
        }
        return res;
    }

    //presentar consultas de mascota específica
    public String presentaConsultasMascota(int id) {
        String res = "";
        for (int i = 0; i < ultimo; i++) {
            if (consultas[i].getMascota().getIdMascota() == id) {
                res += consultas[i].toString() + "\n";
            }
        }
        return res;
    }

    public String presentarConsultasVeterinario(String nombreVet) {
        String res = "";
        for (int i = 0; i < ultimo; i++) {
            if (consultas[i].getVeterinario().getNombre().equalsIgnoreCase(nombreVet)) {
                res += consultas[i].toString() + "\n";
            }
        }
        return res;
    }

    public int search(int id){
        for(int i = 0; i < ultimo; i++){
            if(consultas[i].getMascota().getIdMascota() == id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Total de consultas: " + ultimo;
    }

    public Consulta[] getConsultas() {
        return consultas;
    }

    public void setConsultas(Consulta[] consultas) {
        this.consultas = consultas;
    }

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }
}
