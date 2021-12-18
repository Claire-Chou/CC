
/**
 * Write a description of class ThreesAndFives here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ThreesAndFives
{
    public static void main(String args[]) {
        int sum=0;
      for (int i=0;i<1000;i++){
          if(i%3==0||i%5==0){
              sum+= i;
          }
      }

      System.out.println(sum);
    }
}
