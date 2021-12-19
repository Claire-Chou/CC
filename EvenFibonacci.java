
/**
 * Adds all of the even fibonacci numbers that don't exceed 4 million.
 *
 * @author (Claire Chou)
 * @version (12/19/21)
 */

public class EvenFibonacci
{
    public static void main(String[] args)
    {
        int a=1;
        int b=1;
        int total=0;
        int c=a+b;
        while (c<4000000){
            if (c%2==0){
                total+=c;
            }
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println("Sum of all elements: " + total);
    }
}