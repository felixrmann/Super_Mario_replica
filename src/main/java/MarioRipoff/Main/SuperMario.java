package MarioRipoff.Main;

import MarioRipoff.Loader.MapLoader;
import MarioRipoff.Model.BlockMap;
import MarioRipoff.Model.RenderMap;
import MarioRipoff.View.BasicRenderer;
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
    public void start(Stage primaryStage) throws Exception {

        JSONObject map1Object = MapLoader.loadMap("test");

        BlockMap blockMap = new BlockMap("test", map1Object.getInt("mapWidth"), map1Object.getInt("mapHeight"));
        RenderMap renderMap = new RenderMap(10,10);
        renderMap.loadMapFromBlockMap(blockMap);

        primaryStage.setTitle("First test");
        primaryStage.setScene(new Scene(new Group(new BasicRenderer(renderMap, 6))));
        primaryStage.setOnCloseRequest(event -> System.exit(0));
        primaryStage.show();
        primaryStage.centerOnScreen();
        primaryStage.setResizable(false);
    }
}
