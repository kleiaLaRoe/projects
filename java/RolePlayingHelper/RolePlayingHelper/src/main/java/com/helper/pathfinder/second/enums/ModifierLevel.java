package com.helper.pathfinder.second.enums;

public enum ModifierLevel {

    Terrible("Terrible"),
    Low("Low"),
    Moderate("Moderate"),
    High("High"),
    Extreme("Extreme"),
    Limited("Limited"),
    Unlimited("Unlimited");

    private final String level;

    ModifierLevel(String level) { this.level = level; }

    @Override
    public String toString() { return this.level; }
}
