package controller;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Generator.ItemGenerator;
import model.Player.ClassesPlayer;
import model.Player.PlayerSingleton;
import model.State.InGame;
import model.State.Inventory;
import view.JavaFXView;
import view.JavaFXViewSingleton;

public class App extends Application {
    /*

    /**
     * The main entry point for all JavaFX applications.
     * The start method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     *
     * <p>
     * NOTE: This method is called on the JavaFX Application Thread.
     * </p>
     *
     * @param primaryStage the primary stage for this application, onto which
     *                     the application scene can be set.
     *                     Applications may create other stages, if needed, but they will not be
     *                     primary stages.
     * @throws Exception if something goes wrong
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();
        JavaFXView view = JavaFXViewSingleton.getView();
        Text message = view.text;
        root.getChildren().add(message);
        root.getChildren().add(new Canvas(400,200));
        Scene scene = new Scene(root);
        ClassesPlayer player = PlayerSingleton.getPlayer();
        GameControler gc = new GameControler();
        player.inventory = new Inventory(new ItemGenerator().generate(), player);
        JavaFXController javaFXController = new JavaFXController(GameControlerSingleton.getGameControler());
        scene.setOnKeyPressed(javaFXController.eventHandler);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
