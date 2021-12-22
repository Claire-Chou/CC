
/**
 * Write a description of class LCM here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LCM
{
    public static int leastCommonMult()
    {
        int product=20;
        for (int i=20;i>10;i--){
            product*=i/gcf(product,i);
        }
         return product;
    }
    public static int gcf(int a, int b) {
        if (a == 0 && b ==0) {
            return 0;
        }
        else if (a==0) {
            return Math.abs(b);
        }
        else if (b==0) {
            return Math.abs(a);
        }
        else if (a==b) {
            return Math.abs(a);
        }
        else {
            a = Math.abs(a);
            b = Math.abs(b);            
            while (a != b) {
                if (a > b) {
                    a = a-b;
                }
                else {
                    b = b-a;             
                }
            }
            return Math.abs(b);
        }
    }
    public static void main(String args[]) { 
        System.out.println(leastCommonMult());
    }
}
