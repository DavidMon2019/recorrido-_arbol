package arbol_funciones;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class funciones_archivos {

    String url = "src\\recorridos_archivos\\";//ruta donde se guarda el archivo
//guarda el archivo en el paquete recorridos_archivos
    public void guardarArch(String nameFile, String rec,int raiz) {
        try {
            FileWriter escribir = new FileWriter(url + nameFile+".txt");
            PrintWriter texto = new PrintWriter(escribir);
            //valores que contiene el archivo
            texto.println(
                    "raiz:"+raiz +"\n"+
                    //remplaza -1 en un espacio en blanco        
                    rec.replace("-1"," ")+"\n\n"+           
                    // remplaza la cadena -1, en vacio        
                    "Recorrido Final:\n"+rec.replace("-1,","")        
            );
            texto.close();
            System.out.println("Archivo guardado correctamente");
        } catch (IOException ex) {
            System.out.println("Error al guardar el recorrido "+ rec +" " + ex);
        }
    }

}
