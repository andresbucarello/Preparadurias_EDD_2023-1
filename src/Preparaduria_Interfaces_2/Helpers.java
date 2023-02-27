/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Preparaduria_Interfaces_2;

import javax.swing.JOptionPane;

/**
 *
 * @author andresbucarello
 */
public class Helpers {
    public static int validarNumero(String numString){
        int num;
        
        try{
            num=Integer.parseInt(numString);
            return num;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " ERROR No es un numero ");
        }
        return 0;
    }
    
}
