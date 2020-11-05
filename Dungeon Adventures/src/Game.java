import  java.util.Scanner;

public class Game extends Characters{
    static Scanner in = new Scanner(System.in);
    public static void game() {
        Characters hero = new Characters();
        hero.setCharacter( "Hero", "axe", 10,200);
        Characters barbarian = new Characters();
        barbarian.setCharacter( "Barbarian", "axe", 15,20);
        Characters sorcerer = new Characters();
        sorcerer.setCharacter( "Sorcerer", "lightning", 10,20);




        boolean playing = true;

        //while (playing){
            System.out.println("-------------------------");
            System.out.println( "A " + enemy +" is approaching..." );

            while (enemy==enemy && life>0){
                System.out.println(enemy + " has " +life + " life points");
                System.out.println( "The " + enemy + " is " + attackWeapon );
                //HERO ATTACK
                if (enemy== "Barbarian")
                    System.out.println("Type Sword to fight back");
                else if (enemy== "Sorcerer")
                    System.out.println("Type Water_Flask to fight back");
                String input = in.nextLine();
                if (enemy=="Barbarian" && input.equals( "Sword" )) {
                  barbarian.life= life - 10;
                    System.out.println(barbarian.life);
                }
                else if (enemy=="Sorcerer" && input.equals( "Water_Flask" ));
                sorcerer.life= life - 10;
                System.out.println(sorcerer.life);
                break;
            }
        //}

    }
}
