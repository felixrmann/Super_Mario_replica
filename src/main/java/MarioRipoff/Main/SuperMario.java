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

        String mapName = "test";

        BlockMap blockMap = new BlockMap(mapName, MapLoader.getMapWidth(mapName));
        RenderMap renderMap = new RenderMap(MapLoader.getMapWidth(mapName));
        renderMap.loadMapFromBlockMap(blockMap);

        primaryStage.setTitle("First test");
        primaryStage.setScene(new Scene(new Group(new BasicRenderer(renderMap, 6))));
        primaryStage.setOnCloseRequest(event -> System.exit(0));
        primaryStage.show();
        primaryStage.centerOnScreen();
        primaryStage.setResizable(false);
    }
}
