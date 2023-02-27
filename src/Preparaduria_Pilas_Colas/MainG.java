package Preparaduria_Pilas_Colas;

//  @author andresbucarello

import javax.swing.JOptionPane;


public class MainG {

    public static void main(String[] args) {
        PilaG<Integer> pila = new PilaG<>();
        
        NodoG<Integer> nuevo1=new NodoG<>(1);
        pila.push(nuevo1);
        
        NodoG<Integer> nuevo2=new NodoG<>(2);
        pila.push(nuevo2);
        
        NodoG<Integer> nuevo3=new NodoG<>(3);
        pila.push(nuevo3);
        
        NodoG<Integer> nuevo4=new NodoG<>(4);
        pila.push(nuevo4);
        
        String printStack = "";
        int contador = 1;
        String pila_completa = pila.print(printStack,contador);

        JOptionPane.showMessageDialog(null,pila_completa);
    }

}
