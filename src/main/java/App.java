import java.io.Console;

public class App {
  public static void main(String[] args) {


    Console myConsole = System.console();
    System.out.println("How many guests:");
    String stringGuests = myConsole.readLine();
    int intGuests = Integer.parseInt(stringGuests);
    System.out.println("how many will be eating? ");
    String stringFood = myConsole.readLine();
    int intFood = Integer.parseInt(stringFood);
    System.out.println("how many will be drinking? ");
    String stringDrinks = myConsole.readLine();
    int intDrinks = Integer.parseInt(stringDrinks);
    System.out.println("How many will be attending the show ");
    String stringBand = myConsole.readLine();
    int intBand = Integer.parseInt(stringBand);
    PartyPlanner myPartyPlanner = new PartyPlanner(intGuests, intFood, intDrinks, intBand);
    System.out.println("The cost of your party is " + myPartyPlanner.gTotal());
  }
}
