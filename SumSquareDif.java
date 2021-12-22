
/**
 * Write a description of class SumSquareDif here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumSquareDif
{
    public static int sumOfSquare()
    {
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i*i;
        }
        return sum;
    }
    public static int squareOfSum()
    {
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i;
        }
        return sum*sum;
    }
    public static void main(String args[]) {
        System.out.println(squareOfSum()-sumOfSquare());
    }
}
