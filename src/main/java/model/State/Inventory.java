package model.State;

import controller.GameControler;
import controller.GameControlerSingleton;
import model.Player.ClassesPlayer;
import model.Player.Move;
import view.JavaFXViewSingleton;

import java.util.Arrays;
import java.util.List;

public class Inventory extends State{

    private List<Item> items;
    private ClassesPlayer player;

    public Inventory(List<Item> items, ClassesPlayer player) {
        this.items = items;
        this.player = player;
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

    public void openInventory(){
    }

    public void closeInventory(){
        GameControlerSingleton.getGameControler().changeState(new InGame());
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

    public String showItem(int index){
        return items.get(index).showDetails();
    }

    public String showItem(){
        StringBuilder result = new StringBuilder(" ");
        for(Item i : items){
            result.append(i.showDetails());
        }
        return result.toString();
    }

    public int length(){ return items.size(); }
    public void useItem(int index){
         items.get(index).equip(player);
         JavaFXViewSingleton.getView().handleMove(new Move("Vous vous êtes équipé de " + showItem(index)));
    }
    public void addItem(Item... items){
        this.items.addAll(Arrays.asList(items));
    }

}
