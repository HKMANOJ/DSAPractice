package Sorting;

import java.util.Arrays;

public class HeapSort {

   static void sort(int[] arr){

       int N = arr.length;


       for (int i = N / 2 - 1; i >= 0; i--)
           heapify(arr, N, i);


       for (int i = N - 1; i > 0; i--) {

           int temp = arr[0];
           arr[0] = arr[i];
           arr[i] = temp;


           heapify(arr, i, 0);
       }
    }

    private static void heapify(int[] arr, int N, int i) {

        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;


        if (r < N && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;


            heapify(arr, N, largest);
        }


    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,1};

        sort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
