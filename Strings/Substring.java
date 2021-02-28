/*
a substring is a consecutive sequence of characters within a string

the substring() method has many versions
-> substring(index) will extract the entire string starting at index
-> substring(index1,index2) will extract the string between index1
and index2 - 1
*/

public class Substring{
  public static void main(String[] args){

    String phrase = "Elementary my dear Watson";

    String s1 = phrase.substring(11); //s1 is "my dear Watson"
    System.out.println( s1 );

    String s2 = phrase.substring(1,3); //s2 is "le"
    System.out.println( s2 );

    String s3 = phrase.substring(11,13); //s3 is "my"
    System.out.println( s3 );

    String s4 = phrase.substring(50);
    //StringIndexOutofBounds Exception error (index 50 nonexistent)

  }
}