package model.Generator;

import model.Player.Weapons;
import model.State.Item;
import model.State.Potions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ItemGenerator implements Generator{
    private final Random rand = new Random();
    @Override
    public List<Item> generate(Object... o) {

        int bound = rand.nextInt(5)+1;
        List<Item> items = new ArrayList<>();
        /* TODO mettre à jour la strength en fonction du lvl du player **/
        for(int i=0; i<bound; i++){
            if(rand.nextInt(2) == 1)
                items.add(new Weapons(10));
            else
                items.add(new Potions(10));
        }
        return items;
    }


}
