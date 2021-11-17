package model.State;

import controller.GameControler;
import controller.GameControlerSingleton;
import model.Entitites.Monster;
import model.Player.ClassesPlayer;
import model.Player.Move;
import model.Player.PlayerSingleton;
import view.View;

import java.util.Scanner;

public class InGame extends State{
    public InGame() {

    }

    @Override
    public void goNorth() {
        PlayerSingleton.getPlayer().goNorth();
    }

    @Override
    public void goEast() {
        PlayerSingleton.getPlayer().goEast();

    }

    @Override
    public void goSouth() {
        PlayerSingleton.getPlayer().goSouth();

    }

    @Override
    public void goWest() {
        PlayerSingleton.getPlayer().goWest();

    }

    @Override
    public void openInventory() {
        ClassesPlayer player = PlayerSingleton.getPlayer();
        String inventoryContent = player.inventory.showItem().toString();
        player.view.handleMove(new Move("Vous ouvrez votre inventaire \n Il contient: " + inventoryContent + "\n Quel item voulez vous selectionner ? (1 - " + player.inventory.length() + ")"));
        GameControlerSingleton.getGameControler().changeState(player.inventory);

    }

    @Override
    public void closeInventory() {
    }

    @Override
    public void startFight() {
        if(PlayerSingleton.getPlayer().room.entities.getClass().equals(Monster.class))
            GameControlerSingleton.getGameControler().changeState(new Fight(PlayerSingleton.getPlayer(), (Monster) PlayerSingleton.getPlayer().room.entities));
    }

    @Override
    public void endFight() {
    }

    @Override
    public void pause() {

    }

    @Override
    public void gameOver() {

    }

    @Override
    public void titleScreen() {

    }
}
