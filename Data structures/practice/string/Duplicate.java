package practice.string;

class Duplicate {

    public static int ifDuplicate(String S) {
        int end = S.length();

       boolean[] b = new boolean[256];

        for(int i=0 ; i<end;i++){
            char value = S.charAt(i);
            if(b[value] == true){
                return 1;
            } else {
                b[value] = true;
            }
        }

        return 0; 


    }
        
        


    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(ifDuplicate(args[0]));
        } else {
            System.out.println("No string provided.");
        }
    }
}