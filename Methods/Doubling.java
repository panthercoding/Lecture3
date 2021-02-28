public class Doubling{
  public static void main(String[] args){

    int gifts = 10;
    printXDouble(gifts); //no return so no assignment operator 
    gifts = XDouble(gifts); //return of an int to gifts
    System.out.println(gifts);
  }
  /* void method to print out X doubled (no return) */
  public static void printXDouble(int x){
    System.out.println(2 * x);
  }
  /* non-void method to return the x doubled */
  public static int XDouble(int x){
    return(2 * x);
  }
}

