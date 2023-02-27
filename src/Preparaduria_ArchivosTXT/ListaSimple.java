/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Preparaduria_ArchivosTXT;

import Preparaduria_2.Nodo;

/**
 *
 * @author andresbucarello
 */
public class ListaSimple {
    private NodoCliente inicio;
    private NodoCliente fin;
    private int tamanio;

    public ListaSimple() {
        inicio=null;
        fin=null;
        tamanio=0;
    }
    public boolean esta_vacia(){
        return tamanio==0;
    }
    
    public void agregar_al_final(String nombre, int cedula){
        NodoCliente nuevo=new NodoCliente(nombre,cedula);
        if(esta_vacia()){
            this.inicio=nuevo;
            this.fin=nuevo;
        }else{
            NodoCliente aux=this.fin;
            aux.setSiguiente(nuevo);
            this.fin=nuevo;
        }tamanio+=1;
    }
    
//    public void reverse() {
//        Node node = this.deletaAtTheStart();
//        if (node != null) {
//            this.reverse();
//            this.addAtTheEnd(node.getElement());
//        }
//    }

    /**
     * @return the inicio
     */
    public NodoCliente getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(NodoCliente inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fin
     */
    public NodoCliente getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(NodoCliente fin) {
        this.fin = fin;
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
