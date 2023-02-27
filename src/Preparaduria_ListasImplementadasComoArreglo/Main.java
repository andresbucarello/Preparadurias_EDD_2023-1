package Preparaduria_ListasImplementadasComoArreglo;

//  @author andresbucarello

public class Main {

    public static void main(String[] args) {
        ListaSimpleConArrays list = new ListaSimpleConArrays(10);
        
        list.insertordered("Andres Bucarello");
        list.insertordered("Luis Perez");
        list.insertordered("Carlos Fernandez");
        
        System.out.println(list.printlist());
    }

}
