package model.State;

import controller.GameControler;
import controller.GameControlerSingleton;
import model.Entitites.Monster;
import model.Player.*;
import view.JavaFXViewSingleton;

public class Fight extends State{
    private ClassesPlayer player;
    private Monster monster;


    public Fight(ClassesPlayer player, Monster monster) {
        super();

        this.player = player;
        this.monster = monster;

    }

    @Override
    public void goNorth() {}

    @Override
    public void goEast() {}

    @Override
    public void goSouth() {}

    @Override
    public void goWest() {}

    @Override
    public void openInventory() {}

    @Override
    public void closeInventory() {}

    @Override
    public void startFight() {

    }

    @Override
    public void endFight() {
        if(!monster.isAlive()){
            player.inventory.addItem(monster.getDrop());
            JavaFXViewSingleton.getView().handleMove(new Move("Bravo vous avez gagné le combat"));
            GameControlerSingleton.getGameControler().changeState(new InGame());
        }else if(player.getpV() <= 0 ){
            JavaFXViewSingleton.getView().handleMove(new Move("Vous êtes mort"));
            GameControlerSingleton.getGameControler().changeState(new GameOver(GameControlerSingleton.getGameControler()));
        }
        System.out.println(GameControlerSingleton.getGameControler().getState());

    }

    @Override
    public void pause() {
        /** TODO **/
    }

    @Override
    public void gameOver() {

    }

    @Override
    public void titleScreen() {
    }

    public void playerAttackMonster(){
        monster.setPV(monster.getPV() - player.getStrength());
    }

    public void monsterAttackPlayer(){
        player.setpV(player.getpV() - monster.getStrength());
    }

}
