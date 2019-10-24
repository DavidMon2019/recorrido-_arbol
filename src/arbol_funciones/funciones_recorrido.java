package arbol_funciones;

import arbol_modelo.Arbol;
import java.util.ArrayList;
import javax.swing.JTextField;

public class funciones_recorrido {

    ArrayList<Integer> valRec;
    ArrayList<Integer> coleccion;
    funciones_archivos funArc;

    public funciones_recorrido() {
    }

    public String ValNull(JTextField text) {

        if (text.getText().length() == 0) {
            text.setText("0");
        } else {

            text.getText();
        }

        return text.getText();
    }

    /*Convierte los valores de Jtext a Integer*/
    public Integer valEntero(String text) {
        int valor = 0;
        valor = Integer.parseInt(text);
        return valor;
    }

    public String recorrido(ArrayList<Integer> it, String msg) {
        int i = 0;
        String r = msg + "\n";
        while (i < it.size()) {
            r += it.get(i) + ",";

            i++;
        }
        return (r);
    }

    public void cargarArray(Arbol nArbol,
            JTextField JT1, JTextField JT10, JTextField JT11, JTextField JT12,
            JTextField JT13, JTextField JT14, JTextField JT15, JTextField JT16,
            JTextField JT17, JTextField JT18, JTextField JT19, JTextField JT2,
            JTextField JT20, JTextField JT21, JTextField JT22, JTextField JT23,
            JTextField JT24, JTextField JT25, JTextField JT26, JTextField JT27,
            JTextField JT28, JTextField JT29, JTextField JT3, JTextField JT30,
            JTextField JT31, JTextField JT4, JTextField JT5, JTextField JT6,
            JTextField JT7, JTextField JT8, JTextField JT9) {

        coleccion = new ArrayList<>();
        coleccion.add(valEntero(ValNull(JT1)));
        coleccion.add(valEntero(ValNull(JT2)));
        coleccion.add(valEntero(ValNull(JT3)));
        coleccion.add(valEntero(ValNull(JT4)));
        coleccion.add(valEntero(ValNull(JT5)));
        coleccion.add(valEntero(ValNull(JT6)));
        coleccion.add(valEntero(ValNull(JT7)));
        coleccion.add(valEntero(ValNull(JT8)));
        coleccion.add(valEntero(ValNull(JT9)));
        coleccion.add(valEntero(ValNull(JT10)));
        coleccion.add(valEntero(ValNull(JT11)));
        coleccion.add(valEntero(ValNull(JT12)));
        coleccion.add(valEntero(ValNull(JT13)));
        coleccion.add(valEntero(ValNull(JT14)));
        coleccion.add(valEntero(ValNull(JT15)));
        coleccion.add(valEntero(ValNull(JT16)));
        coleccion.add(valEntero(ValNull(JT17)));
        coleccion.add(valEntero(ValNull(JT18)));
        coleccion.add(valEntero(ValNull(JT19)));
        coleccion.add(valEntero(ValNull(JT20)));
        coleccion.add(valEntero(ValNull(JT21)));
        coleccion.add(valEntero(ValNull(JT22)));
        coleccion.add(valEntero(ValNull(JT23)));
        coleccion.add(valEntero(ValNull(JT24)));
        coleccion.add(valEntero(ValNull(JT25)));
        coleccion.add(valEntero(ValNull(JT26)));
        coleccion.add(valEntero(ValNull(JT27)));
        coleccion.add(valEntero(ValNull(JT28)));
        coleccion.add(valEntero(ValNull(JT29)));
        coleccion.add(valEntero(ValNull(JT30)));
        coleccion.add(valEntero(ValNull(JT31)));

        for (int i = 0; i < coleccion.size(); i++) {

            if (coleccion.get(i) != 0) {
                nArbol.agregar(coleccion.get(i));
            }
        }
    }

    public void ejecInOrder(Arbol nArbol) {

        if (!nArbol.vacio()) {
            valRec = nArbol.InOrder();
            String rec = recorrido(valRec, "In order");
            System.out.println(rec);

        }

    }

    public void ejecPreOrder(Arbol nArbol) {

        if (!nArbol.vacio()) {
            valRec = nArbol.PreOrder();
            String rec = recorrido(valRec, "Pre order");
            System.out.println(rec);

        }
    }

    public void ejecPostOrder(Arbol nArbol) {
        funArc = new funciones_archivos();
        if (!nArbol.vacio()) {
            valRec = nArbol.PostOrder();
            String rec = recorrido(valRec, "Post order");
            System.out.println(rec.replace("0", " "));
            funArc.guardarArch("Post_Order", rec,nArbol.getRaiz().getElemento());
            
        } else {
            System.out.println("Arbol vacio");
        }
    }

}
