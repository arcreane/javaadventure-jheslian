import java.util.Random;
public class Characters extends Game{
    public static int life;
    public static int attackDamage;
    public static String attackWeapon;
    public static int heroLife=200;
    public static int enemyLife=20;
    public static int sorcererAttack=10;
    public static int barbarianAttack=15;
    public static int heroAttack=10;
    public static boolean paralyze;
    public static boolean criticalHit;


    public Characters( int attackDamage, int life) {
        this.attackDamage = attackDamage;
        this.life=life;
    }



    static String enemies= enemy( " " );



    public static String enemy(String enemy) {
        String[] enemies = {"Barbarian", "Sorcerer"};
        Random random = new Random();
        int i = random.nextInt( enemies.length );
        return enemies[i];
    }



        /*
        String[] enemies = {"Barbarian", "Sorcerer"};
        Random random = new Random();
        int i = random.nextInt( enemies.length );
        return enemies[i];


    }
    public static String barbarianWeapon() {
        Random random = new Random();
        int choice = random.nextInt( 100 );
        System.out.println( "hitting you with an axe" );
        if (choice <= 30)
            return "...Critical hit!!! you have been damage twice";
        return " ";
    }


    public static String sorcererWeapon() {
        Random random = new Random();
        int choice = random.nextInt( 100 );
        System.out.println( "launching a strike of a lightning" );
        if (choice <= 10)
            return "...you have been paralyze";
        return " ";
    }
    /*
    public static String enemyWeapon(String weapon) {
        if (enemy.equals( "Barbarian" ))
            return barbarianWeapon();
        else if (enemy.equals( "Sorcerer" ))
            return sorcererWeapon();
        return  " ";
    }

     */
}
/*
    public Characters(String enemy, String weapon, int attackDamage, int life) {
        this.enemy = enemyRandom( enemy );
        this.attackWeapon = enemyWeapon( weapon );
        this.attackDamage = attackDamage;
        this.life = life;
    }
*/