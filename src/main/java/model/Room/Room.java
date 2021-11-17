package model.Room;
import controller.GameControler;
import model.Entitites.Entities;
import model.Generator.RoomGenerator;
import model.Player.ClassesPlayer;
import model.Player.PlayerSingleton;
import view.JavaFXView;
import view.View;


public abstract class Room {
    private int id;
    public Entities entities;
    public boolean[] doors;
    public RoomControler controler ;
    ClassesPlayer player;
    Parcours parcours;

    public Room(Entities e, boolean[] b) {
        this.controler = new RoomControler(new Parcours());
        doors = b;
        entities = e;
        this.player = PlayerSingleton.getPlayer();
    }
    public Room(Entities e, boolean[] b,  RoomControler controler) {
        this.controler = controler;
        doors = b;
        entities = e;
        this.player = PlayerSingleton.getPlayer();

    }


    public Room enter(int direction) {
        if (controler.isVisited(direction)) {
            Room restore = controler.parcours.restore();
            controler.parcours.save(this);
            return restore;
        } else {
            controler.parcours.save(this);
            return new RoomGenerator().generate(direction, this);
        }
    }

    public void interact(){
        entities.interact();
    }


}
