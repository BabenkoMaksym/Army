package bbn.domain;

import bbn.solderType.Defensive;

public class Knight extends Soldier implements Defensive {

    public Knight(String name, int attack) {
        super(name, attack);
        this.type = SolderType.DEFENSIVE;
    }

    public void attack() {
        System.out.println("Knight " + this.name + " deals " + this.attack + " damage!");
    }

    public void defense() {
        System.out.println("Knight " + this.name + " took a position for defense. Shields at the ready.");
    }
}
