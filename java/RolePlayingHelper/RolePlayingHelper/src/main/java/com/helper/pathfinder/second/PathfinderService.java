package com.helper.pathfinder.second;

import com.helper.pathfinder.second.enums.ModifierLevel;
import com.sun.media.sound.ModelIdentifier;
import javafx.util.Pair;
import org.javatuples.Quartet;
import org.javatuples.Triplet;

import java.util.Collection;

public class PathfinderService {
    private int level;
    private Pair<ModifierLevel, Integer> difficultyClass;
    private Pair<ModifierLevel, Integer> spellAttackBonus;
    private Pair<ModifierLevel, Integer> fortitudeSave;
    private Pair<ModifierLevel, Integer> reflexSave;
    private Pair<ModifierLevel, Integer> willSave;
    private Pair<ModifierLevel, Pair<Integer, Integer>> hitPoints;
    private Pair<ModifierLevel, Integer> strikeBonus;
    private Pair<ModifierLevel, Quartet<Integer, Integer, Integer, Integer>> strikeDamage;
    private Pair<ModifierLevel, Integer> armorClass;
    private Pair<ModifierLevel, Integer> perception;
    private Pair<ModifierLevel, Integer> strength;
    private Pair<ModifierLevel, Integer> dexterity;
    private Pair<ModifierLevel, Integer> constitution;
    private Pair<ModifierLevel, Integer> intelligence;
    private Pair<ModifierLevel, Integer> wisdom;
    private Pair<ModifierLevel, Integer> charisma;
    private Collection<Pair<ModifierLevel, Integer>> skills;
    private Collection<String> languages;
    private Collection<String> resistances;
    private Collection<String> immunities;
    private Collection<Pair<String, Integer>> weaknesses;
    private Pair<ModifierLevel, Triplet<Integer, Integer, Integer>> areaDamage;

}
