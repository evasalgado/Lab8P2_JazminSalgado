/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_jazminsalgado;

import javax.swing.JProgressBar;
import javax.swing.JSpinner;

/**
 *
 * @author evaja
 */
public class TiempoNadar extends Thread{
    private boolean avanzar;
    private boolean vive;
    private JSpinner distancia;
    private JProgressBar progBar_t;
    private boolean flag;

    public TiempoNadar(boolean avanzar, boolean vive, JSpinner distancia, JProgressBar progBar_t, boolean flag) {
        this.avanzar = avanzar;
        this.vive = vive;
        this.distancia = distancia;
        this.progBar_t = progBar_t;
        this.flag = flag;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    public boolean isFlag(){
        return flag;
    }
    
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
    
    @Override
    public void run() {
        

    }
    
    
}
