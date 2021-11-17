package controller;

import model.Player.ClassesPlayer;
import model.Player.Warrior;
import view.ConsoleView;

import java.util.Scanner;

public class KeyBoardController {

    public void read() {
        ClassesPlayer player = new Warrior(new ConsoleView(),10,10,1,null);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter your move");
            switch (scanner.next()) {

            }

        }
    }
}
