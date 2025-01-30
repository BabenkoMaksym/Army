package bbn.domain;

import bbn.solderType.Adaptive;

public class Spearman extends Soldier implements Adaptive {

    public Spearman(String name, int attack) {
        super(name, attack);
        this.type = SolderType.ADAPTIVE;
    }

    public void attack() {
        System.out.println("Spearman " + this.name + " deals " + this.attack + " damage!");
    }

    public void defense() {
        System.out.println("Spearman " + this.name + " took up a position behind the knights for defense. Spear at the ready.");
    }
}
