/*
a limited implementation to extract the first two words from Rapsberry Ice Cream
*/

public class Delimiter{
  public static void main(String[] args){

    String food = "Raspbery Ice Cream";

    /* first word is all characters before the first space */
    int firstSpace = food.indexOf(" ");
    String word1 = food.substring(0,firstSpace);

    /* we look for the second space starting where the first space left off. The 2nd word is between the first and second spaces */
    int secondSpace = food.indexOf(" ",firstSpace+1);
    String word2 = food.substring(firstSpace+1,secondSpace);

    System.out.println("Word 1: "+word1);
    System.out.println("Word 2: "+word2);

  }
}
