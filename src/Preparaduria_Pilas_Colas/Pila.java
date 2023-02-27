package Preparaduria_Pilas_Colas;

// @author andresbucarello

import javax.swing.JOptionPane;

public class Pila{
    
    private Nodo top;
    private Nodo base;
    private int tamanio;
    
    public Pila(){
        this.top=null;  
        this.base=null;
        this.tamanio=0;
    }
    
    /**
     * @return the top
     */
    public Nodo getTop() {
        return top;
    }

    /**
     * @param top the top to set
     */
    public void setTop(Nodo top) {
        this.top = top;
    }

    /**
     * @return the base
     */
    public Nodo getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(Nodo base) {
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
        top = null;
        base = null;
        tamanio = 0;
    }
    
    public void push(Nodo nuevo){ // apilar 
        if(this.esVacio()){
            top = nuevo;
            base = nuevo;
        }else{
            nuevo.setSiguiente(top);
            top = nuevo;
        }
        tamanio++;
    }
    
    public void pop(){ //desapilar
        if(esVacio()){
            JOptionPane.showMessageDialog(null, " LA PILA ESTA VACIA ");
        }else if(tamanio==1){
            this.vaciar();
        }else{
//            top.setSiguiente(null);
            top = top.getSiguiente();
            tamanio--;
        }
    }
    
    public Nodo popReturn(){ //desapilar que retorna
        Nodo aux=null;
        if(this.esVacio()){
            JOptionPane.showMessageDialog(null, " LA PILA ESTA VACIA ");
            return aux;
        }else if(tamanio==1){
            aux = top;
            this.vaciar();
            return aux;
        }else{
            aux = top;
            top = top.getSiguiente();
            tamanio--;
            aux.setSiguiente(null);
            return aux;
        }
    }
    
    public String print(String printStack, int contador){
        if(!this.esVacio()){
            Nodo aux = top;
            this.pop();
            printStack += "Nodo " + contador + ": " + aux.getElemento() + "\n";
            contador ++;
            printStack = print(printStack,contador);
            this.push(aux); 
        }
        return printStack;
    }
}