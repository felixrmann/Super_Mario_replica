package MarioRipoff.Main;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 21
 */

public class MarioRipoff extends Application {

    @Override
    public void start(Stage primaryStage) {

        //TODO test other Loader classes
        /*
        JSONObject file = MapLoader.loadMap("test");
        System.out.println(file.get("mapName"));
        System.out.println(file.get("mapHeight"));
        System.out.println(file.get("mapWidth"));

         */

        //TODO do something with the screen size
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
