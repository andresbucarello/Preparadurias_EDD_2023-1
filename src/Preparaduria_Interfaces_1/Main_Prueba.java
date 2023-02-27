package Preparaduria_Interfaces_1;

//  @author andresbucarello

import java.util.Arrays;

public class Main_Prueba {

    public static void main(String[] args) {
        
        // *********    CADENAS     **********
        String cadena;
        cadena="hola";
        System.out.println(cadena.toUpperCase()); //cadena.toLowerCase()
        
        System.out.println(cadena.length());
        
        int numeros[]={1,2,3,4,5,6,7,8,9,10};
        
        System.out.println(numeros.length); // NO LLEEVA PARENTSIS
        
        System.out.println(cadena.charAt(0));
        
        char caracter='j';
        System.out.println((int)caracter); // VALOR D ASCII
        
        String cadena2="1,2,3,4,5,6,7,8,9";
        String[] arreglo=cadena2.split(",");    // SPLIT
        String chain=cadena2.replace(",", "/");     // REPLACE
        System.out.println(chain);
        
        System.out.println(arreglo);
        System.out.println(Arrays.toString(arreglo));
        
        String blanco="";
        String blanco2="             ";
        System.out.println(blanco.isBlank());
        System.out.println(blanco2.isBlank());
        
        String blanco3="";
        System.out.println(blanco3.isEmpty()); 
        
        String palabra1="Hola";
        String palabra2="Hola";
        System.out.println(palabra1.equals(palabra2));
        
        String palabra3="ol";
        System.out.println(palabra1.contains(palabra3));
        
        String palabra4="arbol";
        System.out.println(palabra2.compareTo(palabra4));   // TOMA EN CUENTA LAS MAYUSCULAS
        System.out.println(palabra2.compareToIgnoreCase(palabra4));     // NO TOMA EN CUENTA 
        
        
        
        
        
        
    }

}
