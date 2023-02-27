/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Preparaduria_2;

// @author andresbucarello

public class Nodo {
        
        private Object elemento;
        private Nodo siguiente;
        
        public Nodo(Object elemento){
                this.elemento=elemento;
                this.siguiente=null;     
        }
        
        public Nodo(){
                this.elemento="";
                this.siguiente=null;
        }
        
        public Nodo(Object elemento,Nodo nodo){
                this.elemento=elemento;
                this.siguiente=nodo;
                
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
