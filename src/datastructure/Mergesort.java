package datastructure;

import java.util.Arrays;

public class Mergesort {
    public void mergeSortAlgo(int[] arr,int start, int end){
        if(start < end){
            int mid  = (end + start) / 2;
            mergeSortAlgo(arr, start, mid);
            mergeSortAlgo(arr,mid  + 1, end);
            merge(arr, start, mid ,end);
        }

    }
    public void merge(int[] data, int start,int mid ,int end){
        int[] temp = new int[end-start + 1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=end){
            if(data[i] <= data[j]){
                temp[k] = data[i];
                i++;
                k++;
            }
            else {
                temp[k] = data[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k] = data[i];
            i++;
            k++;
        }
        while(j<=mid){
            temp[k] = data[j];
            j++;
            k++;
        }
        System.arraycopy(temp,0,data,start,temp.length);
    }

    public static void main(String[] args){
        Mergesort obj = new Mergesort();
        int[] toSort = {9,8,7,6,5,4,3,2,1};
        obj.mergeSortAlgo(toSort,0,toSort.length-1);
        System.out.println("sorted Array" + Arrays.toString(toSort));
    }

}
