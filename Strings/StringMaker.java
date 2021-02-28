public class StringMaker{
  public static void main(String[] args){

    //general approach for declaring strings
    String myName = "Matthew";
    String mySchool = "TJ High School";

    //using the String class to craft objects
    String favClass = new String("history");
    String mySport = new String("soccer");

    //creating an empty string object
    String myCollege = new String();

    myCollege = "Michigan";  //myCollege now refers to a new string 

    /*creating a null string (different from empty as it has no value). Trying to run a method on a null string leads to a run-time null pointer exception.
    */

    /*creating a null string */
    String myMiddleName;
    System.out.println( myMiddleName.length() );
    //NullPointerException error

  }
}