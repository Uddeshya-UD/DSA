package practice.Arrays;

import java.util.Arrays;



//
//
//
//  DUTCH FLAG ALGO --> 3 parts
//
//
//
//


public class O12SortAlgo {

    public static void main(String[] args) {
        int arr[] = {0,1,0,1,2,2,1};

        ZeroOneTwoSort(arr,arr.length);

    }

    private static void ZeroOneTwoSort(int arr[], int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1 ;

        while(mid <= high){
            switch (arr[mid]) {
                case 0 -> {
                    swap(arr,low,mid);
                    mid++;
                    low++;
                }
                case 1 -> mid++;
                default -> {
                    swap(arr, mid,high);
                    high --;
                }
            }
        }
        

        System.out.println("Sorted Array : "+Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
