package controller;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import model.Player.ClassesPlayer;
import model.Player.PlayerSingleton;

import java.io.IOException;
import java.net.URISyntaxException;

public class JavaFXController {
    EventHandler<? super KeyEvent> eventHandler;

    public JavaFXController(GameControler gc){

     eventHandler = new EventHandler<KeyEvent>() {
        @Override
        public void handle(KeyEvent event) {
            System.out.println(GameControlerSingleton.getGameControler().getState());
            switch (event.getCode()) {
                case UP:    gc.goNorth(); break;
                case DOWN:  gc.goSouth(); break;
                case LEFT:  gc.goWest(); break;
                case RIGHT: gc.goEast(); break;
                case Z: gc.goNorth(); break;
                case S: gc.goSouth(); break;
                case Q: gc.goWest(); break;
                case D: gc.goEast(); break;
                case I: gc.openInventory();
                case E: PlayerSingleton.getPlayer().room.interact(); break;
                case ESCAPE: gc.closeInventory(); break;




            }
        }
    }; }
}
