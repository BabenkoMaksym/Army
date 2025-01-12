package bbn.utils;

import bbn.domain.*;

import java.util.ArrayList;
import java.util.List;

public class ArmyUtils {

    public static List<Soldier> createArmy() {
        List<Soldier> army = new ArrayList<Soldier>();

        army.add(new Spearman("Spearman 1", 3));
        army.add(new Spearman("Spearman 2", 4));
        army.add(new Spearman("Spearman 3", 3));
        army.add(new Spearman("Spearman 4", 2));
        army.add(new Berserk("Berserk 1", 7));
        army.add(new Berserk("Berserk 2", 7));
        army.add(new Knight("Knight 1", 1));
        army.add(new Knight("Knight 2", 1));
        army.add(new Knight("Knight 3", 1));
        army.add(new Knight("Knight 4", 1));
        army.add(new Knight("Knight 5", 1));
        army.add(new Shaman("Shaman", 0));
        army.add(new Swordsman("Swordsman 1", 5));
        army.add(new Swordsman("Swordsman 2", 6));
        army.add(new Swordsman("Swordsman 3", 5));
        army.add(new Swordsman("Swordsman 4", 5));

        return army;
    }

    public static void reportArmy(Army army) {
        System.out.println("==========Army reported==========");
        for (Soldier soldier : army.getSoldiers()) {
            soldier.report();
        }
    }

    public static void attack(Army army) {
        System.out.println("==========Army attacked==========");
        for (Soldier soldier : army.getSoldiers()) {
            soldier.attack();
        }
    }


    public static void defend(Army army) {
        System.out.println("==========Army defended==========");
        for (Soldier soldier : army.getSoldiers()) {
            soldier.defense();
        }
    }
}
