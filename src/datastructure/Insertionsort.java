package datastructure;

public class Insertionsort {

    public void sort(int[] arr){
        for(int i = 1; i<=arr.length-1;i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key ){
                arr[j +1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }

    }
    public static void main(String[] args){
        int[] arr = {5,3,1,9,8,55};
        Insertionsort  obj = new Insertionsort();
        obj.sort(arr);
        for(int i = 0; i <= arr.length -1 ; i++){
            System.out.println(arr[i]);
        }
    }
}
