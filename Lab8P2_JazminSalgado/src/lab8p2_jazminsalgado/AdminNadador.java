
package lab8p2_jazminsalgado;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class AdminNadador {
    private ArrayList<nadador> listarnadadores = new ArrayList<>();
    private File text = null;

    public AdminNadador(String Ruta) {
        text = new File(Ruta);
    }

    public ArrayList<nadador> getListarnadador() {
        return listarnadadores;
    }

    public void setListarnadador(ArrayList<nadador> listarnadador) {
        this.listarnadadores = listarnadador;
    }

    public File getText() {
        return text;
    }

    public void setText(File text) {
        this.text = text;
    }
     public void setNadador(nadador swimmer){
        listarnadadores.add(swimmer);
    }
    
    public void cargar(){
        try {
            listarnadadores = new ArrayList();
            nadador save; 
            if (text.exists()) {
                FileInputStream e = new FileInputStream(text);
                ObjectInputStream o = new ObjectInputStream(e);
                try {
                    while ((save = (nadador)o.readObject())!=null) {                        
                        listarnadadores.add(save);
                    }
 
                } catch (EOFException ex) {
                    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   public void escribir(){
       FileOutputStream fos = null;
       ObjectOutputStream oos = null;
       try {
           fos = new FileOutputStream(text);
           oos = new ObjectOutputStream(fos);
           for (nadador ln : listarnadadores) {
               oos.writeObject(ln);
           }
       } catch (Exception e) {
       } finally {
           try {
               oos.close();
               fos.close();
           } catch (Exception e) {
           }
           
       }
   }
}
