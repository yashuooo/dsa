public class StringPalindrome {
    public boolean isPalindrome( int i, String str, int n) {
        if (i>= n/2)
        return true;
        if(str.charAt(i) != str.charAt(n-i-1))
        return false;

        return isPalindrome(i+1, str, n);
    }

    public static void main (String[] args) {

        String str= "madasm";
        int n= str.length();
        StringPalindrome obj= new StringPalindrome();
        boolean result= obj.isPalindrome(0, str, n);
        System.out.println(result);
    }
}