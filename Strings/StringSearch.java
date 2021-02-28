/*
utilizing the indexOf() method, which returns the first index
a certain character or substring appears
*/

public class{

  public static void main(String[] args){

    String dna = "TCAAGGAC";
    int result1 = dna.indexOf("A");
    /* result1 is 2 (index of first A) */

    int result2 = dna.indexOf("M");
    /* result2 is -1, which means there
    is no M in dna */

    int result3 = dna.indexOf("AG");
    /* result3 is 3 as the substring AG can
    be found starting at index 3 */

  }
}