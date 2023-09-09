/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_jazminsalgado;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;

/**
 *
 * @author evaja
 */
public class TiempoNadar extends Thread{
    private boolean avanzar;
    private boolean vive;
    private int segundos;
    private JProgressBar progBar_t;
    private boolean flag;

    public TiempoNadar( int segundos, JProgressBar progBar_t) {
        this.segundos= segundos;
        this.progBar_t = progBar_t;
        avanzar=true;
        vive=true;
        flag=false;
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
        FileWriter salida = null;
        BufferedWriter br = null;
        flag = true;
        while (vive) {            
            if (avanzar) {
                try {
                    salida = new FileWriter("./Tiempo.txt",true);
                    br = new BufferedWriter(salida);
                    br.write("velocidad:"+segundos);
                    br.newLine();
                    br.flush();
                    salida.close();
                } catch (Exception e) {
                }
 
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
               Logger.getLogger(TiempoNadar.class.getName()).log(Level.SEVERE, null, e);
            }
        }

    }
    
    
}
