
package lab8p2_jazminsalgado;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminEvento {
    private ArrayList<evento> listareventos = new ArrayList<>();
    private File text = null;

    public AdminEvento(String Ruta) {
        text = new File(Ruta);
    }

    public ArrayList<evento> getListareventos() {
        return listareventos;
    }

    public void setListareventos(ArrayList<evento> listareventos) {
        this.listareventos = listareventos;
    }

    public File getText() {
        return text;
    }

    public void setText(File text) {
        this.text = text;
    }
    
     public void setEvento(evento event){
        listareventos.add(event);
    }
    
    public void cargar(){
        try {
            listareventos = new ArrayList();
            evento save; 
            if (text.exists()) {
                FileInputStream e = new FileInputStream(text);
                ObjectInputStream o = new ObjectInputStream(e);
                try {
                    while ((save = (evento)o.readObject())!=null) {                        
                        listareventos.add(save);
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
           for (evento le : listareventos) {
               oos.writeObject(le);
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
