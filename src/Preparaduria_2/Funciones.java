/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Preparaduria_2;

import javax.swing.JOptionPane;

/**
 *
 * @author andresbucarello
 */
public class Funciones {

    private int num;
    private int num2;

    public Funciones() {
    }

    public Funciones(int num, int num2) {
        this.num = num;
        this.num2 = num2;
    }

    // procedimiento = lo que tenga void y Metodo = lo que no es void 
    public int pedir_num() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, " Numero: "));
        return numero;
    }

    public String pedir_nombre() {
        String nombre = JOptionPane.showInputDialog(null, " Numero: ");
        return nombre;
    }

    public int sumar(int num, int num2) {
        return num + num2;
    }

    public void mostrar_resultado(Object palabra) {
        JOptionPane.showInputDialog(null, palabra);
    }

    public void todo() {
        int num = pedir_num();
        int num2 = pedir_num();
        mostrar_resultado(sumar(num, num2));
    }

    public void imprimir(String cadena) {
        System.out.println(cadena);
    }

    public int multiplicarportres(int number) {
        return number * 3;
    }

    public boolean esnumeroperfecto(int numero) {
        int total = 0;

        for (int i = 1; i < Math.round(numero / 2) + 1; i++) {
            if (numero % i == 0) {
                total += i;
            }

        }
        return numero == total;
    }

    

}
