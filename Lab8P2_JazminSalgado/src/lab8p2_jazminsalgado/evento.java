
package lab8p2_jazminsalgado;

import java.io.Serializable;




public class evento implements Serializable{
    private String estilo;
    private int distancia; 
    private int record;

    public evento() {
    }

    public evento(String estilo, int distancia, int record) {
        this.estilo = estilo;
        this.distancia = distancia;
        this.record = record;
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

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

   

    @Override
    public String toString() {
        return estilo + distancia +  record + "";
    }
   
    
}
