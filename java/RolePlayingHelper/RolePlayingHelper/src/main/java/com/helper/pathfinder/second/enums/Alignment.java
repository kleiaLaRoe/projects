package com.helper.pathfinder.second.enums;

import org.javatuples.Triplet;

import java.util.HashMap;

public enum Alignment {

    LawfulGood("LG", "Good", "Lawful"),
    NeutralGood("NG", "Good", "Neutral"),
    ChaoticGood("CG", "Good", "Chaotic"),
    LawfulNeutral("LN", "Neutral", "Lawful"),
    TrueNeutral("N", "Neutral", "Neutral"),
    ChaoticNeutral("CN", "Neutral", "Chaotic"),
    LawfulEvil("LE", "Evil", "Lawful"),
    NeutralEvil("NE", "Evil", "Neutral"),
    ChaoticEvil("CE", "Evil", "Chaotic");

    private static final HashMap<String, Alignment> BY_LABEL = new HashMap<>();
    private static final HashMap<String, Alignment> BY_ROW_VALUE = new HashMap<>();
    private static final HashMap<String, Alignment> BY_COLUMN_VALUE = new HashMap<>();

    static {
        for(Alignment alignment : values()) {
            BY_LABEL.put(alignment.label, alignment);
            BY_ROW_VALUE.put(alignment.rowValue, alignment);
            BY_COLUMN_VALUE.put(alignment.columnValue, alignment);
        }
    }

    private final String label;
    private final String rowValue;
    private final String columnValue;

    Alignment(String label, String rowValue, String columnValue) {
        this.label = label;
        this.rowValue = rowValue;
        this.columnValue = columnValue;
    }

    public static Alignment valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }

    @Override
    public String toString() { return this.columnValue + " " + this.rowValue; }
}
