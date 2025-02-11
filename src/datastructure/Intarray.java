package datastructure;

import java.util.Iterator;

public class Intarray implements Iterable<Integer>{
    private final static int DEFAULT = 1 << 3;
    private int[] arr;
    public  int len = 0;
    private int capacity = 0;

    public Intarray(){
        this(DEFAULT);
    }
    public Intarray(int capacity){
        if(capacity < 0) {
            throw new IllegalArgumentException("Illegal capacity" + capacity);
        }
        this.arr = new int[capacity];
        this.capacity = capacity;
    }
    public int size(){
        return len;
    }
    public int getCapacity(){
        return capacity;
    }
    public boolean isEmpty(){
       return len == 0;
    }
    public int get(int index){
        return arr[index];
    }
    public void  set(int index, int elem){
        arr[index] = elem;
    }
    public void add(int elem) {
        if (len + 1 >= capacity) {
            capacity = capacity * 2;
            arr = java.util.Arrays.copyOf(arr, capacity);
        }
        arr[len++] = elem;
    }
    public void removeAt(int index){
        System.arraycopy(arr,index +1, arr, index, len-index-1 );
        --len;
        --capacity;
    }
    public boolean remove(int elem){
        for(int i = 0; i<len; i++){
            if(arr[i] == elem) {
                removeAt(i);
                return true;
            }
        }
        return false;
    }
    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
    public static  void main(String[] args){
        Intarray ar = new Intarray(2);
        ar.add(5);
        ar.add(10);
        ar.add(59);
        ar.removeAt(1);
        System.out.println(ar.getCapacity());
        for(int i = 0; i<ar.size(); i++){
            System.out.println(ar.get(i));
        }
    }
}
