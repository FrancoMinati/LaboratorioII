package ejercicio14;

import java.io.File;
import java.io.FileWriter;

public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreArchivo = "numeros.txt";
        
        File archivo = new File(nombreArchivo);
        try {
            if (archivo.exists()) {
                archivo.delete();
            }
            
            archivo.createNewFile();
            
            FileWriter escritorArchivo = new FileWriter(nombreArchivo);
            
            for (int i = 0; i < 1000; i++) {
                escritorArchivo.write(i+1 + "\n");
            }
            escritorArchivo.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
