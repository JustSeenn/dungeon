package model.Room;

public class RoomControler {
    public Parcours parcours;

    public RoomControler(Parcours parcours) {
        this.parcours = parcours;
    }

    public boolean isAccessible(Room room, int direction){
        return room.doors[direction];
    }

    public boolean isVisited(int direction){
        if(parcours.direction == -1) {
            parcours.setDirection(direction);
            return false;
        }
        boolean result = parcours.direction == (2 + direction)%4;
        parcours.setDirection(direction);
        return result;
    }
}
