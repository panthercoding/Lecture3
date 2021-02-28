/*
each character in a string is given an index 
starting from zero
*/
public class StringIndex{
  public static void main(String[] args){

    String myState = "New York";

    /* using .charAt() method to return the first character of the string */
    char ch1 = myState.charAt(0); //ch1 is 'N'
    System.out.println(ch1);

    /* return the fourth character of the string */
    char ch4 = myState.charAt(3);
    System.out.println(ch4); //ch4 is ' ' (space)

    /* return the final character of the string */
    char ch8 = myState.charAt(myState.length()-1);

    /* printing out each of the characters */
    System.out.println(ch1);
    System.out.println(ch4);
    System.out.println(ch8);

  }
}