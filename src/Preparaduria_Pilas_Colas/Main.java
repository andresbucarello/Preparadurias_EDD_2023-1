package Preparaduria_Pilas_Colas;

//  @author andresbucarello

import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        Pila pila = new Pila();
        
        Nodo nuevo1=new Nodo(1);
        pila.push(nuevo1);
        
        Nodo nuevo2=new Nodo(2);
        pila.push(nuevo2);
        
        Nodo nuevo3=new Nodo(3);
        pila.push(nuevo3);
        
        Nodo nuevo4=new Nodo(4);
        pila.push(nuevo4);
        
        String printStack = "";
        int contador = 1;
        String pila_completa = pila.print(printStack,contador);

        JOptionPane.showMessageDialog(null,pila_completa);
    }
}
