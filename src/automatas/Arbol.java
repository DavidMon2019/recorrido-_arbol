package automatas;

public class Arbol {

    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo aux = raiz;
            Nodo padre = aux;
            if (nuevo.getElemento() <= aux.getElemento()) {
                if (aux.getIzquierda() == null) {
                    padre.setIzquierda(nuevo);
                } else {
                    aux.setIzquierda(nuevo);
                }
            } else {
                if (aux.getDerecha() == null) {
                    padre.setDerecha(nuevo);
                } else {
                    aux.setDerecha(nuevo);
                }

            }
        }
    }

    public boolean vacio() {
        return raiz == null;

    }

    public void inOrder(Nodo nodo) {
        if (nodo != null) {
            inOrder(nodo.getIzquierda());
            System.out.println(nodo.getElemento());
            inOrder(nodo.getDerecha());
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
