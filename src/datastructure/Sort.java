package datastructure;

public class Sort {

    public void mergeSort(int[] tobeSorted,int start, int end){
            if(start < end) {
                int mid = start + (end - start) / 2;
                mergeSort(tobeSorted, 0, mid);
                mergeSort(tobeSorted, mid + 1, end);
                merge(tobeSorted, start, mid, end);
            }
    }
    public void merge(int[] arr, int start, int mid, int end){
        int  i = start;
        int  j = mid + 1;
        int  k = 0;
        int[] newArray = new int[end - start  + 1];
        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                newArray[k]  = arr[i];
                k++;
                i++;
            }
            else{
                newArray[k] = arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            newArray[k] = arr[i];
            k++;
            i++;
        }
        while(j<=end){
            newArray[k] = arr[j];
            k++;
            j++;
        }
        System.arraycopy(newArray,0,arr,start,newArray.length);

    }

    public static void main(String[] args){
        Sort obj = new Sort();
        int[] arr = {4,5,6,73,1,9};
         obj.mergeSort(arr,0,arr.length-1 );
         for(int i = 0; i<arr.length;i++){
             System.out.println(arr[i]);
         }
    }
}
