import java.util.Random;
public class Characters extends Main {
    public static String name;
    public static String enemy;
    public static String attackWeapon;
    final int attackDamage;
    final public int life;

    //public Characters(int life) {
      //  this.life = life;
    //}


    public Characters(String enemy, String weapon, int attackDamage, int life) {
        this.enemy = enemyRandom(enemy);
        this.attackWeapon = enemyWeapon( weapon );
        this.attackDamage = attackDamage;
        this.life=life;
    }



    /*
    public void setCharacter(String type, String weapon, int attackDamage, int life) {
        this.enemy = enemyRandom(enemy);
        this.attackWeapon = enemyWeapon( weapon );
        this.attackDamage = attackDamage;
        this.life=life;
    }

     */

    /*
    Random random = new Random();
    void sorcerer(){
        String paralyze = "...you have been paralyze";
        String [] lightning= {" launching a strike of a lightning"," launching a strike of a lightning"," launching a strike of a lightning"," launching a strike of a lightning"," launching a strike of a lightning"};
        String [] weapon={paralyze, String.valueOf( lightning )};
        String sorcererWeapon= weapon[random.nextInt( weapon.length )];
    }*/

    public String enemyWeapon(String weapon) {
        Random random = new Random();
        if (enemyRandom( "Barbarian" ).equals( "Barbarian" ) ){
            String[] weapons = {"hitting you with an axe", "hitting you with an axe"+"\n...Critical hit!!! you have been damage twice"};
            int i = random.nextInt( weapons.length );
            return weapons[i];
        } else if( enemyRandom( "Sorcerer" ).equals( "Sorcerer" )){
            String paralyze="...you have been paralyze";
            String[] weapons = {" launching a strike of a lightning", "launching a strike of a lightning" +
                    "\n"+ paralyze +"\nYou lose 1 turn"};
            int i = random.nextInt( weapons.length );
            return weapons[i];
        }
        return enemyWeapon( weapon );
    }

    public static String enemyRandom (String enemy){
        String [] enemies= {"Barbarian","Sorcerer"};
        Random random = new Random();
        int i = random.nextInt(enemies.length);
        return enemies[i];
    }



}