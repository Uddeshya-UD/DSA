package practice.Arrays;

public class MinMaxFinder {

       public static void main(String[] args) {
        minMaxFinder(new int[]{1,54,7,3,5});
       }
   

public static void minMaxFinder(int[] arr){

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for(int element : arr){
        if(element < min){
            min = element;
        }
    }

    for(int element : arr){
        if(element > max){
            max = element;
        }
    }

    System.out.println("min = "+min);
    System.out.println("max = "+max);
}
}