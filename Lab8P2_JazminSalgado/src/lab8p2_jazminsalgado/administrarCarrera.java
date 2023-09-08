
package lab8p2_jazminsalgado;

import javax.swing.JProgressBar;


public class administrarCarrera extends Thread{
    private JProgressBar seconds;
    private boolean avanzar;
    private boolean vive;

    public administrarCarrera(JProgressBar seconds) {
        this.seconds = seconds;
        avanzar = true;
        vive = true;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {            
            if (avanzar) {
                seconds.setValue(seconds.getValue()+1);
                seconds.setString(Integer.toString(seconds.getValue())+"Segundos");
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
            }
        }
    }
    
    
    
}
