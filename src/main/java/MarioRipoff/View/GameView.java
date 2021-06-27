package MarioRipoff.View;

import MarioRipoff.Loader.MapLoader;
import MarioRipoff.Model.BlockMap;
import MarioRipoff.Model.RenderMap;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 27
 */

public class GameView extends Stage {

    public GameView(){

        String mapName = "test";

        BlockMap blockMap = new BlockMap(mapName, MapLoader.getMapWidth(mapName));
        RenderMap renderMap = new RenderMap(MapLoader.getMapWidth(mapName));
        renderMap.loadMapFromBlockMap(blockMap);

        setTitle("First test");
        setScene(new Scene(new Group(new BasicRenderer(renderMap, 6))));
        setOnCloseRequest(event -> System.exit(0));
        show();
        centerOnScreen();
        setResizable(false);
    }
}
