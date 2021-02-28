/*
concatenating numbers with strings 
*/
public class StringConcat3{
  public static void main(String[] args){

    String player1Name = "Mahomes";
    int player1Number = 15;
    
    String player1 = player1Name + player1Number;
    // player is "Mahomes 15"

    player1 += " of Kansas City";
    //player is "Mahomes 15 of Kansas City"

    System.out.println(player1);

  }
}