import  java.util.Scanner;

public class Game  {
    static Scanner in = new Scanner( System.in );


    public static void game() {

        Characters hero = new Characters("Hero", "axe", 10, 200 );

        Characters barbarian = new Characters("Barbarian", "axe", 15, 20 );

        Characters sorcerer = new Characters("Sorcerer", "lightning", 10, 20 );

        System.out.println(hero.life);
        System.out.println(barbarian.life);
        //boolean playing = true;

        //while (playing){
/*
        System.out.println( "-------------------------" );
        System.out.println( "A " + enemy + " is approaching..." );
        System.out.println( "The " + enemy + " is " + attackWeapon );
        //hero.life = 200;

        while (hero.life > 0) {

            System.out.println( "you have lost " + barbarian.attackDamage + " life points" );
            System.out.println( "You have now " + (hero.life-=sorcerer.attackDamage) + " life points left" );


            while (enemy.equals( enemy ) && enemyRandom( enemy ).life > 0) {
               // if (enemy =="barbarian")
                 //   barbarian.life=20;
                System.out.println( enemy + " has " + life + " life points" );

break;
                //enemy attack



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
                else if (enemy=="Sorcerer" && input.equals( "Water_Flask" ));{
                    System.out.println( "The " + enemy + " has " + (sorcerer.life -= 10) + " life points" );
                    if (sorcerer.life == 0)
                        System.out.println("Congratulation!!! you have successfully killed the " + enemy);
                }


            }*/
            }

        }
