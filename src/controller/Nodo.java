package controller;

/**
 *
 * @author yonier
 * @param <T>
 */
public class Nodo<T> {
     T valor;
    //Object valor;
    Nodo siguiente;

    public Nodo(T valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public void enlazarSiguiente(Nodo n) {
        siguiente = n;
    }

    public Nodo obtenerSiguiente() {
        return siguiente;
    }

    public Object obtenerValor() {
        return valor;
    }
}
