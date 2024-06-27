package practice.string;

/**
 * reverse
 */
public class Reverse {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        printArray(arr, 5);
        
}

static void printArray(int arr[], int size) { 
    for (int i = 0; i < size; i++) 
        System.out.print(arr[i] + " "); 
    System.out.println(); 
} 

public static void reverse(int[] arr){
    int[] newArr = new int[arr.length];

    int first = 0;
    int last = arr.length - 1;
    int temp = 0;
    while(first < last){
        temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
        first++;
        last--;
    }
}
}