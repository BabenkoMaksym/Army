package bbn.domain;

public class Swordsman extends Soldier {

    public Swordsman(String name, int attack) {
        super(name, attack);
        this.type = SolderType.OFFENSIVE;
    }

    @Override
    public void attack() {
        System.out.println("Swordsman " + this.name + " deals " + this.attack + " damage!");
    }

    @Override
    public void defense() {
        System.out.println("Swordsman " + this.name +" took a position to defend!");
    }
}
