import java.util.Random;

public class Weapon  {

    //instantiation of the enemies
    static Characters barbarian = new Characters( Characters.barbarianAttack, Characters.enemiesLife );
    static Characters sorcerer = new Characters( Characters.sorcererAttack, Characters.enemiesLife );

    //random weapon for my beloved enemies
    public static String weapon(String weapon){
        if (Characters.enemies.equals( "Barbarian" )) {
            Random random = new Random();
            int choice = random.nextInt( 100 );
            System.out.println( Characters.enemies + " is hitting you with an axe" );
            System.out.println( "you have lost " + damage( 0 ) + " life points" );
            //this make the critical hit chance to 30%
            if (choice <= 30) {
                System.out.println( "...Critical hit!!! you have been hit again" );
                Characters.heroLife -= damage( 0 );
            }
        } else if (Characters.enemies.equals( "Sorcerer" )) {
            Random random = new Random();
            int choice = random.nextInt( 100 );
            System.out.println( Characters.enemies + " launch a strike of a lightning" );
            //make the paralyze effect chance to 10% , once in effect hero lose his turn to attack
            if (choice <= 10) {
                System.out.println( "...you have been paralyze" );
                System.out.println("You lose your turn to attack");
                weapon(" ");
                Characters.heroLife -= damage( 0 );
            }
        }
            return " ";
    }

    //damage attack for the enemies
    public static int damage(int damage) {
        if (Characters.enemies.equals( "Barbarian" ))
            return barbarian.barbarianAttack;
        else if (Characters.enemies.equals( "Sorcerer" ))
            return sorcerer.sorcererAttack;
        return 0;
    }
}
