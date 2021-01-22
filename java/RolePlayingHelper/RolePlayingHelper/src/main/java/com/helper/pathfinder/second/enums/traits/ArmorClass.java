package com.helper.pathfinder.second.enums.traits;

public enum ArmorClass {

    MuchHigher(10),
    Higher(5),
    Lower(-5),
    MuchLower(-10);

    private final int armorDifference;

    ArmorClass(int armorDifference) { this.armorDifference = armorDifference; }
}
