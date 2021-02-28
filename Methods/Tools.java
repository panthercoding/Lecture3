/*
we will implement several static methods that can be called using the class name Tools. We don't need a main method since this acts as a support file.
These methods are popular math formulae.
*/

public class Tools{

  /*
  it is a public method which means it can accessed outside of this class 
  it is static because we call it using the name of the class (Tools)
  it returns a double -> public static double
  */
  public static double HarmonicMean(double a, double b){
    double c = 1 / (1.0/a + 1.0/b);
    return(c);
  }

  public static double Average(double a, double b){
    return((a + b) / 2);
  }
  
}
