/*
selecting a random character from a string
*/
public class randomChar
{
  public static void main(String[] args)
  {
    String message = "Utah Jazz";
    int length = message.length();

    /* choose random int between 0 and length-1, which are the indexes of the String message */
    int randIndex = (int) (Math.random() * length);

    /* find the character at that index and print it out */
    char randChar = message.charAt(randIndex);
    System.out.println(randChar);

  }
}