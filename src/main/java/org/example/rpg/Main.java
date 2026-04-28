package org.example.rpg;

public class Main {
    public static void main(String[] args) {
        Troll troll = new Troll("Mountain Troll", 100, 40);

        System.out.println("Monster Name: " + troll.getName());
        System.out.println("Attack Damage: " + troll.attack());
    }
}