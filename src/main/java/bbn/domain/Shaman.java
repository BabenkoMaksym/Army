package bbn.domain;

public class Shaman extends Soldier {

    public Shaman(String name, int attack) {
        super(name, attack);
        this.type = SolderType.SUPPORTIVE;
    }

    @Override
    public void attack() {
        this.chantOfAttack();
    }

    @Override
    public void defense() {
        this.chantOfDefense();
    }

    private void chantOfAttack() {
        System.out.println("Shaman chants a song to motivate the soldiers to attack.");
    }

    private void chantOfDefense() {
        System.out.println("Shaman chants a chant to take up a position for defense");
    }


}
