package bbn.domain;

public class Berserk extends Soldier {

    public Berserk(String name, int attack) {
        super(name, attack);
        this.type = SolderType.OFFENSIVE;
    }

    @Override
    public void attack() {
        System.out.println("Berserk " + this.name + " deals " + this.attack + " damage!");
    }

    @Override
    public void defense() {
        System.out.println("Berserk " + this.name +" took a position to defend!");
    }
}
