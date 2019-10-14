import java.util.ArrayList;
import java.io.*;

/*
 * Lee un archivo separado por comas que se encuentra dentro
 * del proyecto en la carpeta archivo con el nombre datos.cvs
 */

/**
 *
 * @author qmarqeva
 */
public class lecturaCSV {
ArrayList<String> datosPersonales;
    public lecturaCSV()
    {
         datosPersonales= new ArrayList<String>();
        }
    public void leerDatos() {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        

        String linea = null;

        try {
            //Cargamos el archivo de la ruta relativa
            archivo = new File("G:/datos.csv");
            //Cargamos el objeto FileReader
            fr = new FileReader(archivo);
            //Creamos un buffer de lectur
            br = new BufferedReader(fr);

            String[] datos = null;
            int i=0;
            //Leemos hasta que se termine el archivo
            while ((linea = br.readLine()) != null) {

                //Utilizamos el separador para los datos
                datos = linea.split(";");
                //Presentamos los datos
                System.out.println("" + datos[0] +"  " + datos[1] +"  "+datos[2]+"  "+datos[3]+"  "+datos[4]);
                
                datosPersonales.add(datos[0]);
                datosPersonales.add(datos[1]);
                datosPersonales.add(datos[2]);
                datosPersonales.add(datos[3]);
                datosPersonales.add(datos[4]);
               
            }
            
            //Capturamos las posibles excepciones
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }
    public ArrayList<String> getDatos(){
    return datosPersonales;}
}
