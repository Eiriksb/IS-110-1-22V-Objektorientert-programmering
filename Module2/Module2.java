package Module2;
import java.util.Scanner; // Import Scanner class

public class Module2 {


    public static void main(String[] args) {

        Scanner xinput = new Scanner(System.in); // Create a Scanner object
        Py Vy = new Py(); //Create a object from Py.java
        Vy.setY(30);  //Sets value of y with a setter
        int y = Vy.getY();  //Gets the value from a getter and places it in y

        System.out.println("Enter a number"); //Asks for user input
        int xreply = xinput.nextInt();  //Makes user input into a integear

        if(xreply > y) {
          System.out.println(xreply + " is larger than " + y); //Checks if xreply is larger than y
        } else {
          System.out.println(y + " is larger than " + xreply); //If not replies that y is larger
        } 
    }
  }