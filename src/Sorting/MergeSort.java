package Sorting;

import com.sun.javafx.binding.SelectBinding;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={2,4,5,16,78,4};
        int n=arr.length;
     arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }

     static int[] mergeSort(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;

       int[] right = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] left=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merging(left,right);
    }

    private static int[] merging( int[] left, int[] right) {
        int []mix= new int[left.length+right.length];

        int i=0;int j=0;int k=0;
        while(i< left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }else {
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while (i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }

        return mix;
    }


}
