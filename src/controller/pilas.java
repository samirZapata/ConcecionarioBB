package controller;

import controller.Listas;
import controller.inventarioCarrosCr;

/**
 *
 * @author Karen Espitia
 * @param <T>
 */
public class pilas<T> {

    Listas lis = new Listas();
    /**
     *
     * @param <inventarioCarrosCr>
     */

    /**
     *
     */
    //  private Listas<inventarioCarrosCr> inicio;
    int s;
    private Listas<inventarioCarrosCr> pila;

    //  int maxsize;
    int top;

    public pilas() {
        pila = new Listas<>();
        s = 0;
        top = 0; //pila está vacía

    }

    /*
    *MÉTODO PARA AVERIGUAR TAMAÑO
     */
    public int size() {
        return s;
    }

    /*
* 1) MÉTODO PARA SABER SÍ LA PILA ESTÁ VACIA: TRUE, SINO: FALSE
*@return
     */
    public boolean empty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*
*2) MÉTODO PUSH: PARA AÑADIR ELEMENTOS STRING A LA PILA
     */
    /**
     *
     * @param Inventario
     * @param indice
     *
     */

    public void push(T Inventario) {
        Listas<T> nuevo = new Listas<>(Inventario, size());
        if (top < lis.tamanio()) {
            pila.agregar((inventarioCarrosCr) Inventario);
            top++;
        }
    }

    /*
    * 4) MÉTODO PARA DESAPILAR (ELIMINAR)= POP
    *LIFO
    * DEVUELVE EL ÚLTIMO ELEMENTO DE LA PILA Y LO ELIMINA
    *TOP DISMINUIR
    *@return
     */
    public String pop() {

        String temp = null;
        // Primero debemos si hay elementos en la pila o no 
        if (top > 0) {//GUILLE DICE: si hay un elemento en la pila
            //eliminar
            pila.get(top);
            pila.EliminarNodo(top);
            top--;
        }
        s--;
        return temp;
    }

    /*
     *METODO PARA OBTENER UN ELEMENTO DE LA LISTA
     */
    public String obtener(int index) throws Exception {
        int contador = 0;
        int tempo = 0;
        T temp = null;
        if (top > 0) {

            for (int i = 0; i < index; i++) {
                tempo = pila.get(i);
            }
            temp = (T) pila.obtener(tempo);
        }
        return (String) temp;
    }

}
