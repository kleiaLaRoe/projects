package com.helper.pathfinder.second.enums;

public enum ModifierLevel {

    Low("Low"),
    Moderate("Moderate"),
    High("High"),
    Extreme("Extreme");

    private final String level;

    ModifierLevel(String level) { this.level = level; }

    @Override
    public String toString() { return this.level; }
}
