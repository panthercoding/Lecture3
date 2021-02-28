/*
compute hypotenuse (c) based on the side lengths of the two legs (a and b)
the pythagorean theorem states a^2+b^2 = c^2 
*/

public class pythagoras{
  public static void main(String[] args){
    
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);

    double c = Math.sqrt(a*a + b*b); //calculate hypotenuse length c

    System.out.println("Hypotenuse Length: "+c);

  }
}