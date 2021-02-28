/*
concatenating strings with number arithmetic
*/
public class StringConcat4{
  public static void main(String[] args){

    String item = "coins";
    int pennies = 10, nickels = 5;

        /* different results due to PEMDAS */
    String result1 = item + pennies + nickels;
    //result1 is coins105 since string concatenation occurs first with item + pennies (left to right PEMDAS)
    String result2 = pennies + nickels + item; 
    //result2 is 15coins since we add pennies and nickels first as integers
    String result3 = item + (pennies + nickels);
    //integer3 addition occurs first due to parantheses and PEMDAS

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);

  }
}