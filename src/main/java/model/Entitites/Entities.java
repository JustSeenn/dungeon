package model.Entitites;
import controller.GameControler;
import model.Player.ClassesPlayer;
public abstract class Entities {
    public int id;
    public String name;


    public abstract boolean isAlive();
    public abstract void interact() ;
    public abstract String getObject();
}
