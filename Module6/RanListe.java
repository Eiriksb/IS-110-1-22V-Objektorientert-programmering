import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class RanListe {

    //final kan ikke endres
    final static int x = 100;   

    //Random nummer static
    static int randomNumS = (int)(Math.random()*x); 

    //random nummer ikke static
    int randomNumNS = (int)(Math.random()*x); 

    //int klasse som returnerer en y verdi som består av Non static random + y
    public int NonStatic(int y){
        
        return randomNumNS + y;
    }

    public static void main(String[] args) {

        //Lager en HashMap som tar inn en int og en string
        HashMap<Integer, String> IdNavn = new HashMap<Integer, String>();

        //Setter values i HashMap
        IdNavn.put(1, "Hans");
        IdNavn.put(2, "Henrik");
        IdNavn.put(3, "Roger");
        IdNavn.put(4, "Erik");

        //Lager et HashSet
        HashSet<Integer> num = new HashSet<Integer>();

        //Legger til values i HashSet
        num.add(4);
        num.add(5);
        num.add(9);

        //Viser nummer under 10 som er i set.
        for(int i = 1; i <= 10; i++){
            if(num.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }

        //Lager et nytt objekt kalt myNum
        RanListe myNum = new RanListe();

        //Lager en ArrayList som kan ta imot int
        ArrayList<Integer> Num = new ArrayList<Integer>();

        //Legger til tilfeldig nummer
        Num.add(randomNumS);

        //Objektet myNum kjører NonStatic og setter y som 0
        Num.add(myNum.NonStatic(0));

        //Objektet myNum kjører NonStatic og setter y som 30
        Num.add(myNum.NonStatic(30));

        //Iterator heter it og går gjennom Num ArrayListen
        Iterator<Integer> it = Num.iterator();

        //Skriver ut listen i terminal
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //Printer ut HashMap
        System.out.println(IdNavn);
        
    }
}
