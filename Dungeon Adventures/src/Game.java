import java.util.Random;
import  java.util.Scanner;

public class Game {
    static Scanner in = new Scanner( System.in );

    //CLASS ENEMY
    public static int Damage(int damage) {
        if (Characters.enemies.equals( "Barbarian" ))
            return Characters.barbarianAttack;
        else if (Characters.enemies.equals( "Sorcerer" ))
            return Characters.sorcererAttack;
        return 0;
    }


    static public void game() {
        Characters hero = new Characters(Characters.heroAttack,Characters.heroLife);
        Characters barbarian = new Characters(Characters.barbarianAttack,Characters.enemyLife);
        Characters sorcerer= new Characters(Characters.sorcererAttack,Characters.enemyLife);

        //boolean playing = true;

        //while (playing){
        System.out.println( "-------------------------" );
        System.out.println( "A " + Characters.enemies + " is approaching..." );
        weapon(" ");


        while (Characters.heroLife > 0) {
            System.out.println();
            System.out.println( "you have lost " + Damage( 0 ) + " life points" );
            System.out.println( "You have now " + (Characters.heroLife -= Damage( 0 )) + " life points left" );


            while (Characters.enemyLife > 0) {
                System.out.println( Characters.enemies + " has " + Characters.enemyLife + " life points" );

                System.out.println("-----------------------------");
                //HERO ATTACK
                if (Characters.enemies.equals( "Barbarian" ) )
                    System.out.println( "Type Sword to fight back" );
                else if (Characters.enemies.equals( "Sorcerer" ) )
                    System.out.println( "Type Water_Flask to fight back" );

                String input = in.nextLine();

                if (Characters.enemies == "Barbarian" && input.equals( "Sword" )) {
                    System.out.println( "The " + Characters.enemies + " has " + (Characters.enemyLife -= Characters.heroAttack) + " life points" );
                   // if (barbarian.life <= 0)
                     //   System.out.println( "Congratulation!!! you have successfully killed the " + Characters.enemy );
                } else if (Characters.enemies == "Sorcerer" && input.equals( "Water_Flask" )) ;
                {
                    System.out.println( "The " + Characters.enemies+ " has " + (Characters.enemyLife -= Characters.heroAttack) + " life points" );

                } if (Characters.enemyLife <= 0)
                    System.out.println( "Congratulation!!! you have successfully killed the " + Characters.enemies );
                System.out.println("---------------");
                break;
            }
        }
        }

            public static String weapon (String weapon){
                if (Characters.enemies.equals( "Barbarian" )) {
                    Random random = new Random();
                    int choice = random.nextInt( 100 );
                    System.out.println( Characters.enemies + " is hitting you with an axe" );
                    if (choice <= 30)
                        System.out.println( "...Critical hit!!! you have been damage twice" );
                } else if (Characters.enemies.equals( "Sorcerer" )) {
                    Random random = new Random();
                    int choice = random.nextInt( 100 );
                    System.out.println( Characters.enemies + " launching a strike of a lightning" );
                    if (choice <= 10)
                        System.out.println( "...you have been paralyze" );
                }
                return " ";
            }
        }