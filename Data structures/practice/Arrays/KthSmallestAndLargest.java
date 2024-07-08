package practice.Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestAndLargest {

    public static void main(String[] args) {
        int[] arr = {1,5,4,3,2};
        int k = 3;
        KthSmallestAndLargest(arr,k);
    
    }

    private static void KthSmallestAndLargest(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }

        System.out.println(pq);

        for (int i = k; i < arr.length; i++) {
            if (arr[i] < pq.peek()) {
                pq.poll();
                pq.add(arr[i]);
            }
        }

        System.out.println(pq.peek());

        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq2.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (arr[i] > pq2.peek()) {
                pq2.poll();
                pq2.add(arr[i]);
            }
        }

        System.out.println(pq2.peek());
        


    }

}
