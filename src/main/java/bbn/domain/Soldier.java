package bbn.domain;

public abstract class Soldier {
    protected String name;
    protected int attack;
    protected SolderType type;

    public Soldier(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public void report () {
        System.out.println("Solder " + name + " here. Type - " + type);
    }


    public abstract void attack();

    public abstract void defense();
}
