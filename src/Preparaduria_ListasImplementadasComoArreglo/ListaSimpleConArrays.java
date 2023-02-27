/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Preparaduria_ListasImplementadasComoArreglo;

// @author andresbucarello
public class ListaSimpleConArrays<T> {

    private int first;
    private int last;
    private int size;
    private Nodo[] array;

    public ListaSimpleConArrays(int max) {
        this.first = this.last = -1;
        this.size = 0;
        this.array = new Nodo[max];
    }

    public void empty() {
        this.first = this.last = -1;
        this.size = 0;
        this.array = new Nodo[this.array.length];
    }

    public boolean isEmpty() {
        return first == -1;
    }

    public boolean isFull() {
        return size == this.array.length;
    }

    public int searchEmptyslot() {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void addAtTheStart(T data) {
        if (!this.isFull()) {
            Nodo nodo = new Nodo(data);
            int position = this.searchEmptyslot();
            this.array[position] = nodo;
            if (this.isEmpty()) {
                this.first = this.last = position;
            } else {
                this.array[position].setNext(this.first);
                this.first = position;
            }
            this.size++;
        }
    }

    public void addAtTheEnd(T data) {
        if (!this.isFull()) {
            Nodo nodo = new Nodo(data);
            int position = this.searchEmptyslot();
            this.array[position] = nodo;
            if (this.isEmpty()) {
                this.first = this.last = position;
            } else {
                this.array[this.last].setNext(position);
                this.last = position;
            }
            this.size++;
        }
    }

    public String printlist() {
        String list = "";
        int position = this.first;
        while (position != -1) {
            list += this.array[position].getData() + "->";
            position = this.array[position].getNext();
        }
        return list + "//";
    }

    public void insertordered(T data) {
        if(!this.isFull()){
            if (this.isEmpty()) {
                this.addAtTheStart(data);
            }else if (String.valueOf(data).compareToIgnoreCase(String.valueOf(this.array[this.first].getData()))<=0){
                this.addAtTheStart(data);
            }else if (String.valueOf(data).compareToIgnoreCase(String.valueOf(this.array[this.last].getData()))>=0){
                this.addAtTheEnd(data);
            }else{
                int previous=this.first;
                int current=this.array[this.first].getNext();
                while (String.valueOf(data).compareToIgnoreCase(String.valueOf(this.array[current].getData()))>0){
                    previous=current;
                    current=this.array[current].getNext();  
                }
                Nodo nodo=new Nodo(data);
                int position= this.searchEmptyslot();
                this.array[position]=nodo;
                this.array[previous].setNext(position);
                this.array[position].setNext(current);
                size ++;
            }
        }
    }
    
    // @return the first
    public int getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(int first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public int getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(int last) {
        this.last = last;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the array
     */
    public Nodo[] getArray() {
        return array;
    }

    /**
     * @param array the array to set
     */
    public void setArray(Nodo[] array) {
        this.array = array;
    }

}
