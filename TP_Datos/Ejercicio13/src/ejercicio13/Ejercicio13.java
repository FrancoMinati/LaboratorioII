package ejercicio13;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreArchivo = "palabra4.txt";
        
        File archivo = new File(nombreArchivo);
        try {
            Scanner sc = new Scanner(archivo);
            
            while(sc.hasNextLine()){
                String linea = sc.nextLine();
                String lineaCopia = linea.replaceAll(" ", "");
                lineaCopia = lineaCopia.replaceAll(";", "");
                
                //El criterio es que las palabras empiecen y terminen por a
                if(lineaCopia.startsWith("a") && lineaCopia.endsWith("a")){
                    System.out.println(lineaCopia);
                }
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
