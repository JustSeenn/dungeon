package controller;

import model.Player.ClassesPlayer;
import model.Player.PlayerSingleton;
import model.Player.Warrior;
import model.State.InGame;
import view.JavaFXViewSingleton;

public class GameControlerSingleton {
    private static Boolean instance=false;
    public static GameControler gc;

    public GameControlerSingleton() {
        instance = true;
        gc = new GameControler();
    }

    public static GameControler getGameControler(){
        if(!instance){
            System.out.println("Je crée un GameControler");
            new GameControlerSingleton();

        }
        return gc;
    }
}
