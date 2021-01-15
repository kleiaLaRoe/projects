package com.helper.pathfinder.second.enums;

public enum Size {

    Tiny("Tiny"),
    Small("Small"),
    Medium("Medium"),
    Large("Large"),
    Huge("Huge"),
    Gargantuan("Gargantuan"),
    Colossal("Colossal");

    private final String size;

    Size(String size) { this.size = size; }

    @Override
    public String toString() { return this.size; }

}
