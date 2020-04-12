package controller;

/**
 *
 * @author yonier
 * @param <T>
 */
public class Listas<T> {

    elementos ele = new elementos();

    /**
     *
     * @param <T>
     */
    private T dato;
    private int indice;
    private Nodo cabeza;
    int tamanio;

    public Listas(T dato, int indice) {
        this.dato = dato;
        this.indice = indice;
        cabeza = null;
        tamanio = 0;

    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    private class elementos<T> {

        //Declaro variables a utilizar
        private T dato;
        private int indice;
        private elementos siguiente;

        /**
         *
         * @param dato
         * @param indice
         */
        //inicializo objetos
        public elementos(T dato, int indice) {
            this.dato = dato;
            this.indice = indice;
            this.siguiente = null;
        }

        /**
         *
         * @param indice
         */
        public elementos(int indice) {
            this.dato = null;
            this.indice = indice;
            this.siguiente = null;
        }

        public elementos() {
            this.dato = null;
            this.indice = 0;
            this.siguiente = null;
        }

        public T getDato() {
            return dato;
        }

        public void setDato(T dato) {
            this.dato = dato;
        }

        public int getIndice() {
            return indice;
        }

        public void setIndice(int indice) {
            this.indice = indice;
        }

        public elementos getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(elementos siguiente) {
            this.siguiente = siguiente;
        }
    }

    private elementos<T> inicio;

    public Listas() {
        this.inicio = null;
    }

    //Verifico si la lista contiene datos
    public boolean estaVacia() {
        return (inicio == null) ? true : false;
    }

    //Metodo para saber el tamaño de la lista
    public int tamanio() {

        if (!estaVacia()) {
            tamanio = 1;
            elementos<T> temp = this.inicio;

            do {
                temp = temp.getSiguiente();
                if (temp != null) {
                    tamanio++;
                }
            } while (temp != null);
        }
        return tamanio;
    }

    /**
     * Metodo Imprimir
     *
     * @return salida
     */
    public String imprimir() {
        String salida = "";

        if (!estaVacia()) {
            elementos<T> temp = this.inicio;

            for (int i = 0; i < this.tamanio(); i++) {
                salida += (temp.getIndice() + ":" + temp.getDato() + "\n");
                temp = temp.getSiguiente();
                if (temp == null) {
                    break;
                }
            }
        }
        return salida;
        //return null;
    }

    public void agregar(T dato) {
        elementos<T> nuevo = new elementos<>(dato, tamanio());

        if (inicio == null) {
            this.inicio = nuevo;
        } else {
            nuevo.setSiguiente(this.inicio);
            this.inicio = nuevo;
        }
    }

    //MÉTODO EN EL CUAL SE CREA OTRO MÉTODO DE AGREGAR PARA LOS ELEMENTOS QUE LLEGAN DE LA PILA
    public void agregarIn() {
        elementos<T> nuevo = new elementos<>(dato, indice);
        if (inicio == null) {
            this.inicio = nuevo;
        } else {
            nuevo.setSiguiente(this.inicio);
            this.inicio = nuevo;
        }
    }

    public T base() throws Exception {
        if (!estaVacia()) {
            elementos<T> tem = this.inicio;

            for (int i = 0; i < tamanio(); i++) {
                if (tem.getSiguiente() != null) {
                    tem = tem.getSiguiente();
                }
            }
            return (T) tem.getDato();
        } else {
            throw new Exception("Lista Vacia");
        }
    }

    public T obtener(int indice) throws Exception {
        if (!estaVacia()) {
            elementos<T> element = null;
            elementos<T> temp = this.inicio;
            for (int i = 0; i < this.tamanio(); i++) {

                if (indice == temp.getIndice()) {
                    element = temp;
                }
                temp = temp.getSiguiente();
            }
            if (element == null) {
                throw new Exception("Index fuera de rango");
            }
            return (T) element.getDato();
        } else {
            throw new Exception("La lista esta vacia!");
        }
    }
    //Capturar indice de un arraylist

    public int get(int index) {
        return index;
    }

    public Object EliminarNodo(int index) {
        Nodo temporal = cabeza;
        if (index == 0) {
            cabeza = cabeza.obtenerSiguiente();
        } else {
            int contador = 0;

            while (contador < index - 1) {
                temporal = temporal.obtenerSiguiente();
                contador++;
            }
            temporal.enlazarSiguiente(temporal.obtenerSiguiente().obtenerSiguiente());
        }

        tamanio--;
        return temporal.toString();
    }
}
