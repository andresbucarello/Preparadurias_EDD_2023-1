package Preparaduria_Recursividad;


//  @author andresbucarello
public class Main {

    public static void main(String[] args) {
        Funciones f=new Funciones();
        int[] array={15,14,12,1,5,24,3,7};
        
        array=f.orderDescArray(array, 0);
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);  
        }  
    }
}
