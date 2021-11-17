package model.Entitites;

import controller.GameControlerSingleton;
import controller.JavaFXController;
import javafx.scene.Scene;
import model.State.GameOver;
import model.State.Item;
import controller.GameControler;
import model.State.Fight;
import model.Player.*;
import model.Entitites.Entities;
import view.JavaFXView;
import view.JavaFXViewSingleton;
import view.View;

import java.util.Random;

public class Monster extends Entities{
    private int pv;
    private int strength;
    private int xp;
    private Item drop;

    public Monster(int pv, int strength, Item drop) {
        this.pv = pv;
        this.strength = strength;
        this.drop = drop;
    }

    @Override
    public boolean isAlive() {
        return this.pv > 0;
    }


    @Override
    public void interact() {
        System.out.println("New Fight");
        View view = JavaFXViewSingleton.getView();
        Fight fight = new Fight(PlayerSingleton.getPlayer(), this);
        GameControlerSingleton.getGameControler().changeState(fight);
        while(PlayerSingleton.getPlayer().getpV() > 0 && this.getPV()>0){
            fight.playerAttackMonster();
            System.out.println("Joueur attaque monstre, il n'a plus que " + this.pv);
            fight.monsterAttackPlayer();
        }
        if(PlayerSingleton.getPlayer().getpV() < 0 || this.getPV() < 0) {
            GameControlerSingleton.getGameControler().endFight();
        }
    }

    @Override
    public String getObject() {
        return "énorme monstre ayant" + pv + "pv et " + strength + "de force !";
    }

    public void setPV(int pv){
        this.pv = pv;
    }
    public int getPV(){
        return this.pv;
    }
    public int getStrength(){ return this.strength;};

    public Item getDrop() {
        return drop;
    }
}
