package bbn.utils;

import bbn.domain.*;
import bbn.solderType.Adaptive;
import bbn.solderType.Defensive;
import bbn.solderType.Offensive;
import bbn.solderType.Supportive;

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
            if (soldier instanceof Adaptive adaptive) {
                adaptive.attack();
            } else if (soldier instanceof Offensive offensive) {
                offensive.attack();
            } else if (soldier instanceof Supportive support) {
                support.supportAttack();
            }
        }
    }


    public static void defend(Army army) {
        System.out.println("==========Army defended==========");
        for (Soldier soldier : army.getSoldiers()) {
            if (soldier instanceof Defensive defensive) {
                defensive.defense();
            } else if (soldier instanceof Adaptive adaptive) {
                adaptive.defense();
            } else if (soldier instanceof Supportive support) {
                support.supportDefense();
            }
        }
    }
}
