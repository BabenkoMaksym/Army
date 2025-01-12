package bbn.domain;

public class Knight extends Soldier {

    public Knight(String name, int attack) {
        super(name, attack);
        this.type = SolderType.DEFENSIVE;
    }

    @Override
    public void attack() {
        System.out.println("Knight " + this.name + " deals " + this.attack + " damage!");
    }

    @Override
    public void defense() {
        System.out.println("Knight " + this.name + " took a position for defense. Shields at the ready.");
    }
}
