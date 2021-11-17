package model.State;

import controller.App;
import controller.GameControler;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class GameOver extends State {
    public GameOver(GameControler gameControler) {
        System.out.println("New game over");
    }

    @Override
    public void goNorth() {
    }

    @Override
    public void goEast() {

    }

    @Override
    public void goSouth() {

    }

    @Override
    public void goWest() {

    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public void startFight() {

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
