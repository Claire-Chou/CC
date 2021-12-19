
/**
 * Finds the largest prime factor of the number 600851475143.
 *
 * @author (Claire Chou)
 * @version (12/19/21)
 */
public class PrimeFactors
{
    public static void main(String[] args)
    {
        double n=600851475143.0;
        int k=3;
        while (n>1){
            while (k<Math.sqrt(n)){
                if(n%k==0){
                    n=n/k;
                    break;
                }
                k+=2;
            }
            if(k > Math.sqrt(n)){
                System.out.print(n);
                return;
            }
        }
        System.out.println (k);
        return;
    }
}
