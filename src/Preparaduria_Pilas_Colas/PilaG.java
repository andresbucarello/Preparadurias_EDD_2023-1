package Preparaduria_Pilas_Colas;

// @author andresbucarello

import javax.swing.JOptionPane;


public class PilaG<T> {
    
    private NodoG<T> top;
    private NodoG<T> base;
    private int tamanio;
    
    public PilaG(){
        this.top = null;
        this.base = null;
        this.tamanio = 0;
    }
    
    
    /**
     * @return the top
     */
    public NodoG<T> getTop() {
        return top;
    }

    /**
     * @param top the top to set
     */
    public void setTop(NodoG<T> top) {
        this.top = top;
    }

    /**
     * @return the base
     */
    public NodoG<T> getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(NodoG<T> base) {
        this.base = base;
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
    
    public boolean esVacio(){
        return top == null;
    }
    
    public void vaciar(){
        this.top = null;
        this.base = null;
        this.tamanio = 0;
    }
    
    public void push(NodoG<T> nuevo){
        if(esVacio()){
            this.top = nuevo;
            this.base = nuevo;
        }else{
            nuevo.setSiguiente(this.top);
            this.top = nuevo;
        }
        tamanio ++;
    }
    
    public void pop(){
        if(esVacio()){
            JOptionPane.showMessageDialog(null, " ERROR, ESTA VACIO ");
        }else if(this.tamanio == 1){
            vaciar();
        }else{
            this.top=this.top.getSiguiente();
            tamanio --;
        }
    }
    
    public NodoG<T> popReturn(){
        if(esVacio()){
            JOptionPane.showMessageDialog(null, " ERROR, ESTA VACIO ");
            return null;
        }else if(this.tamanio == 1){
            vaciar();
            return this.top;
        }else{
            NodoG<T> aux = top;
            this.top = this.top.getSiguiente();
            aux.setSiguiente(null);
            tamanio --;
            return aux;
        }
    }

    public String print(String printStack, int contador){
        if(!this.esVacio()){
            NodoG<T> aux = top;
            this.pop();
            printStack += "Nodo " + contador + ": " + aux.getElemento() + "\n";
            contador ++;
            printStack = print(printStack,contador);
            this.push(aux); 
        }
        return printStack;
    }
}
