
/**
 * Write a description of class LargestPalindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LargestPalindrome
{
    public static int bigPalindrome()
    {
        
        int product=0;
        for (int i=1998;i>=200;i--){
            int num=(int)Math.ceil(i/2.0);
            if(num*(i-num)<product){
                break;
            }
            for (int j= (int)Math.ceil(i/2.0);j<=Math.min(i-100, 999);j++){
                int candidate=j*(i-j);
                if(candidate>=product){
                    if (isPalindrome(candidate)){
                        product=candidate;
                    }
                }
            }
        }
        return product;
    }
    public static boolean isPalindrome(int x)
    {
        
        int ogNumber=x;
        int reversedNumber=0;
        int remainder;
        while (x != 0) {
          remainder = x % 10;
          reversedNumber = reversedNumber * 10 + remainder;
          x/= 10;
        }
        if(ogNumber==reversedNumber){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]) {
      System.out.println(bigPalindrome());
    }
}
