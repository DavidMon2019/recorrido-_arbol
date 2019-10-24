package arbol_modelo;

import java.util.ArrayList;

public class Arbol {

    private Nodo raiz;

    public Arbol() {
        raiz = null;
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

    public ArrayList<Integer> PreOrder() {
        ArrayList<Integer> val = new ArrayList<>();
        fun_preorder(raiz, val);
        return val;
    }

    public ArrayList<Integer> PostOrder() {
        ArrayList<Integer> val = new ArrayList<>();
        fun_postorder(raiz, val);
        return val;
    }

    public void fun_inorder(Nodo nodo, ArrayList<Integer> rec) {
        if (nodo != null) {
            fun_inorder(nodo.getIzquierda(), rec);
            rec.add(nodo.getElemento());
            fun_inorder(nodo.getDerecha(), rec);
        }
    }

    public void fun_preorder(Nodo nodo, ArrayList<Integer> rec) {
        if (nodo != null) {
            rec.add(nodo.getElemento());
            fun_preorder(nodo.getIzquierda(), rec);
            fun_preorder(nodo.getDerecha(), rec);
        }
    }
    public void fun_postorder(Nodo nodo, ArrayList<Integer> rec) {
        if (nodo != null) {
            fun_postorder(nodo.getIzquierda(), rec);
            fun_postorder(nodo.getDerecha(), rec);
            rec.add(nodo.getElemento());
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

}
