package com.helper.pathfinder.second;

import com.helper.pathfinder.second.enums.ModifierLevel;
import javafx.util.Pair;
import org.javatuples.Quartet;
import org.javatuples.Triplet;

import java.util.Collection;

public class PathfinderService {
    private Integer level;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Pair<ModifierLevel, Integer> getDifficultyClass() {
        return difficultyClass;
    }

    public void setDifficultyClass(Pair<ModifierLevel, Integer> difficultyClass) {
        this.difficultyClass = difficultyClass;
    }

    public Pair<ModifierLevel, Integer> getSpellAttackBonus() {
        return spellAttackBonus;
    }

    public void setSpellAttackBonus(Pair<ModifierLevel, Integer> spellAttackBonus) {
        this.spellAttackBonus = spellAttackBonus;
    }

    public Pair<ModifierLevel, Integer> getFortitudeSave() {
        return fortitudeSave;
    }

    public void setFortitudeSave(Pair<ModifierLevel, Integer> fortitudeSave) {
        this.fortitudeSave = fortitudeSave;
    }

    public Pair<ModifierLevel, Integer> getReflexSave() {
        return reflexSave;
    }

    public void setReflexSave(Pair<ModifierLevel, Integer> reflexSave) {
        this.reflexSave = reflexSave;
    }

    public Pair<ModifierLevel, Integer> getWillSave() {
        return willSave;
    }

    public void setWillSave(Pair<ModifierLevel, Integer> willSave) {
        this.willSave = willSave;
    }

    public Pair<ModifierLevel, Pair<Integer, Integer>> getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(Pair<ModifierLevel, Pair<Integer, Integer>> hitPoints) {
        this.hitPoints = hitPoints;
    }

    public Pair<ModifierLevel, Integer> getStrikeBonus() {
        return strikeBonus;
    }

    public void setStrikeBonus(Pair<ModifierLevel, Integer> strikeBonus) {
        this.strikeBonus = strikeBonus;
    }

    public Pair<ModifierLevel, Quartet<Integer, Integer, Integer, Integer>> getStrikeDamage() {
        return strikeDamage;
    }

    public void setStrikeDamage(Pair<ModifierLevel, Quartet<Integer, Integer, Integer, Integer>> strikeDamage) {
        this.strikeDamage = strikeDamage;
    }

    public Pair<ModifierLevel, Integer> getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(Pair<ModifierLevel, Integer> armorClass) {
        this.armorClass = armorClass;
    }

    public Pair<ModifierLevel, Integer> getPerception() {
        return perception;
    }

    public void setPerception(Pair<ModifierLevel, Integer> perception) {
        this.perception = perception;
    }

    public Pair<ModifierLevel, Integer> getStrength() {
        return strength;
    }

    public void setStrength(Pair<ModifierLevel, Integer> strength) {
        this.strength = strength;
    }

    public Pair<ModifierLevel, Integer> getDexterity() {
        return dexterity;
    }

    public void setDexterity(Pair<ModifierLevel, Integer> dexterity) {
        this.dexterity = dexterity;
    }

    public Pair<ModifierLevel, Integer> getConstitution() {
        return constitution;
    }

    public void setConstitution(Pair<ModifierLevel, Integer> constitution) {
        this.constitution = constitution;
    }

    public Pair<ModifierLevel, Integer> getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Pair<ModifierLevel, Integer> intelligence) {
        this.intelligence = intelligence;
    }

    public Pair<ModifierLevel, Integer> getWisdom() {
        return wisdom;
    }

    public void setWisdom(Pair<ModifierLevel, Integer> wisdom) {
        this.wisdom = wisdom;
    }

    public Pair<ModifierLevel, Integer> getCharisma() {
        return charisma;
    }

    public void setCharisma(Pair<ModifierLevel, Integer> charisma) {
        this.charisma = charisma;
    }

    public Collection<Pair<ModifierLevel, Integer>> getSkills() {
        return skills;
    }

    public void setSkills(Collection<Pair<ModifierLevel, Integer>> skills) {
        this.skills = skills;
    }

    public Collection<String> getLanguages() {
        return languages;
    }

    public void setLanguages(Collection<String> languages) {
        this.languages = languages;
    }

    public Collection<String> getResistances() {
        return resistances;
    }

    public void setResistances(Collection<String> resistances) {
        this.resistances = resistances;
    }

    public Collection<String> getImmunities() {
        return immunities;
    }

    public void setImmunities(Collection<String> immunities) {
        this.immunities = immunities;
    }

    public Collection<Pair<String, Integer>> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(Collection<Pair<String, Integer>> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public Pair<ModifierLevel, Triplet<Integer, Integer, Integer>> getAreaDamage() {
        return areaDamage;
    }

    public void setAreaDamage(Pair<ModifierLevel, Triplet<Integer, Integer, Integer>> areaDamage) {
        this.areaDamage = areaDamage;
    }
}
