import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        Characters.newEnemy();
        Characters.newEnemy();

        int menu;

        //Menu for the game
        System.out.println( "Menu: Please type 1 or 2" );
        System.out.println( "\t1 Play ");
        System.out.println( "\t2 Quit ");

        menu=in.nextInt();
        try {
            switch (menu) {
                case 1:
                    Game.startGame();
                    break;
                case 2:
                    System.out.println( "Goodbye! Please come a again..... You loser! " );
                    Game.playing = false;
                    break;
                default:
                    System.out.println( "You didn't enter the right option" );
            }
        }catch (InputMismatchException e) {
            System.out.println("Only numerical numbers are available");
        }
    }
}