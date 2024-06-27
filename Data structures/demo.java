import java.util.Arrays;


public class demo {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] slice = Arrays.copyOfRange(arr,0,3);
        
        System.out.println("hello");
        System.out.println(Arrays.toString(slice));
    }
}