package controller;

/**
 *
 * @author yonier
 * @param <T>
 */
public class Listas<T> {

    /**
     *
     * @param <T>
     */
    private class elementos<T> {

        //Declaro variables a utilizar
        private T dato;
        private int indice;
        private elementos siguiente;

        /**
         *
         * @param dato
         * @param index
         */
        //inicializo objetos
        public elementos(T dato, int indice) {
            this.dato = dato;
            this.indice = indice;
            this.siguiente = null;
        }

        /**
         *
         * @param index
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
        int tamanio = 0;
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
            throw new Exception("Pila Vacia");
        }
    }
}
