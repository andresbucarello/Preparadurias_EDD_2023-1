/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Preparaduria_2;

/**
 *
 * @author andresbucarello
 */
public class Lista {
        
        private Nodo primero;
        private Nodo ultimo;
        private int tamano;

    public Lista() {
        this.primero=null;
        this.ultimo=null;
        this.tamano=0;
    }
    
    public boolean Esvacio(){
            return primero==null;
    }
    
    public void InsertarFinal(Object data){
        Nodo nuevo=new Nodo(data);
        if(Esvacio()){
            primero=nuevo;
            ultimo=nuevo;
        }else{
            Nodo aux=ultimo;
            aux.setSiguiente(nuevo);
            ultimo=nuevo;
        }tamano+=1;
    }
    
    public void Imprimir(){
        if(!Esvacio()){
            Nodo aux=primero;
            for (int i = 0; i < tamano; i++) {
                System.out.println(aux.getElemento());
                
            }
        }else{
            System.out.println("La lista esta vacia");
        }
    }
    
    public void eliminar(){
        if(!Esvacio()){
            primero=primero.getSiguiente();
            tamano-=1;
            
        }
    }

    /**
     * @return the primero
     */
    public Nodo getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    /**
     * @return the ultimo
     */
    public Nodo getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
        
        
    
}
