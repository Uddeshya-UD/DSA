package sorting;

import java.util.Arrays;

public class Insertion {

    public static void main(String[] args) {
        int[] arr = {3,6,2,1,7,0,9};
        insertionSort(arr);
        System.out.println("insertion sort = "+Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            int current = arr[i];
            int j = i - 1;

            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }
    }
}
