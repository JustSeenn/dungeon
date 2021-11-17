package model.Generator;

import controller.GameControler;
import model.Entitites.Chest;
import model.Entitites.Entities;
import model.Entitites.Monster;
import model.Player.ClassesPlayer;
import model.Player.Weapons;
import model.Room.Room;
import model.Room.SimpleRoom;
import view.View;

import java.util.Arrays;
import java.util.Random;

public class RoomGenerator implements Generator{
    Random rand = new Random();


    public Room generate(GameControler gc) {
        Entities entities = generateEntitiy();
        boolean[] doors = generateDoors();
        System.out.println(Arrays.toString(doors));
        return new SimpleRoom(entities, doors);
    }

    public Room generate( int direction, Room room) {
        Entities entities = generateEntitiy();
        boolean[] doors = generateDoors();
        /**TODO**/
        if(!doors[(direction+2)%4]) doors[(direction+2)%4] = true;
        return new SimpleRoom(entities, doors, room.controler);
    }

    public Entities generateEntitiy(){
        if(rand.nextInt(3) == 2){
            return new Chest(new ItemGenerator().generate()); /** TODO **/
        }else{
            return new Monster(1000000,1000000000,null);
        }
    }

    public boolean[] generateDoors(){
        boolean[] b = new boolean[4];
        int count = 0;
        for(int i=0; i< 4 ; i++){
            b[i] = rand.nextBoolean();
        }
        for(boolean t : b){
            if(!t) count ++;
        }
        if(count == 4) b[rand.nextInt(4)] = true;
        return b;
    }


    @Override
    public Object generate(Object... o) {
        return null;
    }
}
