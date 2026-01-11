package Sorting;
import java.util.*;
public class SelectionSort {
    public static void selectionSort(int[] arr){
        //counting turns
        for(int i=0; i<arr.length-1; i++){
            int minIndex=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }//swap
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args){
        int[] arr= {64,25,12,22,11};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
