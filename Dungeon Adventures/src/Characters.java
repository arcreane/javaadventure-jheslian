/*
    this class is all about the characters
    construction of the characters, when enemy is defeated
    and generates random enemy for the hero
*/


import java.util.Random;
public class Characters extends Game{
    //attributes for the characters
    public static int life;
    public static int attackDamage;
    public static int heroLife = 200;
    public static int enemiesLife = 20;
    public static int sorcererAttack = 10;
    public static int barbarianAttack = 15;
    public static int heroAttack = 10;
    public static String weapon;
    public static String heroWeapon="sword";



    //construct a character for hero , barbarian and sorcerer
    public Characters(int attackDamage, int life, String weapon) {
        this.attackDamage = attackDamage;
        this.life = life;
        this.weapon = weapon;

    }

    //instantiation of the hero character
    static Characters hero = new Characters( heroAttack, heroLife, heroWeapon );
    static Characters barbarian = new Characters( barbarianAttack, enemiesLife, "axe" );
    static Characters sorcerer = new Characters( sorcererAttack, enemiesLife, "strike of a lightning" );

    //prints once enemy's life is 0 or less
    public static void enemyIsKilled() {
        if (Characters.enemiesLife <= 0) {
            System.out.println( "Congratulation!!! you have successfully killed the " + Characters.enemies );
            System.out.println( "<<<---------------------------------------------------------->>>" );
        }
    }

    //generates a random enemy
    static String enemies = newEnemy();
    public static String newEnemy() {
        String[] enemies = {"Barbarian", "Sorcerer"};
        Random random = new Random();
        int i = random.nextInt( enemies.length );
        String enemy=enemies[i];
        return enemy;
    }
    // game over once hero died
    public static void gameOver() {
            System.out.println( "You have been killed!!! \nYour lovely enemies have won!!!" );
            playing = false;
            System.out.println();
        }
    }
