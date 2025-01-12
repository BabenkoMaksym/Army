package bbn.domain;

import bbn.utils.ArmyUtils;

import java.util.List;

public class Army {

    private final List<Soldier> soldiers;


    public Army() {
        this.soldiers = ArmyUtils.createArmy();
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }
}
