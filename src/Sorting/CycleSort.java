package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 3, 1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cycleSort(int[] arr) {
       int i=0;
       while (i<arr.length){
           int cur=arr[i]-1;
           if(arr[i]!=arr[cur]){
               swap(arr,i,cur);
           }else {
               i++;
           }
       }
    }
    static void swap(int[] arr,int fst,int secnd){
        int temp=arr[fst];
        arr[fst]=arr[secnd];
        arr[secnd]=temp;
    }
}
