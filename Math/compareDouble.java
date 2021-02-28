/* due to rounding errors, we don't want to use == to compare doubles.
instead, we want a tolerance threshold, meaning that we say a = b
if the difference, abs(a-b), is very small
*/

public class compareDouble{
  public static void main(String[] args){

    double a = 0.99999999999999999999;
    double b = 1;

    double epsilon = 0.0000001 //tolerance threshold 

    //we say a = b if their difference is less than the threshold
    boolean a_equals_b = Math.abs(a-b) <= epsilon //a_equals_b is true here

  }
}