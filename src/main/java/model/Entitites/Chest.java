package model.Entitites;
import controller.GameControler;
import controller.GameControlerSingleton;
import controller.JavaFXController;
import model.State.InGame;
import model.State.Item;
import model.Player.*;
import view.ConsoleView;
import view.JavaFXView;
import view.JavaFXViewSingleton;
import view.View;

import java.util.Arrays;
import java.util.List;

public class Chest extends Entities{

    public List<Item> content;
    public boolean isAlive;

    public Chest(List<Item> content) {
        this.content = content;
    }

    @Override
    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public void interact() {
        for(Item i : content){
            PlayerSingleton.getPlayer().inventory.addItem(i);
        }
        System.out.println("Tu as pris le coffre");
        JavaFXViewSingleton.getView().handleMove(new Move("Vous avez récupéré le contenu du coffre"));
        GameControlerSingleton.getGameControler().changeState(PlayerSingleton.getPlayer().inventory);

    }

    @Override
    public String getObject() {
        StringBuilder Scontent= new StringBuilder(" ");
        for(Item i : content){
            Scontent.append(i.showDetails());
        }
        return "un coffre !!! \n Il contient"  + Scontent;
    }

    public void setContent(List<Item> items){
        content = items;
    }
}
