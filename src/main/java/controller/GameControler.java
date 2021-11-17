package controller;

import model.Player.ClassesPlayer;
import model.State.InGame;
import model.State.State;

import java.io.IOException;
import java.net.URISyntaxException;

public class GameControler {
    private State state;

    public GameControler() {
        this.state = new InGame();
    }

    public void changeState(State state){
        System.out.println("Change state" + state);
        this.state = state;
    }

    public void openInventory(){
        state.openInventory();
    }
    public void closeInventory(){
        state.closeInventory();
    }


    public void goNorth() {
        state.goNorth();
    }


    public void goEast() { state.goEast();}


    public void goSouth() { state.goSouth();}


    public void goWest() {state.goWest();}

    public void startFight() {
        state.startFight();
    }

    public void endFight() {
        state.endFight();
    }

    public void pause() {
        state.pause();
    }

    public void gameOver(){
        state.gameOver();
    }

    public void titleScreen() {
        state.titleScreen();
    }

    public State getState(){
        return state;
    }
}
