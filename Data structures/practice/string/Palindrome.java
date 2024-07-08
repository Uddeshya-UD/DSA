package practice.string;

class Palindrome {

    public static int ifPalindromeString(String S) {
        int start = 0;
        int end = S.length() - 1;
        
        while(start <= end){
            if(S.charAt(start)!=(S.charAt(end))){
                return 0;
            } else {
                start ++;
                end--;
            }
        }
        return 1;
    }


    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(ifPalindromeString(args[0]));
        } else {
            System.out.println("No string provided.");
        }
    }
}