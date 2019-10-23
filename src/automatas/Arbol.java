package automatas;

import java.util.ArrayList;

public class Arbol {

    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public boolean insertar(Integer dato) {
        return (agregar(dato));
    }

    public boolean agregar(Integer dato) {
        Nodo nuevo = new Nodo(dato);
        ingresarNodo(nuevo, raiz);
        return true;
    }

    public void ingresarNodo(Nodo nuevo, Nodo aux) {

        if (raiz == null) {
            raiz = nuevo;
        } else {
            if (nuevo.getElemento() <= aux.getElemento()) {
                if (aux.getIzquierda() == null) {
                    aux.setIzquierda(nuevo);
                } else {
                    ingresarNodo(nuevo, aux.getIzquierda());
                }
            } else {
                if (aux.getDerecha() == null) {
                    aux.setDerecha(nuevo);
                } else {
                    ingresarNodo(nuevo, aux.getDerecha());
                }

            }
        }
    }

    public boolean vacio() {
        return raiz == null;

    }

    public ArrayList<Integer> InOrder() {
        ArrayList<Integer> val = new ArrayList<>();
        fun_inorder(raiz, val);
        return val;
    }

    public void fun_inorder(Nodo nodo, ArrayList<Integer> rec) {
        if (nodo != null) {
            fun_inorder(nodo.getIzquierda(), rec);
            rec.add(nodo.getElemento());
            fun_inorder(nodo.getDerecha(), rec);
        }
    }

    public void preOrder(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.getElemento());
            preOrder(nodo.getIzquierda());
            preOrder(nodo.getDerecha());
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

}
