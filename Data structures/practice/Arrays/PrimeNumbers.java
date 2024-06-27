package practice.Arrays;

public class PrimeNumbers {
public static void main(String[] args) {

    countPrime(50000);
}

public static void countPrime(int n){
    boolean[] composites = new boolean[n];
    int limit = (int)Math.sqrt(n);
    composites[0]  = composites[1] = true;
    for(int i = 2 ; i < limit ; i++){
        if(composites[i]==false){
            for(int j = i*i ; j < n ; j += i){
                composites[j] = true;
            }
        }

    }

    for(int k = 2; k < n ;k++){
        if(composites[k] == false){
            System.out.println(k);
        }
    }

 
}
}
