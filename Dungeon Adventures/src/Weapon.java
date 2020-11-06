import java.util.Random;
import java.util.Scanner;

public class Weapon  {
    static Scanner in = new Scanner( System.in );

    static Characters barbarian = new Characters( Characters.barbarianAttack, Characters.enemiesLife );
    static Characters sorcerer = new Characters( Characters.sorcererAttack, Characters.enemiesLife );

    public static String weapon(String weapon){
        if (Characters.enemies.equals( "Barbarian" )) {
            Random random = new Random();
            int choice = random.nextInt( 100 );
            System.out.println( Characters.enemies + " is hitting you with an axe" );
            System.out.println( "you have lost " + damage( 0 ) + " life points" );
            if (choice <= 30) {
                System.out.println( "...Critical hit!!! you have been hit again" );
                System.out.println( "you have lost " + damage( 0 ) + " life points" );
                System.out.println( "You have now " + (Characters.heroLife -= damage( 0 )) + " life points left" );
            }
        } else if (Characters.enemies.equals( "Sorcerer" )) {
            Random random = new Random();
            int choice = random.nextInt( 100 );
            System.out.println( Characters.enemies + " launch a strike of a lightning" );
            if (choice <= 10) {
                System.out.println( "...you have been paralyze" );
                System.out.println("You lose 1 turn");
                ///PROBLEM WITH PASSING THE TURN
            }
        }
        return " ";
    }

    public static int damage(int damage) {
        if (Characters.enemies.equals( "Barbarian" ))
            return barbarian.barbarianAttack;
        else if (Characters.enemies.equals( "Sorcerer" ))
            return sorcerer.sorcererAttack;
        return 0;
    }
}
