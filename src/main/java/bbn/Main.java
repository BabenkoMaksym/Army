package bbn;

import bbn.domain.Army;
import bbn.utils.ArmyUtils;
import bbn.domain.Shaman;
import bbn.domain.Soldier;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Army army = new Army();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command:");
            System.out.println("1. REPORT");
            System.out.println("2. ATTACK");
            System.out.println("3. DEFEND");
            System.out.println("4. EXIT");
            String command = scanner.nextLine();
            int choice = Integer.parseInt(command);

            switch (choice) {
                case 1:
                    ArmyUtils.reportArmy(army);
                    break;
                case 2:
                    ArmyUtils.attack(army);
                    break;
                case 3:
                    ArmyUtils.defend(army);
                    break;
                case 4:
                    System.out.println("Exiting simulation.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}