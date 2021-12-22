/**
 * Finds the 10001st prime.
 *
 * @author (Claire Chou)
 * @version (12/22/21)
 */
import java.util.ArrayList;
public class NumberPrime
{
    public static int prime()
    {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        int k = 5;
        
        while (primes.size()<10001){
            boolean is_prime = true;
            for (int i=1;i<primes.size();i++){
                if (k%primes.get(i)==0){
                    is_prime = false;
                    break;
                }
            }
            if (is_prime == true){
                primes.add(k);
            }
            k+=2;
        }
        return primes.get(10000);
    }
    public static void main(String args[]) {
      System.out.println(prime());
    }
}
