/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Preparaduria_Interfaces_2;

/**
 *
 * @author andresbucarello
 */
public class Contador {
    private int numero;

    public Contador() {
        this.numero=0;
    }

    public Contador(int numero) {
        this.numero = numero;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }
    
    public void sumar(int num){
        numero+=num;
    }
    
    public void restar(int num){
        numero-=num;
    }
    
    public void multiplicar(int num){
        numero=numero*num;
 
    }
    
    public void setNumero(int num){
        this.numero=num;
    }
}
