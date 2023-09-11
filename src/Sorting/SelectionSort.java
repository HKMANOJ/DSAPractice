package Sorting;


import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 1};
        slectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
        static void slectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getMax(arr, 0, last);

            swap(arr,max,last);
        }

    }

    static int getMax(int[] arr, int start, int last) {
        int max=start;
        for (int j = 0; j <=last ; j++) {
            if (arr[max]<arr[j]){
                max=j;
            }
        }
        return max;
    }
    static void swap(int[] arr,int fst,int secnd){
        int temp=arr[fst];
        arr[fst]=arr[secnd];
        arr[secnd]=temp;
    }
}
