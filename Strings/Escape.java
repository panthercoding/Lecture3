/*
how to create quotation marks inside strings and a few special characteristics such as \n for a newline
*/
public class Escape{
  public static void main(String[] args){

    String s1 = "\"Go Niners!\""; // double quote
    System.out.println(s1);

    String s2 = "F\tU\t N"; // tab or indent
    System.out.println(s2);

    String s3 = "Orange\nKiwi\nBanana"; //new line
    System.out.println(s3);

    String s4 = "The backslash is \\"; //backslash chracter
    System.out.println(s4);
  }
}