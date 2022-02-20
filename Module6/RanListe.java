/**
* RanListe er bare demonstrasjon av String, Random, HashMap, HashSet.
* @return Ganske enkelt program som skriver ut til terminal med de forskjellige listene.
*
* @author  Eirik Silseth Bjørdal
* @version 1.0
* @since   20.02.2022 
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
   * Hovedklasse.
   */

public class RanListe {

    /**
   * @param x Dette er en int som er final som brukes i random funksjonene.
   */
    final static int x = 100;   

    /**
   * @param randomNumS er et static random nummer generator som tar in x, som vil si den lager en tilfedlig nummer mellom 0-99
   */
    static int randomNumS = (int)(Math.random()*x); 

    /**
   * @param randomNumS er et ikke static random nummer generator som tar in x, som vil si den lager en tilfedlig nummer mellom 0-99
   */
    int randomNumNS = (int)(Math.random()*x); 

    /**
   * @return Dette er en funskjon som returnerer verdien av randomNumNS (non-static)
   * @param y er et nummer som blir lagt til senere i funksjonen.
   * Returnerer Random Non static + 0 eller nummer som blir lagt inn
   */
    public int NonStatic(int y){
        
        return randomNumNS + y;
    }

    /**
   * Denne metoden lager en et par lister.
   *  x Dette er en int som er final som brukes i random funksjonene.
   *  Denne funskjonen returnerer foerst en liste over tall som blir funnet i HashSettet 1-10.
   *  Saa en Liste over tilfeldige tall.
   *  Saa en HashMap liste med navn. 
   * @param args args
   */

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
