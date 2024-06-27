package practice.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {
        List<int[]> result = twoSum(new int[]{1,2,3,4,5} , 6);
        for(int[] element : result){
            System.out.println("{"+element[0]+","+element[1]+"}");
        }
    }

    private static List<int[]> twoSum(int[] arr , int target) {
         List<int[]> result = new ArrayList<>();
         HashMap<Integer , Integer> map = new HashMap<>();
         for(int i=0; i<arr.length;i++){
            int compliment = target - arr[i];
            if(map.containsKey(compliment)){
                result.add(new int[]{compliment, arr[i]}) ;
            } else {
                map.put(arr[i] , i);
                System.out.println(arr[i]+","+i);
            }
         }
        return result;

        
    }

}
