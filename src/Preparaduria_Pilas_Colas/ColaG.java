package Preparaduria_Pilas_Colas;

// @author andresbucarello
public class ColaG<T> {

    private NodoG<T> cabeza;
    private NodoG<T> cola;
    private int tamanio;

    public ColaG() {
        this.cabeza = null;
        this.cola = null;
        this.tamanio = 0;
    }

    public T leerCabeza() {
        return this.cabeza.getElemento();
    }

    public boolean esVacio() {
        return cabeza == null;
    }

    public void vaciar() {
        this.cabeza = null;
        this.cola = null;
        this.tamanio = 0;
    }

    public void encolar(T dato) {
        NodoG<T> nuevo = new NodoG<>(dato);
        if (this.esVacio()) {
            this.cabeza = nuevo;
            this.cola = nuevo;
        } else {
            this.cola.setSiguiente(nuevo);
            this.cola = nuevo;
        }
        this.tamanio++;
    }

    public void desencolar() {
        if (this.esVacio()) {
            System.out.println(" LA COLA ESTA VACIA ");
        } else if (this.tamanio == 1) {
            vaciar();
        } else {
            this.cabeza = this.cabeza.getSiguiente();
            this.tamanio--;
        }
    }

    public int getHigher() {
        return this.getHigherOrLower(true);
    }

    public int getLower() {
        return this.getHigherOrLower(false);
    }

    private int getHigherOrLower(boolean higher) {
        int numero = (Integer) this.cabeza.getElemento();
        for (int i = 0; i < this.tamanio - 2; i++) {
            int actual = (Integer) this.cabeza.getElemento();
            if (higher && actual > numero) {
                numero = actual;
            } else if (!higher && actual < numero) {
                numero = actual;
            }
            this.desencolar();
            this.encolar((T) (Object) actual);
        }
        return numero;
    }

    public void moverElementoACabeza(int numero) {
        while ((Integer) this.cabeza.getElemento() != numero) {
            int actual = (Integer) this.cabeza.getElemento();
            this.desencolar();
            this.encolar((T) (Object) actual);
        }
    }

    public void sortAscendent() {
        this.sort(true);
    }

    public void sortDescendent() {
        this.sort(false);
    }

    private void sort(boolean ascendent) {
        if (!this.esVacio()) {
            int numero = ascendent ? this.getHigher() : this.getLower();
            this.moverElementoACabeza(numero);
            this.desencolar();
            this.sort(ascendent);
            this.encolar((T) (Object) numero);
        }
    }

    public String printQueueRecursive() {
        String queue = printQueueRecursive("");
        this.reverse();
        return queue;
    }

    private String printQueueRecursive(String queue) {
        if (!this.esVacio()) {
            NodoG<T> nodo = this.cabeza;
            queue += nodo.getElemento() + "->";
            this.desencolar();
            queue = this.printQueueRecursive(queue);
            this.encolar(nodo.getElemento()); // no se si funciones asi || pilas y colas 38:02
            return queue;
        }
        return queue;
    }

    public void reverse() {
        if (!this.esVacio()) {
            NodoG<T> nodo = this.cabeza;
            this.desencolar();
            this.reverse();
            this.encolar(nodo.getElemento()); //pilas y colas 37:19
        }
    }

    public String printCola() {
        String printCola = "";
        for (int i = 0; i < this.tamanio; i++) {
            NodoG<T> actual = this.cabeza;
            printCola += actual.getElemento() + " -> ";
            desencolar();
            encolar(actual.getElemento());
        }
        return printCola + "//";
    }

    /*public String print(){
        if(!this.esVacio()){
            String printCola = "";
            for (int i = 0; i < this.tamanio; i++) {
                NodoG<T> actual = this.cabeza;
                desencolar();
                printCola += " Nodo " + i + ": " + actual.getElemento() + "\n";
                // printCola += actual.getElemento + " ---> ";
                //encolar(actual);
            }
            return printCola;
        }
         return null;
    }*/
    /**
     * @return the cabeza
     */
    public NodoG<T> getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(NodoG<T> cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * @return the cola
     */
    public NodoG<T> getCola() {
        return cola;
    }

    /**
     * @param cola the cola to set
     */
    public void setCola(NodoG<T> cola) {
        this.cola = cola;
    }

    /**
     * @return the tamanio
     */
    public int getTamanio() {
        return tamanio;
    }

    /**
     * @param tamanio the tamanio to set
     */
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
