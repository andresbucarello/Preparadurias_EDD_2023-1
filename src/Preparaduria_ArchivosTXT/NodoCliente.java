/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Preparaduria_ArchivosTXT;

/**
 *
 * @author andresbucarello
 */
public class NodoCliente {
    private NodoCliente siguiente;
    private String nombre;
    private int cedula;

    public NodoCliente(String nombre, int cedula) {
        this.siguiente = null;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    /**
     * @return the siguiente
     */
    public NodoCliente getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCliente siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
    
    
}
