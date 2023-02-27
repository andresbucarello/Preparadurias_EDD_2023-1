package Preparaduria_Pilas_Colas;

// @author andresbucarello

public class Nodo {
        
    private Object elemento;
    private Nodo siguiente;
    
    public Nodo(Object dato){
        this.elemento=dato;
        this.siguiente=null;
    }

    /**
     * @return the elemento
     */
    public Object getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}