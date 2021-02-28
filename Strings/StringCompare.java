/*
we discuss methods for comparing strings in Java
*/

public class StringCompare{
  public static void main(String[] args){

    /* .equals() is a case-sensitive method for comparing strings
    we cannot use == to compare Java strings */
    String password = "caprisun";
    String guess = "Caprisun";
    System.out.println(password.equals(guess));

    /* the compareTo method returns a number that is 
    0 if the strings are equal, negative if the first string comes lexicographically before the second, and positive otherwise
     */

     String s1 = "Califonia";
     String s2 = "California";
     int result12 = s1.compareTo(s2); //result is 0

     String s3 = "Arizona";
     String s4 = "Minnesota";
     int result34 = s3.compareTo(s4); //result is negative

     String s5 = "San Jose";
     String s6 = "San Francisco";
     int result56 = s5.compareto(s6) //result is positive

     /* as a note, uppercase comes before lowercase letters */

  }
}