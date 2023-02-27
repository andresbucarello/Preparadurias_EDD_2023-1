/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Preparaduria_Recursividad;

/**
 *
 * @author andresbucarello
 */
public class Funciones {
    
    public Funciones(){
    
    }
    
    public void mostrar(String cadena){
        System.out.println("La cadena es: "+ cadena);
    }
    
    public String crearEstudiante(String nombre, int carnet){
        String alumno="Nombre: "+nombre +"\nCarnet: "+Integer.toString(carnet);
        return alumno;
    }
    
    public void count(int i){
        if (i<11){
            System.out.println(i);    // Si invertimos esto imprime en orden inverso
            this.count(i + 1);
        }
    }
    
    public int[] orderDescArray(int[] array, int i){
        if (i < array.length) {
            int higher = array[0];
            int k = 0;
            for (int j = 1; j < array.length; j++){
                if (higher < array[j]) {
                    higher = array[j];
                    k= j;
                }
            }
            array[k] = -1;
            array = orderDescArray(array, i + 1);
            array[i] = higher;
            return array; 
        }
        return array;
    }
    
}
