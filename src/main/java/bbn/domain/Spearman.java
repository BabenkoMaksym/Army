package bbn.domain;

public class Spearman extends Soldier {

    public Spearman(String name, int attack) {
        super(name, attack);
        this.type = SolderType.ADAPTIVE;
    }

    @Override
    public void attack() {
        System.out.println("Spearman " + this.name + " deals " + this.attack + " damage!");
    }

    @Override
    public void defense() {
        System.out.println("Spearman " + this.name + " took up a position behind the knights for defense. Spear at the ready.");
    }
}
