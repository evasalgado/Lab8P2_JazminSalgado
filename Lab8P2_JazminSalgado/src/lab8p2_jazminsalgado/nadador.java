
package lab8p2_jazminsalgado;


public class nadador {
    private String nombre;
    private String nacionalidad; 
    private int edad;
    private double estatura; 
    private String estilo;
    private int distancia; 
    private int t_masrapido;
    private int medallas;

    public nadador() {
    }

    public nadador(String nombre, String nacionalidad, int edad, double estatura, String estilo, int distancia, int t_masrapido, int medallas) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.estatura = estatura;
        this.estilo = estilo;
        this.distancia = distancia;
        this.t_masrapido = t_masrapido;
        this.medallas = medallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getT_masrapido() {
        return t_masrapido;
    }

    public void setT_masrapido(int t_masrapido) {
        this.t_masrapido = t_masrapido;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    @Override
    public String toString() {
        return  nombre +  nacionalidad  + edad  + estatura + estilo  + distancia  + t_masrapido  + medallas + "";
    }
    
    
}
