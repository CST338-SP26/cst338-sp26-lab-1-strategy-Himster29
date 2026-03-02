/*
*Himansu Yapa
*CST338
*3/2/2026
*/

import java.util.HashMap;

public abstract class Monster {

    // ===== Variables =====
    protected Integer hp;
    protected Integer xp;
    protected Integer maxHP;
    protected HashMap<String, Integer> items;

    // ===== Constructor =====
    public Monster(Integer hp, Integer xp, Integer maxHP, HashMap<String, Integer> items) {
        this.hp = hp;
        this.xp = xp;
        this.maxHP = maxHP;
        this.items = items;
    }

    // ===== Methods =====
    public Integer getHp() {
        return null; // placeholder
    }

    public void setHp(Integer hp) {
        // placeholder
    }

    public Integer getXp() {
        return null; // placeholder
    }

    public HashMap<String, Integer> getItems() {
        return null; // placeholder
    }

    public void setItems(HashMap<String, Integer> items) {
        // placeholder
    }

    public Integer getMaxHP() {
        return null; // placeholder
    }

    @Override
    public boolean equals(Object obj) {
        return false; // placeholder
    }

    @Override
    public int hashCode() {
        return 0; // placeholders
    }

    @Override
    public String toString() {
        return ""; // placeholder
    }
}