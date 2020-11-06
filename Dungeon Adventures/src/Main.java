import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        int menu ;

        //Menu for le jeu
        System.out.println( " Menu: Please type 1 or 2" );
        System.out.println( "\t1 Play ");
        System.out.println( "\t2 Quit ");

        menu=in.nextInt();
        switch (menu) {
            case 1:
                Game.game();
                break;
            case 2:
                System.out.println("Goodbye! Please come a again..... You loser! ");
                Game.playing=false;
        }
    }
}