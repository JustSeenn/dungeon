package view;

import model.Player.Move;

public class ConsoleView implements View {

    @Override
    public void handleMove(Move move){
        System.out.println(move.message);
    }
}
