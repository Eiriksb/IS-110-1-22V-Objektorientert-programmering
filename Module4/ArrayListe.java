import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListe {
  public static void main(String[] args) {

    System.out.println("Skriv noe");

    try (Scanner uInput = new Scanner(System.in)) {
        String userInput = uInput.nextLine();

        ArrayList<String> text = new ArrayList<String>();
        text.add("En"); //Legger til tall i listen
        text.add("2");
        text.remove("2"); //Fjerner String fra listen
        text.add("Tre");
        text.add(userInput);
        Iterator<String> it = text.iterator();
        while(it.hasNext()) {
          it.next();
        }
        System.out.println(text);
    }
  }
}
