/*
    this is where you will find the creation the hero
    and heart of the game XD
    the game is design to kill the enemies that will appear on the different rooms
    by typing the desire word/s
*/

import java.util.Scanner;

public class Game{
    static Scanner in = new Scanner( System.in );
    static int numberOfRooms=5;
    static boolean playing = true;

    static public void startGame() {


        //beginning of the game
        System.out.println( "Welcome to the Coding Dungeon" );
        System.out.println( "You are now entering....." );

        while (playing ){

            while ( 0<numberOfRooms || Characters.hero.heroLife <= 0 ) {

                Characters.enemiesLife=20; // for the enemies to refresh their lives and thanks to Nicolas i figured the god damn error
                System.out.println( "You have arrived on 1 of the rooms of the Dungeon" );
                System.out.println( "A " + Characters.enemies + " is approaching..." );

                //prints life's of the characters

                while (Characters.enemiesLife > 0 ) {
                    System.out.println();
                    Weapon.weapon( " " );
                    System.out.println( "You have now " + (Characters.heroLife -= Weapon.damage( 0 )) + " life points left" );
                    System.out.println( Characters.enemies + " has " + Characters.enemiesLife + " life points" );

                    //kills the enemy till they're doooooomed lol
                    while (Characters.enemiesLife > 0) {

                        System.out.println( "<<<---------------------------------------------------------->>>" );
                        //HERO ATTACK
                        if (Characters.enemies.equals( "Barbarian" ))
                            System.out.println( "Type Sword to fight back" );
                        else if (Characters.enemies.equals( "Sorcerer" ))
                            System.out.println( "Type Water_Flask to fight back" );

                        String input = in.nextLine();

                        if (Characters.enemies == "Barbarian" && input.equals( "Sword" )) {
                            Events.heroAttack();
                            Characters.enemyIsKilled();
                            break;
                        } else if (Characters.enemies == "Sorcerer" && input.equals( "Water_Flask" )) {
                            System.out.println( "The " + Characters.enemies + " has " + (Characters.enemiesLife -= Characters.heroAttack) + " life points" );
                            Characters.enemyIsKilled();
                            break;
                        }else if(input.equals( "" ) && Characters.heroLife <= 0) {
                            Characters.gameOver();

                        }else
                            break;

                    }
                }
                playing=false;
                numberOfRooms--;
                // victory once hero killed all the enemies
                if(numberOfRooms <= 0 ) {
                    System.out.println();
                    System.out.println( "You have found a treasure full of lotto's result from the future" );
                    System.out.println();
                    System.out.println( "<<<---------------------------------------------------------->>>" );
                }
            }
        }
    }
}
