 package Preparaduria_Pilas_Colas;

// @author andresbucarello

public class NodoG<T> {
    
    private T elemento;
    private NodoG<T> siguiente;
    
    public NodoG(T elemento){
        this.elemento = elemento;
        this.siguiente = null;
    }

    /**
     * @return the elemento
     */
    public T getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the siguiente
     */
    public NodoG<T> getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoG<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
