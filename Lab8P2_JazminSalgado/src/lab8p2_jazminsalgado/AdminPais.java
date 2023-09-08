
package lab8p2_jazminsalgado;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class AdminPais {
    private ArrayList<pais> listarpaises = new ArrayList<>();
    private File text = null;

    public AdminPais(String Ruta) {
        text = new File(Ruta);
    }

    public ArrayList<pais> getListarpaises() {
        return listarpaises;
    }

    public void setListarpaises(ArrayList<pais> listarpaises) {
        this.listarpaises = listarpaises;
    }

    public File getText() {
        return text;
    }

    public void setText(File text) {
        this.text = text;
    }
    
    public void setPais(pais country){
        listarpaises.add(country);
    }
    
    public void cargar(){
        try {
            listarpaises = new ArrayList();
            pais save; 
            if (text.exists()) {
                FileInputStream e = new FileInputStream(text);
                ObjectInputStream o = new ObjectInputStream(e);
                try {
                    while ((save = (pais)o.readObject())!=null) {                        
                        listarpaises.add(save);
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
           for (pais lp : listarpaises) {
               oos.writeObject(lp);
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
