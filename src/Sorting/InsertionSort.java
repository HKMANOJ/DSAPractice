package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }

    }
    static void swap(int[] arr,int fst,int secnd){
        int temp=arr[fst];
        arr[fst]=arr[secnd];
        arr[secnd]=temp;
    }
}
