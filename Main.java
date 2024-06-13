import java.util.Scanner;

public class Main{
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    Warrior warrior = new Warrior("Dara", 100);
    Mage mage = new Mage("Bob", 100);
    Rogue rogue = new Rogue("Maxim", 100);

    do{
      System.out.println("A new fight begins...");

      warrior.attack(rogue);
      mage.castSpell(rogue);
      rogue.attack(warrior);

      warrior.levelUp();
      mage.levelUp();
      rogue.levelUp();

      System.out.println("Do you want a new fight? (yes/no)");
    }while (scanner.nextLine().equalsIgnoreCase("yes"));
    scanner.close();
    System.out.println("Game ended");
 }
}
