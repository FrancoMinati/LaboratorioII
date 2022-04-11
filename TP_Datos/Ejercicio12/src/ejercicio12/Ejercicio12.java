package ejercicio12;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nombreArchivo = "trazaGPS_49_cortado.txt";
        
        try {
            FileReader archivo = new FileReader(nombreArchivo);
            Scanner sc = new Scanner(archivo);
            
            int cant = 0;
            int suma = 0;
            while(sc.hasNext()){
                String linea = sc.nextLine();
                String[] arrayLinea = linea.split("\t");
                suma += Integer.valueOf(arrayLinea[9]);
                cant++;
            }
            System.out.println("Cantidad de valores: " + cant);
            System.out.println("Suma total de las velocidades: " + suma);
            System.out.println("Promedio: " + (suma/(cant*1.0)));
        } catch(Exception e) {
            e.printStackTrace();
        } 
    }

}
