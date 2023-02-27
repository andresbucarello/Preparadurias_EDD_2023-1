/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Preparaduria_ArchivosTXT;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;   
import java.io.PrintWriter;
import javax.swing.JOptionPane;

// @author andresbucarello

public class Funciones {
    
    public void escribir_txt(ListaSimple clientes){
        String clientes_actuales="";
        if (!clientes.esta_vacia()){
            NodoCliente temp=clientes.getInicio();
            for (int i = 0; i < clientes.getTamanio(); i++) {
                clientes_actuales+=temp.getNombre()+","+temp.getCedula()+"\n";
                temp=temp.getSiguiente();
            }
        }
        try{
            PrintWriter pw = new PrintWriter ("test\\clientes.txt");
            pw.print (clientes_actuales);
            pw.append("Samuel,27483764");
            pw.append ("\n");
            pw.append ("Antonio, 29837463");
            pw.close();
            JOptionPane. showMessageDialog(null, "Guardado exitoso.");
        }catch(Exception e){
            JOptionPane.showInputDialog(null, e);  
        }
    }
    
    public ListaSimple leer_txt(){ 
        ListaSimple clientes = new ListaSimple ();
        String line;
        String clientes_txt ="";
        String path = "test//clientes.txt";
        File file = new File (path);
        try{
            if (!file.exists ()){
                file.createNewFile ();
            }else{
                FileReader fr = new FileReader (file);
                BufferedReader br = new BufferedReader (fr);
                while ((line = br.readLine()) != null){
                    if (!line.isEmpty ()){
                        clientes_txt += line;
                    }
                }
                if(!"".equals(clientes_txt)){
                    String[] clientes_split = clientes_txt.split ("\n");
                    for (int i = 0; i < clientes_split.length; i++){
                        String[] cliente = clientes_split[i].split (",");
                         clientes.agregar_al_final(cliente[0],Integer.parseInt(cliente[1])); 
                    }    
                }
                br.close();
                JOptionPane.showInputDialog(null, " Lectura exitosa ");
            }
        }catch (Exception e){
            JOptionPane.showInputDialog(null, " Error al leer los clientes: ");
        }
        return clientes;
            
        
        }
    
}
