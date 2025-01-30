package bbn.domain;

import bbn.solderType.Offensive;
import bbn.solderType.Supportive;

public class Swordsman extends Soldier implements Offensive {

    public Swordsman(String name, int attack) {
        super(name, attack);
        this.type = SolderType.OFFENSIVE;
    }

    public void attack() {
        System.out.println("Swordsman " + this.name + " deals " + this.attack + " damage!");
    }

    public void defense() {
        System.out.println("Swordsman " + this.name +" took a position to defend!");
    }
}
