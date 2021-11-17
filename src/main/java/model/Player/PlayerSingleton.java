package model.Player;

import view.JavaFXViewSingleton;
import view.View;

public class PlayerSingleton {
    private static Boolean instance=false;
    public static ClassesPlayer player;

    public PlayerSingleton() {
        instance = true;
        player = new Warrior(JavaFXViewSingleton.getView(),10,10,1,null);
    }

    public static ClassesPlayer getPlayer(){
        if(!instance){
            System.out.println("Je crée un joueur");
            new PlayerSingleton();

        }
        return player;
    }
}
