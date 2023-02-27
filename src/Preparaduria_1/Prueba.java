package Preparaduria_1;



//  @author andresbucarello

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Prueba {

    @SuppressWarnings("empty-state ment")
    public static void main(String[] args) {
        // TODO code applica tion logic here
        Scanner entrada = new Scanner(System.in);
        
        boolean verdadero;
        
        // int cant=0; NO FUNCIONA
        int option=0;
        
        do{
            try{
                 // cant=entrada.nextInt(); NO FUNCIONA 
                 option=Integer.valueOf(JOptionPane.showInputDialog(null,"test"));
                 
            }catch (Exception e){
                
                // cant=0; NO FUNCIONA
                 option=0;
            }
            
            }while (option!=1);
        }
       
  
        }              
        
             
        
        
        
                
           

