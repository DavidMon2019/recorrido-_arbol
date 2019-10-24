package arbol_modelo;

import java.util.ArrayList;

public class Arbol {
    //objeto del nodo
    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    //agrega los valores de los nodos
    public boolean agregar(Integer dato) {
        Nodo nuevo = new Nodo(dato);
        ordenarNodos(nuevo, raiz);
        return true;
    }

//ordena los nodos segun el valor de la raiz
    public void ordenarNodos(Nodo nuevo, Nodo raiz) {
//si la raiz esta vacia le asigna el primer valor
        if (this.raiz == null) {
            this.raiz = nuevo;
        } else {
//si el valor nuevo es menor o igual a la raiz se asigna a la izquierda
            if (nuevo.getElemento() <= raiz.getElemento()) {
                if (raiz.getIzquierda() == null) {
                    raiz.setIzquierda(nuevo);
                } else {
                    ordenarNodos(nuevo, raiz.getIzquierda());
                }
//si es mayor se le asigna a la derecha                
            } else {
                if (raiz.getDerecha() == null) {
                    raiz.setDerecha(nuevo);
                } else {
                    ordenarNodos(nuevo, raiz.getDerecha());
                }

            }
        }
    }

    public boolean vacio() {
        return raiz == null;

    }

    /*
    -- carga la raiz al metodo principal InOrder y el Array para almacenar el recorrido
    -- retorna el Array del recorrido
     */
    public ArrayList<Integer> InOrder() {
        ArrayList<Integer> val = new ArrayList<>();
        fun_inorder(raiz, val);
        return val;
    }

    /*
    -- carga la raiz al metodo principal PreOrder y el Array para almacenar el recorrido
    -- retorna el Array del recorrido
     */
    public ArrayList<Integer> PreOrder() {
        ArrayList<Integer> val = new ArrayList<>();
        fun_preorder(raiz, val);
        return val;
    }

    /*
    -- carga la raiz al metodo principal PostOrder y el Array para almacenar el recorrido
    -- retorna el Array del recorrido
     */
    public ArrayList<Integer> PostOrder() {
        ArrayList<Integer> val = new ArrayList<>();
        fun_postorder(raiz, val);
        return val;
    }

    //funcion peincipal In Order
    public void fun_inorder(Nodo nodo, ArrayList<Integer> rec) {
        if (nodo != null) {
            fun_inorder(nodo.getIzquierda(), rec);
            rec.add(nodo.getElemento());
            fun_inorder(nodo.getDerecha(), rec);
        }
    }

    //funcion principal Pre Order
    public void fun_preorder(Nodo nodo, ArrayList<Integer> rec) {
        if (nodo != null) {
            rec.add(nodo.getElemento());
            fun_preorder(nodo.getIzquierda(), rec);
            fun_preorder(nodo.getDerecha(), rec);
        }
    }

    //funcion principal Post Order
    public void fun_postorder(Nodo nodo, ArrayList<Integer> rec) {
        if (nodo != null) {
            fun_postorder(nodo.getIzquierda(), rec);
            fun_postorder(nodo.getDerecha(), rec);
            rec.add(nodo.getElemento());
        } else {
            rec.add(-1);
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

}
