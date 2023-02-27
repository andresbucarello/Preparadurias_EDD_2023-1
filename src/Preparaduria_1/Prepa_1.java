package Preparaduria_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

//@author andresbucarello
public class Prepa_1 {

    public static void main(String[] args) {

        // ************     DECLARAR VARIABLES     ***********
        String name;
        name = "HOLA";

        int number = 20;

        double decimal = 19.5;

        System.out.println(name + " " + number);

        // ************     CASTEAR     ***********
        String numberS = "1998";
        // int numero=numberS; || Problema
        int numero = Integer.parseInt(numberS); // Solucion

        float numero1 = 19.5f; // o float numero = (float)19.5;

        char ch = 'a';
        // String str= ch; || Problema
        String str = Character.toString(ch);

        // ************     INPUT CON SCANNER     ***********
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println(" Nombre: ");
        nombre = entrada.next();
        System.out.println(nombre);

        // ************     INPUT CON SCANNER     ***********
        String cadena = JOptionPane.showInputDialog(" Frase: ");
        JOptionPane.showMessageDialog(null, cadena);

        // El orden de los caracteres es importante
        int x = Integer.parseInt(JOptionPane.showInputDialog(" Numero 1: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog(" Numero 2: "));

        y = x++;

        JOptionPane.showMessageDialog(null, y);
        JOptionPane.showMessageDialog(null, x);

        // ************     RAIZ CUADRADA     ***********
        double raiz = Math.sqrt(4);

        // ************     ELEVAR AL CUADRADO      ***********
        float elevar = (float) Math.pow(4, 2);

        /* ************     ESTRUCTURA DE IF    ***********
        if(condicion){
                BLOQUE DE CODIGO
        
        }else if (condicion2){
                BLOQUE DE CODIGO
        
        }else{
                BLOQUE DE CODIGO
        }
         */
        
        /* ************     SWITCH    ***********
        int num =2;
        switch(num){
            case 1:
                    BLOQUE DE CODIGO
                    Break;
            default:
                    BLOQUE DE CODIGO
        }*/
        
        /* ************     WHILE    ***********
         while (condicion){   
                BLOQUE DE CODIGO
         }
         */
        
        /* ************     DO WHILE    ***********
         do{
                BLOQUE DE CODIGO
         }while(condicion);
         */
        
        /* ************     FOR    ***********
        for (int i = 0; i < 5; i++) { 
                //Bloque de codigo
        }
        */
        
        /* ************     ARREGLOS    ***********
        
        String Palabras[];
        
        String[] Palabras= new String[5];
        
        Palabras[index]=dato AGREGAR O REEMPLAZAR DATOS
        
        Palabras.length
        
        RECORRER UN ARREGLO:
        
        String[] palabras = {"A",B","C"}
        for (int i=0; i < palabras.length, i++){
                sout(palabras[i];
        }
        
        for (String i: palabras){
                sout(i)
        }
        */
        
        /* ************     MATRICES    ***********
        
        int [][] matriz= new int[2][2];
        matriz = {{1,2},{3,4}};
        matriz[0][1]=10
        
        */
        
        
    }

}
