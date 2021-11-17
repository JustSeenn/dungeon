package view;

import javafx.scene.text.*;
import model.Player.ClassesPlayer;
import model.Player.Move;
import model.Player.PlayerSingleton;

public class JavaFXView implements View{

    public Text text = new Text(100,100, "Bienvenue dans notre rogue like");

    public void handleMove(Move move){
        text.setText(move.message);
    }
}
