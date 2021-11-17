package model.State;

import controller.GameControler;

import java.io.IOException;
import java.net.URISyntaxException;

public abstract class State {

    public abstract void goNorth();
    public abstract void goEast();
    public abstract void goSouth();
    public abstract void goWest();

    public abstract void openInventory();
    public abstract void closeInventory();
    public abstract void startFight();
    public abstract void endFight();
    public abstract void pause();
    public abstract void gameOver() ;
    public abstract void titleScreen();
}
