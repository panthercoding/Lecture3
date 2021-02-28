public class randomGenerator
{
  public static void main(String[] args)
  {

    /* random generator method through Math class */
    double value = Math.random(); //random value in interval [0,1)

    /* random integer generator method through Math class and casting*/
    int randInt = (int)(5 * Math.random()) + 2; //random int between 2 and 6
    
    randInt = (int)(6 * Math.random()) - 10; //random int between -10 and -5

    int min = 2; /* example value */
    int max = 5; /* example value */



    int randInteger = (int)(Math.random() * (max - min + 1)) + min;


    
  }
}