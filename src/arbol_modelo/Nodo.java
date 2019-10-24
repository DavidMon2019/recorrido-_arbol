package arbol_modelo;

public class Nodo {

    private int elemento;
    private Nodo izquierda, derecha;

    public Nodo(int elemento) {
        this.elemento = elemento;
        this.derecha = null;
        this.izquierda = null;
    }
   
    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

}
