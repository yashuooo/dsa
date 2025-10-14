public class Hashing{
    public static void main(String[] args) {
        int[] hash= new int[26];

        String str= "hello world";

        for(int i=0; i< str.length(); i++){
            char ch= str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                int index= ch - 'a';
                hash[index]++;
            }
        }

        for(int i=0; i<26; i++) {
            if(hash[i] > 0) {
                char ch = (char) (i + 'a');
                System.out.println(ch + " " + hash[i]);
            }
        }
    }
}