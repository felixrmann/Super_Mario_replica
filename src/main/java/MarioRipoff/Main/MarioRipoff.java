package MarioRipoff.Main;

import MarioRipoff.Model.BlockMap;
import MarioRipoff.Model.RenderMap;
import MarioRipoff.View.BasicRenderer;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 21
 */

public class MarioRipoff extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        BlockMap blockMap = new BlockMap(10,10);
        RenderMap renderMap = new RenderMap(10,10);
        BasicRenderer basicRenderer = new BasicRenderer(renderMap, 7);

        /*
        JSONObject file = MapLoader.loadMap("test");
        System.out.println(file.get("mapName"));
        System.out.println(file.get("mapHeight"));
        System.out.println(file.get("mapWidth"));

         */

        /*
        // getScreenSize() returns the size
        // of the screen in pixels
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

        // width will store the width of the screen
        int width = (int)size.getWidth();

        // height will store the height of the screen
        int height = (int)size.getHeight();

        System.out.println("Current Screen resolution : "
                + "width : " + width
                + " height : " + height);

         */
    }
}
