package model.Player;

import controller.GameControler;
import model.Generator.RoomGenerator;
import model.Room.Room;
import model.State.Inventory;
import view.View;

public abstract class ClassesPlayer {
    public int pV;
    public int strength;
    public int level;
    public Inventory inventory;
    public Room room;
    public View view;

    public ClassesPlayer(View view, int pV, int strength, int level, Inventory inventory) {
        this.view = view;
        this.pV = pV;
        this.strength = strength;
        this.level = level;
        this.inventory = inventory;
        this.room = new RoomGenerator().generate(new GameControler());
        this.view = view;
    }
    /** NORTH = 1 ; EAST = 3 ; SOUTH = 2 ; WEST = 6 **/
    public void goNorth(){
        if(room.controler.isAccessible(this.room, 0)) {
            this.room = room.enter(0);
            view.handleMove(new Move(generateContent(room)));
        }else {
            view.handleMove(new Move("You face a wall"));
        }
    }
    public void goEast() {
        System.out.println("You try to go East");

        if(room.controler.isAccessible(this.room, 1)){
            this.room = room.enter(1);
            view.handleMove(new Move(generateContent(room)));
        }else{
            view.handleMove(new Move("You face a wall"));
        }
    }
    public void goSouth() {
        System.out.println("You try to go South");

        if(room.controler.isAccessible(this.room, 2)){
            this.room = room.enter(2);
            view.handleMove(new Move(generateContent(room)));
        }else{
            view.handleMove(new Move("You face a wall"));
    }
    }
    public void goWest() {
        System.out.println("You try to go West");

        if(room.controler.isAccessible(this.room, 3)){
            this.room = room.enter(3);
            view.handleMove(new Move(generateContent(room)));
        }else{
            view.handleMove(new Move("You face a wall"));
        }
    }

    public void lookNorth(){
        if(room.controler.isAccessible(this.room, 1)){
            view.handleMove(new Move("You enter in a new Room"));
        }else{
            view.handleMove(new Move("You face a wall"));
            }
    }
    public void lookEast(){
        if(room.controler.isAccessible(this.room, 2)){
            view.handleMove(new Move("You enter in a new Room"));
        }else{
            view.handleMove(new Move("You face a wall"));
            }
    }
    public void lookSouth(){
        if(room.controler.isAccessible(this.room, 3)){
            view.handleMove(new Move("You enter in a new Room"));
        }else{
            view.handleMove(new Move("You face a wall"));
            }
    }
    public void lookWest(){
         if(room.controler.isAccessible(this.room, 4)){
            view.handleMove(new Move("You enter in a new Room"));
        }else{
            view.handleMove(new Move("You face a wall"));
            }
    }

    public int getpV() {
        return pV;
    }

    public int getStrength() {
        return strength;
    }

    public int getLevel() {
        return level;
    }

    public void setpV(int pV) {
        this.pV = pV;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String generateContent(Room room){
        return "Vous entrez dans une nouvelle salle ! \n En face de vous se trouve un " + room.entities.getObject();
    }
}
