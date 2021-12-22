
/**
 * PythTriple finds the product of a,b, and c where they would make up a pythagorean triple and sum to 1000.
 *
 * @author (Claire Chou)
 * @version (12/22/21)
 */
public class PythTriple
{
    public static int pythagoreanTriple()
    {
        int a=1;
        int b=1;
        int c=1;
        for(a=1;a<=333;a++){
            for(b=a;b<=(1000-a)/2;b++){
                c=1000-a-b;
                if(c*c == a*a+b*b){
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);

                    return a*b*c;
                }
            }
        }
        return a*b*c;
    }
    public static void main(String args[]) {
        System.out.println(pythagoreanTriple());
    }
}
