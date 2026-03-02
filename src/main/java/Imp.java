/*
*Himansu Yapa
*CST338
*3/2/2026
*/

import java.util.HashMap;

public class Imp extends Monster {

    public Imp(Integer hp, Integer xp, Integer maxHP, HashMap<String, Integer> items) {
        super(hp, xp, maxHP, items);
    }

    @Override
    public String toString() {
       return hp + "/" + maxHP + " hp, xp: " + xp + ", items: " + items; // placeholder
    }
}