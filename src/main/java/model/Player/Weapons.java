package model.Player;
import model.State.*;

public class Weapons implements Item{
    private int strength;


    public Weapons(int strength) {
        this.strength = strength;
    }

    @Override
    public void equip(ClassesPlayer player) {
        player.setStrength(player.getStrength() + this.strength);
    }

    @Override
    public String showDetails() {
        return "Epée[" + this.strength + "force]\n";
    }
}
