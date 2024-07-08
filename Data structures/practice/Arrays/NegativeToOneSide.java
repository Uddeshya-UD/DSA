package practice.Arrays;

import java.util.Arrays;

public class NegativeToOneSide {

    public static void main(String[] args) {
        int arr[] = {-1, -2, 0, 1, -2, 2, 1};
        negativeToSide(arr, arr.length);
    }

    private static void negativeToSide(int[] arr, int n) {
        int low = 0, mid = 0;

        while (mid < n) {
            if (arr[mid] < 0) {
                swap(arr, mid, low);
                low++;
            }
            mid++;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}