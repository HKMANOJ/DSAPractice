package Sorting;

import java.util.Arrays;

public class MissingNumber {


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5 ,0};
        int N= args.length;
        missingNumber(arr);
       ///  Missing number using Cycle Sort

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]!=i){
                System.out.println(i);
            }
        }

    }

    private static void missingNumber(int[] arr) {
        int i=0;
        while (i<arr.length){
            int cur=arr[i];
            if(arr[i]< arr.length && arr[i]!=arr[cur]){
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


