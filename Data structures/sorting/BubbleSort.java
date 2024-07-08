package sorting;

import java.util.Arrays;

public class BubbleSort {
    
    public static void bubbleSort(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length-1; i++) {
            
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
            
        }

    }

    public static void main(String[] args) {
        int[] arr = {3,6,2,1,7,0,9};
        bubbleSort(arr);
        System.out.println("bubble sort = "+Arrays.toString(arr));
    }
}


