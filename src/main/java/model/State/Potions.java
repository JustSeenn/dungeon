package model.State;

import model.Player.ClassesPlayer;
import model.State.Item;

public class Potions implements Item{
    private int pv;

    public Potions(int pv) {
        this.pv = pv;
    }

    @Override
    public void equip(ClassesPlayer player) {
        player.setpV(player.getpV() + this.pv);
    }

    @Override
    public String showDetails() {
        return "Une potion +" + this.pv + " pv\n";
    }
}
