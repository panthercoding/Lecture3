
public class Player{
    String name; double x_coord, y_coord;

    public Player(String player_name, double x, double y){
      name = player_name; x_coord = x; y_coord = y;
    }

    public void setX(double x){
      x_coord = x; //changes x_coord
    }
    public void setY(double y){
      y_coord = y; //changes y_coord
    }
    public static void Welcome(){
      System.out.println("Welcome to the Game!");
    }
}

