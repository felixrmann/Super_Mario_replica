package MarioRipoff.Main;

import MarioRipoff.Loader.MapLoader;
import javafx.application.Application;
import javafx.stage.Stage;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 21
 */

public class MarioRipoff extends Application {

    @Override
    public void start(Stage primaryStage) {

        JSONObject object = MapLoader.loadMap("test");
        JSONObject object1 = (JSONObject) object.get("mapData");
        System.out.println(object1);
        JSONArray jsonArray = object1.getJSONArray("Dx");
        System.out.println(jsonArray);

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
