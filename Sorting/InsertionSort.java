package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int currEle = arr[i];   // store value
            int prevEle = i - 1;

            // shift elements to the right
            while (prevEle >= 0 && arr[prevEle] > currEle) {
                arr[prevEle + 1] = arr[prevEle];
                prevEle--;
            }

            // insert current element at correct position
            arr[prevEle + 1] = currEle;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
