package model.Room;

import controller.GameControler;
import model.Entitites.Entities;
import model.Player.ClassesPlayer;
import view.View;

public class SimpleRoom extends Room{
    public SimpleRoom(Entities entities, boolean[] doors, RoomControler controler) {
        super(entities,doors, controler);
    }
    public SimpleRoom(Entities entities, boolean[] doors ) {
        super(entities,doors);
    }
}
