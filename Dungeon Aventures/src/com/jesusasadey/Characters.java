package com.jesusasadey;
import java.util.Random;
public class Characters extends Main{
    public static String enemy;
    public static String attackWeapon;
    public static int attackValue;
    public static int life;

    public void setCharacter(String enemy, String weapon, int attackValue, int life) {
        this.enemy = enemyRandom(enemy);
        this.attackWeapon = enemyWeapon( weapon );
        this.attackValue = attackValue;
        this.life=life;
    }

    public String enemyWeapon(String weapon) {
       Random random = new Random();
        if (enemyRandom( "Barbarian" )=="Barbarian" ){
            String[] weapons = {"axe", "paralyze","critical hit"};
            int i = random.nextInt( weapons.length );
            return weapons[i];
        } else if( enemyRandom( "Sorcerer" )=="Sorcerer" ){
            String[] weapons = {"strike of a lightning", "paralyze","critical hit"};
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