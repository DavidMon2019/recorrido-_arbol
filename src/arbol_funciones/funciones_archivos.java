package arbol_funciones;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class funciones_archivos {

    String url = "src\\recorridos_archivos\\";

    public void guardarArch(String nameFile, String rec,int raiz) {
        try {
            FileWriter escribir = new FileWriter(url + nameFile+".txt");
            PrintWriter texto = new PrintWriter(escribir);
            texto.println(
                    "raiz: "+raiz +"\n"+
                    rec.replace("0"," ")
                    
            );
            texto.close();
            System.out.println("Archivo guardado correctamente");
        } catch (IOException ex) {
            System.out.println("Error al guardar el recorrido "+ rec +" " + ex);
        }
    }

}
