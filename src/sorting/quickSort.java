package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {
    int[] arr=new int[6];
    }
    static void quick(int[] arr,int low,int high) {
        if (low>=high) {
            return ;
        }
        int s = low;
        int e = high;

        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while(s>=e){
            if(arr[s]<pivot){
                s++;
            }
            if(arr[e]>pivot){
                e--;
            }
        }
        while(s>=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
        }
        quick(arr,low,e);
        quick(arr,s,high);
    }
}
