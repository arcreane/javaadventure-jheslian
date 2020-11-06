import java.util.Random;
public class Characters extends Game {
    public static int life;
    public static int attackDamage;

    public static int heroLife = 200;
    public static int enemiesLife = 20;
    public static int sorcererAttack = 10;
    public static int barbarianAttack = 15;
    public static int heroAttack = 10;
    public static boolean paralyze;
    public static boolean criticalHit;
    //public static boolean playing;


    public Characters(int attackDamage, int life) {
        this.attackDamage = attackDamage;
        this.life = life;
    }

    static String enemies = enemy( " " );


    public static boolean enemyIsKilled() {
        if (Characters.enemiesLife <= 0) {
            System.out.println( "Congratulation!!! you have successfully killed the " + Characters.enemies );
            System.out.println( "---------------" );
        }
        return true;
    }

    public static String enemy(String enemy) {
        String[] enemies = {"Barbarian", "Sorcerer"};
        Random random = new Random();
        int i = random.nextInt( enemies.length );
        return enemies[i];
    }




}
