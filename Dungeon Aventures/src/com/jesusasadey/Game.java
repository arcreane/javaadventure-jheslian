package com.jesusasadey;

public class Game extends Characters{
    public static void game() {
        Characters character = new Characters();
        character.setCharacter( "Barbarian", "axe", 15,20);
        Characters character2 = new Characters();
        character2.setCharacter( "Sorcerer", "lightning", 10,20);
        System.out.println( "The " + enemy + " attacked you with an " + attackWeapon );

        if (enemy== "Barbarian")
            System.out.println("Type Sword to fight back");
        else if (enemy== "Sorcerer")
            System.out.println("Type Water_Flask to fight back");
    }
}
