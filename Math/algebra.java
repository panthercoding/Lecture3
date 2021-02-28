/*
the Math class consists exclusively of static methods, which means that they can be called without creating a Math object (and thus belong to the class)
*/
public class algebra{
  public static void main(String[] args){

    double value; //declare double value

    /* absolute value method through Math class */
    value = Math.abs(-10); //value is 10
    value = Math.abs(1.5); //value is now 1.5

    double value;
    /* square root method through Math class */
    value = Math.sqrt(15); //value is sqrt(15)
    value = Math.sqrt(Math.PI); //value is sqrt(pi)


    /* exponent method through Math class */
    double result = Math.pow(2,5); //2 raised to the 5th power

  }
}
