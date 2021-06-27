package MarioRipoff.Main;

import MarioRipoff.Loader.MapLoader;
import MarioRipoff.Model.BlockMap;
import MarioRipoff.Model.RenderMap;
import MarioRipoff.View.BasicRenderer;
import MarioRipoff.View.GameView;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.json.JSONObject;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 17
 */

public class SuperMario extends Application {

    @Override
    public void start(Stage primaryStage) {
        new GameView();
    }
}
