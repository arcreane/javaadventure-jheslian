import java.util.Random;

public class Events {
    public static int spEffect = 2;


    public static String heroAttack() {
        if (Characters.enemies.equals( "Barbarian" )) {
            Random random = new Random();
            int choice = random.nextInt( 100 );
            int attack = Characters.enemiesLife -= Characters.heroAttack;
            System.out.println( "You have strike your enemy with a " + Characters.hero.heroWeapon );
            System.out.println( "The " + Characters.enemies + " has now " + attack + " life points" );
            if (choice <= 10) {
                System.out.println( "You have successfully hit the barbarian's head\n" + Characters.enemies + " has now lose his turn to attack" );
                heroAttack();
                Characters.enemiesLife -= Characters.hero.heroAttack;
            }

        } 


        } return " ";
    }
}
