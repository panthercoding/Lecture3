public class Main {
  public static void main(String[] args) {

    /* Welcome is static so we can call it using the class name */
    Player.Welcome(); //prints out "Welcome to the Game!"

    /* setX/setY are non-static so we call them using object names */
    gamer1 = new Player("Parzipal",-10,100);
    gamer1.setX(10); //Parzipal's x_coord goes from -10 to 10

    gamer2 = new Player("Thanos",10,100);
    gamer2.setY(120); //Thanos's y_coord goes from 100 to 120 
    
  }  
}
