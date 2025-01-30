package bbn.domain;

import bbn.solderType.Offensive;

public class Berserk extends Soldier implements Offensive {

    public Berserk(String name, int attack) {
        super(name, attack);
        this.type = SolderType.OFFENSIVE;
    }

    public void attack() {
        System.out.println("Berserk " + this.name + " deals " + this.attack + " damage!");
    }

    public void defense() {
        System.out.println("Berserk " + this.name +" took a position to defend!");
    }
}
