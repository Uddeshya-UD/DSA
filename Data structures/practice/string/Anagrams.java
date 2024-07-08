package practice.string;

class Anagrams {

    public static int isAnagram(String s, String t) {

        int m = s.length();
        int n = t.length();

        if(m != n){
            return 0;
        } else {
            int[] count = new int[26];
            for(int i=0;i<s.length();i++){
                count[s.charAt(i) - 'a']++;
            }

            for(int i=0;i<t.length();i++){
                count[t.charAt(i) - 'a']--;
            }
            
            for(int i=0;i<count.length;i++){
                if(count[i] != 0){
                    return 0;
                }
            }
            return 1;
        

        }
        
    }
        
        


    public static void main(String[] args) {
        String s = "asnagram";
        String t = "nsaagram";
        System.out.println(isAnagram(s, t));
        
    }
}