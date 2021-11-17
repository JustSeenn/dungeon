package model.Room;

import java.util.Arrays;
import java.util.Stack;

public class Parcours {
    public int direction;
    public Stack<Room> rooms;

    public Parcours() {
        this.direction = -1;
        this.rooms = new Stack<Room>() ;
    }

    public Room restore(){
        return rooms.pop();
    }

    public void save(Room room){
        rooms.push(room);
    }

    public void setDirection(int direction){
        this.direction = direction;
    }
}
