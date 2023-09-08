package lab8p2_jazminsalgado;

import java.util.ArrayList;

public class pais {

    private String nombre;
    ArrayList<nadador> NADADORES = new ArrayList<>();
    private int medallas;

    public pais() {
    }

    public pais(String nombre, int medallas) {
        this.nombre = nombre;
        this.medallas = medallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<nadador> getNADADORES() {
        return NADADORES;
    }

    public void setNADADORES(ArrayList<nadador> NADADORES) {
        this.NADADORES = NADADORES;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    @Override
    public String toString() {
        return  nombre+"\n"  + NADADORES+"\n" + medallas;
    }
    
    
}
