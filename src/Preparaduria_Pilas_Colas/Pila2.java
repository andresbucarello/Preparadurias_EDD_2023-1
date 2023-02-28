package Preparaduria_Pilas_Colas;

// @author andresbucarello

import javax.swing.JOptionPane;

public class Pila2{

    private Nodo top;
    private int tamanio;

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

    public boolean esVacio() {
        return top == null;
    }

    public Object leerTop() {
        return top.getElemento();
    }
    
    public void desapilar(){
        if(!esVacio()){
            top = top.getSiguiente();
            tamanio--;
        }
    }
    
    public void apilar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (esVacio()){ 
            this.top = nuevo;
        } else {
            Nodo aux = getTop();
            nuevo.setSiguiente(aux);
            this.top = nuevo;
        }
        tamanio++;
    }
    
    public int buscarMax(){
        int primero = (Integer) leerTop();
        return buscarMaxOrLower(primero,true);
    }
    
    public int buscarMin(){
        int primero = (Integer) leerTop();
        return buscarMaxOrLower(primero,false);
    }
    
    private int buscarMaxOrLower(int primero,boolean higher){
        int num , max;
        max = primero;
        if(!esVacio()){
            num = (Integer) leerTop();
            desapilar();
            if(higher && num > max){
                max = num;
            }else if(!higher && num < max){
                max = num;
            }
            max = buscarMaxOrLower(max,higher);
            
            apilar(num);
        }
        return max;
    }
    
    public void imprimir(){
        if(esVacio() == false){
            Nodo aux = top;
            for (int i = 0; i < this.tamanio; i++) {
                System.out.println(aux.getElemento() + ", ");
                aux = aux.getSiguiente();
            }
            System.out.println("");
        }else{
            JOptionPane.showMessageDialog(null, " La pila esta vacia: ");
        }
    }
    
    static void eliminarMedio(Pila2 stack,int tamanioPila,int current){
        if(stack.esVacio() || current == tamanioPila){
            return;
        }
        Object dato = stack.leerTop();
        stack.desapilar();
        
        eliminarMedio(stack, tamanioPila, current + 1);
        if(current != tamanioPila/2){
            stack.apilar(dato);
        }
    }
}