package sorting;

import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 7, 0, 9};
        selectionSort(arr);
        System.out.println("selection sort = " + Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

        }
    }


}
