package bbn.domain;

import bbn.solderType.Supportive;

public class Shaman extends Soldier implements Supportive {

    public Shaman(String name, int attack) {
        super(name, attack);
        this.type = SolderType.SUPPORTIVE;
    }

    public void supportAttack() {
        this.chantOfAttack();
    }

    public void supportDefense() {
        this.chantOfDefense();
    }

    private void chantOfAttack() {
        System.out.println("Shaman chants a song to motivate the soldiers to attack.");
    }

    private void chantOfDefense() {
        System.out.println("Shaman chants a chant to take up a position for defense");
    }


}
