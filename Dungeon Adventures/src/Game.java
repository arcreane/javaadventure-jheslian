import java.util.Scanner;

public class Game {
    static Scanner in = new Scanner( System.in );
    static int numberOfRooms=5;

    static public void game() {
        Characters hero = new Characters( Characters.heroAttack, Characters.heroLife );


        System.out.println( "Welcome to the Coding Dungeon" );
        System.out.println( "Entering....." );

        boolean playing = true;

   // while (playing){

        while ( 0<numberOfRooms ) {
            //Characters.enemy(" ");
            System.out.println( "You have arrive on 1 of the rooms of the Dungeon" );
            System.out.println( "A " + Characters.enemies + " is approaching..." );

            while (Characters.enemiesLife > 0 ) {
                System.out.println();
                Weapon.weapon( " " );
                //System.out.println( "you have lost " + Weapon.damage( 0 ) + " life points" );
                System.out.println( "You have now " + (hero.heroLife -= Weapon.damage( 0 )) + " life points left" );
                System.out.println( Characters.enemies + " has " + Characters.enemiesLife + " life points" );

                while (Characters.enemiesLife > 0) {

                    System.out.println( "-----------------------------" );
                    //HERO ATTACK
                    if (Characters.enemies.equals( "Barbarian" ))
                        System.out.println( "Type Sword to fight back" );
                    else if (Characters.enemies.equals( "Sorcerer" ))
                        System.out.println( "Type Water_Flask to fight back" );

                    String input = in.nextLine();

                    if (Characters.enemies == "Barbarian" && input.equals( "Sword" )) {
                        System.out.println( "The " + Characters.enemies + " has now " + (Characters.enemiesLife -= Characters.heroAttack) + " life points" );
                        Characters.enemyIsKilled();
                        break;
                    } else if (Characters.enemies == "Sorcerer" && input.equals( "Water_Flask" )) {
                        System.out.println( "The " + Characters.enemies + " has " + (Characters.enemiesLife -= Characters.heroAttack) + " life points" );
                        Characters.enemyIsKilled();
                        break;
                    }

                }

            }playing=false;
            numberOfRooms--;


            //Characters.enemyIsKilled();
        }

        }//playing=false;

    }

//}