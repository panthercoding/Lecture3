public class Program{
  public static void main(String[] args){
    
    //parseDouble() is a method for the built-in Double class
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);

    //compute harmonic mean and arithmetic mean (average) through the static methods in the class Tools
    double hMean = Tools.HarmonicMean(x,y);
    double Avg = Tools.Average(x,y);

    //print them to the console
    System.out.println("Harmonic Mean: "+hMean);
    System.out.println("Arithmetic Mean: "+Avg);
    
  }
}